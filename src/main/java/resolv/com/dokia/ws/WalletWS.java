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
import resolv.com.dokia.dao.model.Wallet;
import resolv.com.dokia.utils.LogTratative;

@Path("/wallet") 
public class WalletWS {
	@Context HttpServletRequest request;
	
	public Wallet w = null;
	public ArrayList<Object> listAllWallet  = new ArrayList<Object>();
	private Wallet wallet;
	private String walletJson = null;
	private Gson gson = new Gson();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Object insert(Wallet wallet) {
		if(wallet != null) {
			Database conn = MyUtils.getStoredConnection(request);
			com.cloudant.client.api.model.Response resp = conn.save(wallet);
			System.out.println("id="+resp.getId());
		}
		return Response.status(200).entity("ok").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/id/{_id}")
	public Response getWalletById(@PathParam("_id") String _id) {
		Database conn = MyUtils.getStoredConnection(request);
		List<Object> list = conn.findByIndex("{\"_id\": \"" + _id + "\"}", Object.class, new FindByIndexOptions());
		return Response.status(200).entity(list.get(0)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idCompany}")
	public Response getById(@PathParam("idCompany") String idCompany) {
		Database conn = MyUtils.getStoredConnection(request);
		List<Object> list = conn.findByIndex("{\"idCompany\": \"" + idCompany + "\"}", Object.class, new FindByIndexOptions());
		return Response.status(200).entity(list).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getWallets() {	
		
		Database conn = MyUtils.getStoredConnection(request);
		ViewResponse<String, Object> list = null;		
		try {
			
			list = conn.getViewRequestBuilder("wallet","wallet-view")
					.newRequest(Key.Type.STRING, Object.class)
					.includeDocs(true)
					.build()
					.getResponse();
			
			for(int i = 0; i < list.getRows().size(); i ++) {
				walletJson = list.getRows().get(i).getValue().toString();
				walletJson = LogTratative.replaceJson(walletJson);
				
				gson = new Gson();
				wallet = gson.fromJson(walletJson.toString(), Wallet.class);
				
				listAllWallet.add(wallet);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Response.status(200).entity(listAllWallet).build();
	}
}
