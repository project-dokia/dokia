package resolv.com.dokia.dao.model;

public class Wallet {

	private String typeWallet;
	private String name;
	private String type;
	private String _id;
	private String _rev;
    
	public Wallet(String name, String typeWallet, String _id, String _rev, String type) {
		this.name = name;
		this.typeWallet = typeWallet;
		this._id = _id;
		this._rev = _rev;
		this.type = type;
	}
	
	public Wallet() {
		this.type = "WALLET";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}