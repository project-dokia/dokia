package ibm.com.supplier.ws;

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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.FindByIndexOptions;
import com.cloudant.client.api.model.IndexField;
import com.cloudant.client.api.model.IndexField.SortOrder;
import com.cloudant.client.api.views.Key;
import com.cloudant.client.api.views.ViewResponse;

import br.ibm.com.utils.MyUtils;
import ibm.com.supplier.controller.UserController;
import ibm.com.supplier.dao.model.User;

@Path("/user") 
public class UserWS {
	@Context HttpServletRequest request;
	
	public UserController userController = new UserController();
	public User u = null;
	public ArrayList<Object> listAllUsers  = new ArrayList<Object>();
	private String tokenNextPage;
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Object insert(User user) {
		user.setLastModifiedData(new Date().toString());
		
		if(user != null) {
			Database conn = MyUtils.getStoredConnection(request);
			com.cloudant.client.api.model.Response resp = conn.save(user);
			System.out.println("id="+resp.getId());
		}
		return Response.status(200).entity("ok").build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Object update(User user) {
		user.setLastModifiedData(new Date().toString());
		
		com.cloudant.client.api.model.Response resp = null;
		try {
			u = getUser(user.get_id());
			user.setLogs(userController.userList);
			user.addLogs(u);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		if(user != null) {
			Database conn = MyUtils.getStoredConnection(request);
			resp = conn.update(user);	
		}
		return Response.status(200).entity(resp.getRev().toString()).build();
	}
	
	
	public User getUser(String id) throws IOException {
		Database conn = MyUtils.getStoredConnection(request);
		
		List<Object> list = conn.findByIndex("{\"_id\": \"" + id + "\"}", Object.class, new FindByIndexOptions());
		
		return userController.userText(list.get(0).toString());
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response verify() {	
		return Response.status(200).entity(getUsers(this.request)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/logs/{_id}")
	public Response logs(@PathParam("_id") String _id) {
		try {
			userController.userList = new ArrayList<User>();
			User user = getUser(_id);
			userController.userList.add(user);
			
			return Response.status(200).entity(userController.userList).build();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Response.status(500).entity(false).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{uid}")
	public Response getById(@PathParam("uid") String uid) {
		Database conn = MyUtils.getStoredConnection(request);
		List<Object> list = conn.findByIndex("{\"uid\": \"" + uid + "\"}", Object.class, new FindByIndexOptions());
		return Response.status(200).entity(list).build();
	}
	
	
	public User getByEmail(ServletRequest request, String email) {
		Database conn = MyUtils.getStoredConnection(request);
		List<Object> list = conn.findByIndex("{\"email\": \"" + email + "\"}", Object.class, new FindByIndexOptions());
		
		if(list.size() > 0) {
			return (User) userController.userText(list.get(0).toString());
		} else {
			return null;
		}
		
	}
	
	
	public List<User> getUsers(ServletRequest request) {
	
		Database conn = MyUtils.getStoredConnection(request);
		ViewResponse<String, Object> list = null;		
		try {
			
			list = conn.getViewRequestBuilder("user","user-view")
					.newRequest(Key.Type.STRING, Object.class)
					.includeDocs(true)
					.build()
					.getResponse();
			
			for(int i = 0; i < list.getRows().size(); i ++) {
				userController.listUser.add(userController.userText(list.getRows().get(i).getValue().toString()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		tokenNextPage = list.getNextPageToken();
		return userController.listUser;
	}
	
}
