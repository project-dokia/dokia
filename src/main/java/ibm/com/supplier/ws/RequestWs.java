package ibm.com.supplier.ws;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.views.Key;
import com.cloudant.client.api.views.ViewResponse;

import ibm.com.supplier.dao.model.Request;
import ibm.com.supplier.rules.RequestRule;
import ibm.com.supplier.utils.MailUtils;
import br.ibm.com.utils.MyUtils;

@Path("/request")
public class RequestWs {
	
	@Context HttpServletRequest request;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response verify() {
		String result = "/api/request Successfully started..."+new Date().toString();
		
		Database conn = MyUtils.getStoredConnection(request);
		ViewResponse<String, Object> list = null;
		try {
			list = conn.getViewRequestBuilder("requests","request-view")
					.newRequest(Key.Type.STRING, Object.class)
					.inclusiveEnd(true)
					.limit(10)
					.includeDocs(true)
					.descending(false)
					.build()
					.getResponse();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Response.status(200).entity(list).build();
	}
	
	@GET
	@Path("/new")
	@Produces(MediaType.APPLICATION_JSON)
	public Response newRequest() {
		Request req = new Request();
		req.setNumber(RequestRule.geraIdRequest());//"GENERATE-NUMBER"
		req.setStatus("Draft");
		req.setCountry("Brazil");
		
		// return HTTP response 200 in case of success
		return Response.status(200).entity(req).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response create(Request req) {
		System.out.println(req);
		if(req!=null) {
//			System.out.println("country="+req.getCountry());
//			System.out.println("type="+req.getType());
			Database conn = MyUtils.getStoredConnection(request);
			com.cloudant.client.api.model.Response resp = conn.save(req);
			System.out.println("id="+resp.getId());
		}
		
		return Response.status(200).entity("ok").build();
	}

}
