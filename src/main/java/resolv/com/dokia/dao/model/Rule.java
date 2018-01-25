package resolv.com.dokia.dao.model;

public class Rule {

	private String typeRule;
	private String name;
	private String type;
	private String _id;
	private String _rev;
    
	public Rule(String name, String typeRule, String _id, String _rev, String type) {
		this.name = name;
		this.typeRule = typeRule;
		this._id = _id;
		this._rev = _rev;
		this.type = type;
	}
	
	
	
	public String getTypeRule() {
		return typeRule;
	}



	public void setTypeRule(String typeRule) {
		this.typeRule = typeRule;
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



	public Rule() {
		this.type = "RULE";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
