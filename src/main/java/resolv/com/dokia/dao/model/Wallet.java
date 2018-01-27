package resolv.com.dokia.dao.model;

public class Wallet {

	private String code;
	private String description;
	private String type;
	private String _id;
	private String _rev;
	private String idCompany;
    
	public Wallet(String code, String description, String _id, String _rev, String type, String idCompany) {
		this.code = code;
		this.description = description;
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


	public String getCode() {
		return code;
	}




	public void setCode(String code) {
		this.code = code;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
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