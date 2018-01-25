package ibm.com.supplier.ws;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.security.auth.Subject;
import javax.security.auth.login.CredentialExpiredException;
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

import com.ibm.websphere.security.WSSecurityException;
import com.ibm.websphere.security.auth.CredentialDestroyedException;
import com.ibm.websphere.security.auth.WSSubject;
import com.ibm.websphere.security.cred.WSCredential;
import com.ibm.wsspi.security.token.SingleSignonToken;

@Path("/auth2")
public class AuthWs2 {
	
	@Context HttpServletRequest request;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response initial() {
		String rt = "auth....";
		Subject subject = null;
		
		try {
			subject = com.ibm.websphere.security.auth.WSSubject.getCallerSubject();
			
			if (subject != null) {
				WSCredential cred = (WSCredential) subject.getPublicCredentials(WSCredential.class).iterator().next();

				if (cred != null) {
					rt=("   Realm: " + cred.getRealmName() + "<br><br>");
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

				Object o = request.getUserPrincipal();

				if (o == null) {
					rt+=("<br>request.getUserPrincipal() is null<br><br>");
				} else {
					rt+=("<br>And the current user is: " + o.toString() + "<br>");
				}

				rt+=("<br>Remote user: " + request.getRemoteUser() + "<br><br>");
				
				// return HTTP response 200 in case of success
				return Response.status(200).entity(subject).build();
			}
		} catch (WSSecurityException e1) {
			e1.printStackTrace();
		} catch (CredentialExpiredException e) {
			e.printStackTrace();
		} catch (CredentialDestroyedException e) {
			e.printStackTrace();
		}
		
		return Response.status(401).entity("Unauthorized").build();
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
