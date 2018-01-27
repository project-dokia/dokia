package resolv.com.dokia.ws;

import java.io.IOException;
import java.util.ArrayList;

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
import com.google.gson.Gson;

import br.resolv.com.utils.MyUtils;
import resolv.com.dokia.dao.model.Cost;
import resolv.com.dokia.utils.LogTratative;

@Path("/cost") 
public class CostWS {
	@Context HttpServletRequest request;
	
	public ArrayList<Object> listAllCost  = new ArrayList<Object>();
	private Cost cost;
	private String costJson = null;
	private Gson gson = new Gson();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Object insert(Cost cost) {
		if(cost != null) {
			Database conn = MyUtils.getStoredConnection(request);
			com.cloudant.client.api.model.Response resp = conn.save(cost);
			System.out.println("id="+resp.getId());
		}
		return Response.status(200).entity("ok").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCost() {	
		
		Database conn = MyUtils.getStoredConnection(request);
		ViewResponse<String, Object> list = null;		
		try {
			
			list = conn.getViewRequestBuilder("cost","cost-view")
					.newRequest(Key.Type.STRING, Object.class)
					.includeDocs(true)
					.build()
					.getResponse();
			
			for(int i = 0; i < list.getRows().size(); i ++) {
				costJson = list.getRows().get(i).getValue().toString();
				costJson = LogTratative.replaceJson(costJson);
				
				gson = new Gson();
				cost = gson.fromJson(costJson.toString(), Cost.class);
				
				listAllCost.add(cost);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Response.status(200).entity(listAllCost).build();
	}
}