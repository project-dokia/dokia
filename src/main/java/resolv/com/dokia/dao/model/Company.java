package resolv.com.dokia.dao.model;

public class Company {

	private String typeCompany;
	private String name;
	private String type;
	private String _id;
	private String _rev;
    
	public Company(String name, String typeCompany, String _id, String _rev, String type) {
		this.name = name;
		this.typeCompany = typeCompany;
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
	
}
