package resolv.com.dokia.dao.model;

public class Lot {

	private String code;
	private String type;
	private String _id;
	private String _rev;
	
	public Lot() {
		this.type = "LOT";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Lot(String code, String type, String _id, String _rev) {
		this.code = code;
		this.type = type;
		this._id = _id;
		this._rev = _rev;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
