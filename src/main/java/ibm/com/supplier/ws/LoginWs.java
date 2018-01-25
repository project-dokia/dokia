package ibm.com.supplier.ws;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.net.URI;
import java.net.URISyntaxException;

@Path("/login")
public class LoginWs {
	
	@Context HttpServletRequest request;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response initial() {
		String rt = "login....";
		String link = request.getRequestURI();
		System.out.println("/login, link="+link);
		
		String URI = "../";
		if(link!=null&&link.equals("/supplier/api/login"))URI = "https://localhost:4200/";
		
		URI url;
		try {
			url = new URI(URI);
			return Response.temporaryRedirect(url).build();
			//Response.seeOther(URI)
			//"Temporary Redirect" returns a 307 status code while "See Other" returns 303.
		} catch (URISyntaxException e) {
			System.out.println("Exception /login URISyntaxException e");
			e.printStackTrace();
		}
		
		// return HTTP response 200 in case of success
		return Response.status(200).entity(rt).build();
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
