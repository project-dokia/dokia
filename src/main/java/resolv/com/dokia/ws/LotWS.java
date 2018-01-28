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
import resolv.com.dokia.dao.model.DocSend;
import resolv.com.dokia.dao.model.Lot;
import resolv.com.dokia.utils.LogTratative;

@Path("/lot") 
public class LotWS {
	@Context HttpServletRequest request;
	
	public DocSend d = null;
	public ArrayList<Object> listAllDocuments  = new ArrayList<Object>();
	private DocSend document;
	private String documentJson = null;
	private Gson gson = new Gson();
	String[] lots;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Object insert(Lot lot) {
		String id = "";
		if(lot != null) {
			Database conn = MyUtils.getStoredConnection(request);
			com.cloudant.client.api.model.Response resp = conn.save(lot);
			System.out.println("id="+resp.getId());
			id = resp.getId();
		}
		return Response.status(200).entity(id).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Object getLot(String type) {
		Database conn = MyUtils.getStoredConnection(request);
		ViewResponse<String, Object> list = null;		
		
		ArrayList<DocSend> docSendtlist = new ArrayList<DocSend>();
		
		try {
			
			list = conn.getViewRequestBuilder("lot","lot-view")
					.newRequest(Key.Type.STRING, Object.class)
					.includeDocs(true)
					.build()
					.getResponse();
			
			gson = new Gson();
			lots = new String[list.getRows().size()];
			
			for(int i = 0; i < list.getRows().size(); i ++) {
				String documentJson = list.getRows().get(i).getValue().toString();
				documentJson = LogTratative.replaceJson(documentJson);
				document = gson.fromJson(documentJson, DocSend.class);
				
				boolean contains = false;
				
				if(lots.length > 0) {
					for(String project : lots) {
						if(project == null) {
							project = "";
						} 
						
						if(project.equals(document.getLot())) {
							contains = true;
						}
					}
				}
				
				if(!contains) {
					lots[i] = document.getLot();
					docSendtlist.add(document);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Response.status(200).entity(docSendtlist).build();
	}
	
}
