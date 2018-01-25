package ibm.com.supplier.ws;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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

import br.ibm.com.utils.MyUtils;
import ibm.com.supplier.controller.MailController;
import ibm.com.supplier.dao.model.Mail;
import ibm.com.supplier.dao.model.User;
import ibm.com.supplier.utils.MailUtils;

@Path("/mail") 
public class MailWS {
	@Context HttpServletRequest request;
	private MailController mailController = new MailController();
	private Mail m = null;
	private ArrayList<Object> listAllUMails  = new ArrayList<Object>();
	private String tokenNextPage;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Object insert(Mail mail) {
		mail.setDate_last_update(new Date().toString());
		
		if(mail != null) {
			Database conn = MyUtils.getStoredConnection(request);
			com.cloudant.client.api.model.Response resp = conn.save(mail);
			System.out.println("id="+resp.getId());
		}
		return Response.status(200).entity("ok").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/logs/{_id}")
	public Response logs(@PathParam("_id") String _id) {
		try {
			mailController.mailList = new ArrayList<Mail>();
			Mail mail = getMail(_id);
			mailController.mailList.add(mail);
			
			return Response.status(200).entity(mailController.mailList).build();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Response.status(500).entity(false).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/send")
	public Object send(Mail mail) {
		Database conn = MyUtils.getStoredConnection(request);
		List<Mail> list = (List<Mail>) conn.findByIndex("{\"_id\": \"" + mail.get_id() + "\"}", Mail.class, new FindByIndexOptions());
		
		MailController mailController = new MailController();
		boolean result = mailController.sendEmail(list.get(0));
		
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{_id}")
	public Response getById(@PathParam("_id") String _id) {
		Database conn = MyUtils.getStoredConnection(request);
		List<Object> list = conn.findByIndex("{\"_id\": \"" + _id + "\"}", Object.class, new FindByIndexOptions());
		return Response.status(200).entity(list.get(0)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response verify() {				
		return Response.status(200).entity(getMails()).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/active")
	public Response getActiveMails() {		
		Database conn = MyUtils.getStoredConnection(request);
		
		ArrayList<Object> listMail = new ArrayList<Object>();
		ViewResponse<String, Object> list = null;		
		try {
			
			list = conn.getViewRequestBuilder("mail","mail-view-active")
					.newRequest(Key.Type.STRING, Object.class)
					.includeDocs(true)
					.build()
					.getResponse();
			
			for(int i = 0; i < list.getRows().size(); i ++) {
				listMail.add(list.getRows().get(i).getValue());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Response.status(200).entity(listMail).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/suspend")
	public Response getSuspendeMails() {		
		Database conn = MyUtils.getStoredConnection(request);
		
		ArrayList<Object> listMail = new ArrayList<Object>();
		ViewResponse<String, Object> list = null;		
		try {
			
			list = conn.getViewRequestBuilder("mail","mail-view-suspend")
					.newRequest(Key.Type.STRING, Object.class)
					.includeDocs(true)
					.build()
					.getResponse();
			
			for(int i = 0; i < list.getRows().size(); i ++) {
				listMail.add(list.getRows().get(i).getValue());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Response.status(200).entity(listMail).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Object update(Mail mail) {
		mail.setDate_last_update(new Date().toString());
		
		com.cloudant.client.api.model.Response resp = null;
		try {
			m = getMail(mail.get_id());
			mail.setLogs(mailController.mailList);
			mail.addLogs(m);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(mail != null) {
			Database conn = MyUtils.getStoredConnection(request);
			resp = conn.update(mail);	
		}
		return Response.status(200).entity(resp.getRev().toString()).build();
	}
	
	public Mail getMail(String id) throws IOException {
		Database conn = MyUtils.getStoredConnection(request);
		List<Object> list = conn.findByIndex("{\"_id\": \"" + id + "\"}", Object.class, new FindByIndexOptions());
		return mailController.mailText(list.get(0).toString());
	}
	
	private List<Mail> getMails() {
		Database conn = MyUtils.getStoredConnection(request);
		ViewResponse<String, Object> list = null;		
		try {
			
			list = conn.getViewRequestBuilder("mail","mail-view")
					.newRequest(Key.Type.STRING, Object.class)
					.includeDocs(true)
					.build()
					.getResponse();
			
			System.out.println(list.getTotalRowCount());
			for(int i = 0; i < list.getRows().size(); i ++) {
				System.out.println("index: " + i);
				mailController.listMail.add(mailController.mailText(list.getRows().get(i).getValue().toString()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		tokenNextPage = list.getNextPageToken();
		return mailController.listMail;
	}
}
