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
import resolv.com.dokia.dao.model.Document;
import resolv.com.dokia.dao.model.Rule;
import resolv.com.dokia.utils.LogTratative;

@Path("/rule") 
public class DocumentWS {
	@Context HttpServletRequest request;
	
	public Document d = null;
	public ArrayList<Object> listAllDocuments  = new ArrayList<Object>();
	private Document document;
	private String documentJson = null;
	private Gson gson = new Gson();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Object insert(Rule rule) {
		
		
		return Response.status(200).entity("ok").build();
	}
	
	
}