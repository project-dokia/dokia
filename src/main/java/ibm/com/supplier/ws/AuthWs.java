package ibm.com.supplier.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import javax.security.auth.Subject;
import javax.security.auth.login.CredentialExpiredException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.codec.binary.Base64;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ibm.json.java.JSONObject;
import com.ibm.websphere.security.WSSecurityException;
import com.ibm.websphere.security.auth.CredentialDestroyedException;
import com.ibm.websphere.security.auth.WSSubject;
import com.ibm.websphere.security.cred.WSCredential;
import com.ibm.wsspi.security.token.SingleSignonToken;

import ibm.com.supplier.dao.model.User;
import ibm.com.supplier.dao.model.UserW3id;
import ibm.com.supplier.dao.model.UserW3idToken;

@Path("/auth")
public class AuthWs {
	
	@Context HttpServletRequest request;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response initial() {
		
		System.out.println("GET /api/auth");
		String rt = "auth....";
		Subject subject = null;
		UserW3id user = null;
		User us = null;
		
		String[] id_token_parts = null;
		String payloadString = null;
		
		try {
			subject = com.ibm.websphere.security.auth.WSSubject.getCallerSubject();
			System.out.println("subject="+subject);
			
			if (subject != null) {
				WSCredential cred = (WSCredential) subject.getPublicCredentials(WSCredential.class).iterator().next();

				String email = cred.getAccessId().replace("user:W3IDRealm/", "");
				
				UserWS userws = new UserWS();
				List<User> users = null;
				users = userws.getUsers(this.request);
				
				User u = (User) userws.getByEmail(this.request, email);
				
				if(u != null) {
					if(u.getStatus().equals("S")) {
						u = new User();
						u.setStatus("S");
						u.setEmail(email);
						return Response.status(200).entity(u).build();
					}
				} else {
					u = new User();
					u.setStatus("S");
					return Response.status(200).entity(u).build();
				}
				
//				int count = 0;
//				for(User u : users) {
//					if(u.getEmail().equals(email)) {
//						count ++;
//					}
//				}
				
//				if(count == 0) {
//					User u = new User();
//					u.setStatus("S");
//					return Response.status(200).entity(u).build();
//				}
				
				
				if (cred != null) {
					user = new UserW3id(cred);
					us = new User();
					us.setEmailAddress(cred.getSecurityName());
					rt= ("   Realm: " + cred.getRealmName() + "<br><br>");
					rt+=("   Security Name: " + cred.getSecurityName() + "<br><br>");
					rt+=("   Unique ID: " + cred.getAccessId() + "<br><br>");
					rt+=("   Token Expiration: " + new Date(cred.getExpiration()) + "<br><br>");
					rt+=("   Token Object ID: " + cred.getOID() + "<br><br>");
					rt+=("   Group IDs:<br><br>");
					List<String> groups = cred.getGroupIds();
					for (String group : groups) {
						rt+=("      " + group + "<br><br>");
					}
					
				}
				
				SingleSignonToken sso = (SingleSignonToken) subject.getPrivateCredentials(SingleSignonToken.class)
						.iterator()
						.next();

				if (sso != null) {
					rt+=("SingleSignonToken Attributes:<br>");
					Enumeration attributes = sso.getAttributeNames();
					while (attributes.hasMoreElements()) {
						String attribute = (String) attributes.nextElement();
						String[] attributeValue = sso.getAttributes(attribute);
						rt+=("<br>" + attribute + ": [");
						for (int i = 0; i < attributeValue.length; i++) {
							rt+=(attributeValue[i]);
							if (i < attributeValue.length - 1)
								rt+=(", ");
						}
						rt+=("]<br>");
					}
				}
				
				Object o = this.request.getUserPrincipal();

				if (o == null) {
					rt+=("<br>request.getUserPrincipal() is null<br><br>");
				} else {
					rt+=("<br>And the current user is: " + o.toString() + "<br>");
				}

				rt+=("<br>Remote user: " + this.request.getRemoteUser() + "<br><br>");
				
				Set<Hashtable> privateHashtableCreds = subject.getPrivateCredentials(Hashtable.class);
				// there could be many.. we'll just take the one with id_token.
				for (Hashtable test : privateHashtableCreds) {
					Enumeration<String> enumer = test.keys();
					while (enumer.hasMoreElements()) {
						String key = (String) enumer.nextElement();
						if (key.equals("id_token")) {
							String id_token = test.get(key).toString();
							id_token_parts = id_token.split("\\.");
							byte[] payloadArray = Base64.decodeBase64(id_token_parts[1]);
							payloadString = new String(payloadArray);
							System.out.println("GET /auth payload="+payloadString);
							JsonParser jp = new JsonParser();
							JsonElement je = jp.parse(payloadString);
							//String prettyJsonString = gson.toJson(je);

							//user.setIdToken(gson.fromJson(je, UserW3idToken.class));
							//je.get
							
							ObjectMapper mapper = new ObjectMapper();
							
							try {
								UserW3idToken userToken = mapper.readValue(payloadString, UserW3idToken.class);
								System.out.println("us.uid="+us.getUid());
								user.setIdToken(userToken);
							} catch (JsonParseException e) {
								e.printStackTrace();
							} catch (JsonMappingException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							System.out.println("key: <b>" + key + "</b><br>");
							System.out.println("value: <br>");
							//System.out.println("<b>" + prettyJsonString + "</b><br><br>");
						}else if (key.equals("com.ibm.wsspi.security.cred.groups")) {
//							out.write("key: <b>" + key + "</b><br>");
//							out.write("value: <b>" + test.get(key).toString().replaceAll("[,]", ",<br>") + "</b><br><br>");
						} else {
//							out.write("key: <b>" + key + "</b><br>value: <b>" + test.get(key) + "</b><br><br>");
						}
					}
				}
				if(user!=null&&user.getIdToken()!=null) {
					if(us!=null) {
						us.setUid(user.getIdToken().getUid());
						us.setCn(user.getIdToken().getCn());
					}
				}
				
				
				
				return Response.status(200).entity(us).build();
				
				// return Response.status(401).entity("UNAUTHENTICATED").build();
				// return HTTP response 200 in case of success
				// return Response.status(200).entity(us).build();
			}
		} catch (WSSecurityException e1) {
			e1.printStackTrace();
		} catch (CredentialExpiredException e) {
			e.printStackTrace();
		} catch (CredentialDestroyedException e) {
			e.printStackTrace();
		}
		
		return Response.status(401).entity("UNAUTHENTICATED").build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response create(InputStream incomingData) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			String line = null;
			while ((line = in.readLine()) != null) {
				sb.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: - ");
		}
		System.out.println("Data Received: " + sb.toString());

		// return HTTP response 200 in case of success
		return Response.status(200).entity(sb.toString()).build();
	}

}
