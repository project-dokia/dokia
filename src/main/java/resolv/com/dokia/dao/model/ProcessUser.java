package resolv.com.dokia.dao.model;

public class ProcessUser {

	private String numberProcess;
	private String idUser;
	private String type;
	private String _id;
	private String _rev;
    
	public ProcessUser(String numberProcess, String idUser, String _id, String _rev, String type) {
		this.numberProcess = numberProcess;
		this.idUser = idUser;
		this._id = _id;
		this._rev = _rev;
		this.type = type;
	}
	
	public ProcessUser() {
		this.type = "PROCESS";
	}

	public String getNumberProcess() {
		return numberProcess;
	}

	public void setNumberProcess(String numberProcess) {
		this.numberProcess = numberProcess;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
