package resolv.com.dokia.dao.model;

import java.awt.List;
import java.util.ArrayList;

public class User {

	private String type;
	private String name;
	private String age;
	private String _id;
	private String _rev;
	private String idWallet;
    
	public User(String name, String age, String _id, String _rev, String idWallet) {
		this.name = name;
		this.age = age;
		this._id = _id;
		this._rev = _rev;
		this.idWallet = idWallet;
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



	public String getIdWallet() {
		return idWallet;
	}



	public void setIdWallet(String idWallet) {
		this.idWallet = idWallet;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
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
}