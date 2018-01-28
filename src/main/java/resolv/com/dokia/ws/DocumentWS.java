package resolv.com.dokia.ws;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.FindByIndexOptions;
import com.cloudant.client.api.views.Key;
import com.cloudant.client.api.views.ViewResponse;
import com.google.gson.Gson;

import br.resolv.com.utils.MyUtils;
import resolv.com.dokia.dao.model.DocSend;
import resolv.com.dokia.dao.model.Expense;
import resolv.com.dokia.utils.LogTratative;

@Path("/document") 
public class DocumentWS {
	@Context HttpServletRequest request;
	
	public DocSend d = null;
	public ArrayList<Object> listAllDocuments  = new ArrayList<Object>();
	private DocSend document;
	private String documentJson = null;
	private Gson gson = new Gson();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Object insert(DocSend docSend) {
		String id = "";
		if(docSend != null) {
			Database conn = MyUtils.getStoredConnection(request);
			com.cloudant.client.api.model.Response resp = conn.save(docSend);
			System.out.println("id="+resp.getId());
			id = resp.getId();
		}
		return Response.status(200).entity(id).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idExpense}")
	public Response getById(@PathParam("idExpense") String idExpense) {
		Database conn = MyUtils.getStoredConnection(request);
		List<Object> list = conn.findByIndex("{\"idExpense\": \"" + idExpense + "\"}", Object.class, new FindByIndexOptions());
		return Response.status(200).entity(list).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/code/{code}")
	public Response getByCode(@PathParam("code") String code) {
		Database conn = MyUtils.getStoredConnection(request);
		List<Object> list = conn.findByIndex("{\"lot\": \"" + code + "\"}", Object.class, new FindByIndexOptions());
		return Response.status(200).entity(list).build();
	}
	
	
}