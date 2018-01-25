package resolv.com.dokia.dao.model;

import java.awt.List;
import java.util.ArrayList;

public class User {

	private String type;
	private String name;
	private String age;
	private String _id;
	private String _rev;
    
	public User(String name, String age, String _id, String _rev) {
		this.name = name;
		this.age = age;
		this._id = _id;
		this._rev = _rev;
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