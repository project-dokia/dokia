package com.ernani.blueid;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import javax.security.auth.Subject;
import javax.security.auth.login.CredentialExpiredException;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.ServletSecurity.TransportGuarantee;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.ibm.websphere.security.WSSecurityException;
import com.ibm.websphere.security.auth.CredentialDestroyedException;
import com.ibm.websphere.security.auth.WSSubject;
import com.ibm.websphere.security.cred.WSCredential;
import com.ibm.wsspi.security.token.SingleSignonToken;

/**
 * Servlet implementation class UserDetails
 */
@WebServlet(urlPatterns = "/simples")
@ServletSecurity(value = @HttpConstraint(transportGuarantee = TransportGuarantee.CONFIDENTIAL))
public class UserDetails extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserDetails() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		printDetails(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void printWSCredentials(HttpServletRequest request, PrintWriter out) throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, CredentialExpiredException, CredentialDestroyedException, WSSecurityException {

		out.write("WebSphere Credential Information:<br><br>");
		out.write("<div style=\"border: 1px solid black; width: 50%; height: 200px; ");
		out.write("overflow-y: scroll; padding-left: 5px;\" contenteditable=\"true\">");

		Subject subject = com.ibm.websphere.security.auth.WSSubject.getCallerSubject();

		if (subject != null) {

			WSCredential cred = (WSCredential) subject.getPublicCredentials(WSCredential.class).iterator().next();

			if (cred != null) {

				out.write("   Realm: " + cred.getRealmName() + "<br><br>");
				out.write("   Security Name: " + cred.getSecurityName() + "<br><br>");
				out.write("   Unique ID: " + cred.getAccessId() + "<br><br>");
				out.write("   Token Expiration: " + new Date(cred.getExpiration()) + "<br><br>");
				out.write("   Token Object ID: " + cred.getOID() + "<br><br>");
				out.write("   Group IDs:<br><br>");

				List<String> groups = cred.getGroupIds();
				for (String group : groups) {
					out.write("      " + group + "<br><br>");
				}
			}

			SingleSignonToken sso = (SingleSignonToken) subject.getPrivateCredentials(SingleSignonToken.class)
					.iterator()
					.next();

			if (sso != null) {
				out.write("SingleSignonToken Attributes:<br>");
				Enumeration attributes = sso.getAttributeNames();
				while (attributes.hasMoreElements()) {
					String attribute = (String) attributes.nextElement();
					String[] attributeValue = sso.getAttributes(attribute);
					out.write("<br>" + attribute + ": [");
					for (int i = 0; i < attributeValue.length; i++) {
						out.write(attributeValue[i]);
						if (i < attributeValue.length - 1)
							out.write(", ");
					}
					out.write("]<br>");
				}
			}

			Object o = request.getUserPrincipal();

			if (o == null) {
				out.write("<br>request.getUserPrincipal() is null<br><br>");
			} else {
				out.write("<br>And the current user is: " + o.toString() + "<br>");
			}

			out.write("<br>Remote user: " + request.getRemoteUser() + "<br><br>");
		}

		out.write("</div>");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void printSubjectDetails(PrintWriter out) throws WSSecurityException {

		// we were authenticated using OIDC, and we want to obtain the
		// access_token, refresh_token and id_token that's part of this session.
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String[] id_token_parts = null;
		String payloadString = null;

		Subject s = WSSubject.getRunAsSubject();

		if (s != null) {

			Set<Hashtable> privateHashtableCreds = s.getPrivateCredentials(Hashtable.class);

			// there could be many.. we'll just take the one with id_token.
			for (Hashtable test : privateHashtableCreds) {

				Enumeration<String> enumer = test.keys();

				while (enumer.hasMoreElements()) {

					String key = (String) enumer.nextElement();

					if (key.equals("id_token")) {

						String id_token = test.get(key).toString();
						id_token_parts = id_token.split("\\.");

						// byte[] headerArray =
						// Base64.decodeBase64(id_token_parts[0]);
						// String headerString = new String(headerArray);
						byte[] payloadArray = Base64.decodeBase64(id_token_parts[1]);
						payloadString = new String(payloadArray);
						// byte[] jwtSignatureArray =
						// Base64.decodeBase64(id_token_parts[2]);
						// out.write("header array: \n" + headerString);
						// out.write("jwt signature: \n" + jwtSignatureString);

						JsonParser jp = new JsonParser();
						JsonElement je = jp.parse(payloadString);
						String prettyJsonString = gson.toJson(je);

						out.write("key: <b>" + key + "</b><br>");
						out.write("value: <br>");
						out.write("<b>" + prettyJsonString + "</b><br><br>");

					} else if (key.equals("com.ibm.wsspi.security.cred.groups")) {

						out.write("key: <b>" + key + "</b><br>");
						out.write("value: <b>" + test.get(key).toString().replaceAll("[,]", ",<br>") + "</b><br><br>");

					} else {
						out.write("key: <b>" + key + "</b><br>value: <b>" + test.get(key) + "</b><br><br>");
					}
				}
			}
		}

		// String id_token = theChosenOne.get("id_token").toString();
		BlueIDTokenObject myIDTokenObject = gson.fromJson(payloadString, BlueIDTokenObject.class);

		// print all id_token properties
		// this is for DEBUG and understanding of properties
		if (myIDTokenObject != null) {

			String ext = myIDTokenObject.getExt();

			out.write("<hr>");
			out.write("<p>Printing retrieved id_token values to screen do display name and values:</p>");
			out.write("ISS: <b>" + myIDTokenObject.getIss() + "</b><br>");
			out.write("EXT: <b>" + ext + "</b><br>");
			out.write("At Hash: <b>" + myIDTokenObject.getAtHash() + "</b><br>");
			out.write("Sub: <b>" + myIDTokenObject.getSub() + "</b><br>");
			out.write("Email Verified: <b>" + myIDTokenObject.getEmailVerified() + "</b><br>");
			out.write("Realm Name: <b>" + myIDTokenObject.getRealmName() + "</b><br>");
			out.write("Unique Security Name: <b>" + myIDTokenObject.getUniqueSecurityName() + "</b><br>");
			out.write("Preferred User Name: <b>" + myIDTokenObject.getPreferredUsername() + "</b><br>");
			out.write("Given Name: <b>" + myIDTokenObject.getGivenName() + "</b><br>");
			out.write("Audience: <b>" + myIDTokenObject.getAud() + "</b><br>");
			out.write("Name: <b>" + myIDTokenObject.getName() + "</b><br>");
			out.write("Expiration: <b>" + myIDTokenObject.getExp() + "</b><br>");
			out.write("Issued At: <b>" + myIDTokenObject.getIat() + "</b><br>");
			out.write("Family Name: <b>" + myIDTokenObject.getFamilyName() + "</b><br>");
			out.write("Email: <b>" + myIDTokenObject.getEmail() + "</b><br>");

			if (ext != null) {

				ExtTokenObject extTokenObj = gson.fromJson(ext, ExtTokenObject.class);

				if (extTokenObj != null) {

					String delimiter = ", <br>";
					String[] blueGroups = extTokenObj.getBlueGroups();
					String myBlueGroups = null;

					if (blueGroups != null) {
						//myBlueGroups = String.join(delimiter, extTokenObj.getBlueGroups());
					}

					out.write("Country: <b>" + extTokenObj.getCountry() + "</b><br>");
					out.write("BlueGroups: <b>" + myBlueGroups + "</b><br>");
					out.write("w3id UID: <b>" + extTokenObj.getW3idUid() + "</b><br>");
					out.write("Tennant Id: <b>" + extTokenObj.getTenantId() + "</b><br>");
					out.write("Company: <b>" + extTokenObj.getCompany() + "</b><br>");
				}
			}

			out.write("<hr>");
		}

		if (id_token_parts != null) {

			out.write("<br>");
			out.write("</pre>");

			out.write("<p>ID Token Structure and value:</p>");
			out.write("<p>Algorithm is: <span style=\"color: green\">color green</span>, ");
			out.write("Payload is: <span style=\"color: blue\">color blue</span>, ");
			out.write("Signature is: <span style=\"color: red\">color red</span><br><br>");
			out.write("You can copy the token value and go to ");
			out.write("<a href=\"https://jwt.io/#debugger-io\" target=\"_blank\">jwt.io</a> ");
			out.write("online debugger tool and paste the value in the <b>Encoded</b> ");
			out.write("form to debug the <b>id_token</b> values.</p>");

			out.write("<div style=\"border: 1px solid black; width: 50%; height: 200px; ");
			out.write("overflow-y: scroll;\" contenteditable=\"true\">");
			out.write("<span style=\"color: green\">");
			out.write(id_token_parts[0]);
			out.write("</span>");
			out.write(".");
			out.write("<span style=\"color: blue\">");
			out.write(id_token_parts[1]);
			out.write("</span>");
			out.write(".");
			out.write("<span style=\"color: red\">");
			out.write(id_token_parts[2]);
			out.write("</span></div>");
		}

		out.write("<br><hr><br>");

		out.write("Click <a href=\"/blueidtest/index.jsp\">index.jsp</a> to test sample JSP page.<br>");
		out.write("Click <a href=\"/blueidtest/logout.jsp\">logout.jsp</a> to perform logout.<br");
		out.write("<pre><div>");
	}

	private void printDetails(HttpServletRequest req, HttpServletResponse resp) {

		PrintWriter writer = null;

		try {

			writer = resp.getWriter();

			writer.write("<html><body>");
			writer.write("<title>UserDetails OIDC Servlet</title>");

			printWSCredentials(req, writer);

			writer.write("<hr>");
			writer.write("<pre>");

			printSubjectDetails(writer);

			writer.write("</pre></div>");
			writer.write("</body></html>");

		} catch(Exception e){
			
		}
//		catch (IOException | WSSecurityException | CredentialExpiredException | ClassNotFoundException
//				| NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
//				| InvocationTargetException | CredentialDestroyedException e) {
//
//			// log exception
//			if (writer != null) {
//				writer.write(e.getMessage());
//			}
//		}
	}
}
