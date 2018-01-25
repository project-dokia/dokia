package ibm.com.supplier.ws;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ibm.com.supplier.dao.model.Sessao;

import java.net.URI;
import java.net.URISyntaxException;

@Path("/session")
public class SessionWs {
	
	@Context HttpServletRequest request;
//	@Context HttpServletResponse response;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response initial() {
		String rt = "session....";
		rt+=request.getRequestedSessionId();
		
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			System.out.println("cookie="+cookie.getName()+":"+cookie.getValue());
		}
		
		Sessao ss = new Sessao();
		ss.setRequestedSessionId(request.getRequestedSessionId());
		
		// return HTTP response 200 in case of success
		return Response.status(200).entity(ss).build();
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
