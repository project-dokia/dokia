package ibm.com.supplier.dao.model;

import java.awt.List;
import java.util.ArrayList;

public class User {

	private String type;
	private String emailAddress;
	private String uid;
	private String cn;
	
	private String _id;
	private String _rev;
	private String typeaccess;
	private String uidLastChange;
	private String cnChange;
	private String lastModifiedData;
    private String bio;
    private String email;
    private String location;
    private String notesid;
    private String officephone;
    private String country;
    private String status;
    private ArrayList<User> logs = null;
    
	public User(String _id, String _rev, String cn, String typeaccess, String uidLastChange, String cnChange, String lastModifiedData, String bio, String email, String location, String notesid, String officephone, String country, String status, ArrayList<User> logs) {
		this._id = _id;
		this._rev = _rev;
		this.cn = cn;
		this.typeaccess = typeaccess;
		this.uidLastChange = uidLastChange;
		this.lastModifiedData = lastModifiedData;
		this.bio = bio;
		this.email = email;
		this.location = location;
		this.notesid = notesid;
		this.country = country;
		this.logs = logs;
		this.status = status;
		this.cnChange = cnChange;
	}

	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}



	public String getCnChange() {
		return cnChange;
	}




	public void setCnChange(String cnChange) {
		this.cnChange = cnChange;
	}




	public void addLogs(User log) {
		if(logs == null) {
			logs = new ArrayList<User>();
		}
		this.logs.add(log);
	}
	
	public ArrayList<User> getLogs() {
		return this.logs;
	}

	public void setLogs(ArrayList<User> logs) {
		this.logs = logs;
	}



	public String getCountry() {
		return country;
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

	public void setCountry(String country) {
		this.country = country;
	}




	public String getBio() {
		return bio;
	}




	public void setBio(String bio) {
		this.bio = bio;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public String getNotesid() {
		return notesid;
	}




	public void setNotesid(String notesid) {
		this.notesid = notesid;
	}




	public String getOfficephone() {
		return officephone;
	}




	public void setOfficephone(String officephone) {
		this.officephone = officephone;
	}







	public String getUidLastChange() {
		return uidLastChange;
	}


	public void setUidLastChange(String uidLastChange) {
		this.uidLastChange = uidLastChange;
	}

	public String getLastModifiedData() {
		return lastModifiedData;
	}


	public void setLastModifiedData(String lastModifiedData) {
		this.lastModifiedData = lastModifiedData;
	}

	public String getTypeaccess() {
		return typeaccess;
	}



	public void setTypeaccess(String typeaccess) {
		this.typeaccess = typeaccess;
	}



	public User() {
		this.type = "USER";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		if (cn != null) {
			cn = cn.replaceAll("%20", " ");
			String[] cns = cn.split(" ");
			cn = "";
			for (String st : cns) {
				if (st.length() > 0) {
					cn += st.substring(0, 1).toUpperCase();
					if (st.length() > 1)
						cn += st.substring(1).toLowerCase();
					cn += " ";
				}
			}
			if(cn.endsWith(" "))cn=cn.substring(0,cn.length()-1);//retira ultimo caracter
		}
		this.cn = cn;
	}

}