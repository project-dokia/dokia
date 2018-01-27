package resolv.com.dokia.dao.model;

public class Cost {

	private String typeCost;
	private String name;
	private String type;
	private String _id;
	private String _rev;
    
	public Cost(String name, String typeCost, String _id, String _rev, String type) {
		this.name = name;
		this.typeCost = typeCost;
		this._id = _id;
		this._rev = _rev;
		this.type = type;
	}
	
	public Cost() {
		this.type = "COST";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeCost() {
		return typeCost;
	}

	public void setTypeCost(String typeCost) {
		this.typeCost = typeCost;
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
	
	
	
}
