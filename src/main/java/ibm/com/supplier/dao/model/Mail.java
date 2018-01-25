package ibm.com.supplier.dao.model;

import java.util.ArrayList;

public class Mail {
	private String _id;
	private String _rev;
	private String title;
	private String sender;
	private String recipient;
	private String content;
	private String status;
	private String typeMail;
	private String cn_last_update;
	private String uid_last_update;
	private String date_last_update;
	private String type;
	private ArrayList<Mail> logs = null;
	
	public Mail() {
		this.type = "MAIL";
	}
	
	public Mail(String _id, String _rev, String title, String sender, String recipient, String content, String status, String typeMail, String cn_last_update, String uid_last_update, String date_last_update) {
		this._id = _id;
		this._rev = _rev;
		this.title = title;
		this.sender = sender;
		this.recipient = recipient;
		this.content = content;
		this.status = status;
		this.typeMail = typeMail;
		this.cn_last_update = cn_last_update;
		this.uid_last_update = uid_last_update;
		this.date_last_update = date_last_update;
		this.type = "MAIL";
	}
	
	public void addLogs(Mail log) {
		if(logs == null) {
			logs = new ArrayList<Mail>();
		}
		this.logs.add(log);
	}
	
	public ArrayList<Mail> getLogs() {
		return this.logs;
	}

	public void setLogs(ArrayList<Mail> logs) {
		this.logs = logs;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTypeMail() {
		return typeMail;
	}

	public void setTypeMail(String type) {
		this.typeMail = type;
	}

	public String getCn_last_update() {
		return cn_last_update;
	}

	public void setCn_last_update(String cn_last_update) {
		this.cn_last_update = cn_last_update;
	}

	public String getUid_last_update() {
		return uid_last_update;
	}

	public void setUid_last_update(String uid_last_update) {
		this.uid_last_update = uid_last_update;
	}

	public String getDate_last_update() {
		return date_last_update;
	}

	public void setDate_last_update(String date_last_update) {
		this.date_last_update = date_last_update;
	}
	
	
	
}
