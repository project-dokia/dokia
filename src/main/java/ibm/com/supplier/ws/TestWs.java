package ibm.com.supplier.ws;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ibm.com.supplier.dao.model.Request;

@Path("/test") // entry-point
public class TestWs{

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Request test() {
		System.out.println("Testes WS....");
		Request req = new Request();
		req.setNumber("2017-11-14 12:30:00");
		req.setCountry("Chile");
		return req;
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
