package resolv.com.dokia.dao.model;

public class Company {

	private String nameReason;
	private String cnpj;
	private String type;
	private String _id;
	private String _rev;
    
	public Company(String nameReason, String cnpj, String _id, String _rev, String type) {
		this.nameReason = nameReason;
		this.cnpj = cnpj;
		this._id = _id;
		this._rev = _rev;
		this.type = type;
	}
	
	public Company() {
		this.type = "COMPANY";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNameReason() {
		return nameReason;
	}

	public void setNameReason(String nameReason) {
		this.nameReason = nameReason;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	
	
	
}
