package resolv.com.dokia.dao.model;

public class Wallet {

	private String typeWallet;
	private String name;
	private String type;
	private String _id;
	private String _rev;
	private String idCompany;
    
	public Wallet(String name, String typeWallet, String _id, String _rev, String type, String idCompany) {
		this.name = name;
		this.typeWallet = typeWallet;
		this._id = _id;
		this._rev = _rev;
		this.type = type;
		this.idCompany = idCompany;
	}
	
	
	
	
	public String getIdCompany() {
		return idCompany;
	}




	public void setIdCompany(String idCompany) {
		this.idCompany = idCompany;
	}




	public String getTypeWallet() {
		return typeWallet;
	}



	public void setTypeWallet(String typeWallet) {
		this.typeWallet = typeWallet;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String get_id() {
		return _id;
	}



	public void set_id(String _id) {
		this._id = _id;
	}



	public String get_rev() {
		return _rev;
	}



	public void set_rev(String _rev) {
		this._rev = _rev;
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