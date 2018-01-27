package resolv.com.dokia.dao.model;

import java.awt.List;
import java.util.ArrayList;

public class User {

	private String type;
	private String name;
	private String cpf;
	private String idSIR;
	private String _id;
	private String _rev;
	private String idWallet;
    
	public User(String name, String _id, String _rev, String idWallet, String cpf, String idSIR) {
		this.name = name;
		this._id = _id;
		this._rev = _rev;
		this.idWallet = idWallet;
		this.idSIR = idSIR;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf; 
	}

	public String getIdSIR() {
		return idSIR;
	}

	public void setIdSIR(String idSIR) {
		this.idSIR = idSIR;
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