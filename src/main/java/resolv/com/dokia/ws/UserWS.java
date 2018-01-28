package resolv.com.dokia.ws;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletRequest;
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
import resolv.com.dokia.controller.UserController;
import resolv.com.dokia.dao.model.User;
import resolv.com.dokia.utils.LogTratative;


@Path("/user") 
public class UserWS {
	@Context HttpServletRequest request;
	
	public UserController userController = new UserController();
	public User u = null;
	public ArrayList<Object> listAllUsers  = new ArrayList<Object>();
	private User user;
	private String userJson = null;
	private Gson gson = new Gson();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Object insert(User user) {
		
		if(user != null) {
			Database conn = MyUtils.getStoredConnection(request);
			com.cloudant.client.api.model.Response resp = conn.save(user);
			System.out.println("id="+resp.getId());
		}
		return Response.status(200).entity("ok").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idWallet}")
	public Response getById(@PathParam("idWallet") String idWallet) {
		Database conn = MyUtils.getStoredConnection(request);
		List<Object> list = conn.findByIndex("{\"idWallet\": \"" + idWallet + "\"}", Object.class, new FindByIndexOptions());
		return Response.status(200).entity(list).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/id/{_id}")
	public Response getUserById(@PathParam("_id") String _id) {
		Database conn = MyUtils.getStoredConnection(request);
		List<Object> list = conn.findByIndex("{\"_id\": \"" + _id + "\"}", Object.class, new FindByIndexOptions());
		return Response.status(200).entity(list.get(0)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers() {	
		
		Database conn = MyUtils.getStoredConnection(request);
		ViewResponse<String, Object> list = null;		
		try {
			
			list = conn.getViewRequestBuilder("user","user-view")
					.newRequest(Key.Type.STRING, Object.class)
					.includeDocs(true)
					.build()
					.getResponse();
			
			for(int i = 0; i < list.getRows().size(); i ++) {
				userJson = list.getRows().get(i).getValue().toString();
				userJson = LogTratative.replaceJson(userJson);
				
				gson = new Gson();
				user = gson.fromJson(userJson.toString(), User.class);
				
				listAllUsers.add(user);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Response.status(200).entity(listAllUsers).build();
	}
}
