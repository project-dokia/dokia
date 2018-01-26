package resolv.com.dokia.dao.model;

public class Document {

	private String doc;
	private String name;
	private String type;
	private String _id;
	private String _rev;
    
	public Document(String doc, String name, String type) {
		this.doc = doc;
		this.name = name;
		this.type = type;
	}
	

	
	public String getDoc() {
		return doc;
	}



	public void setDoc(String doc) {
		this.doc = doc;
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



	public Document() {
		this.type = "DOCUMENT";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
