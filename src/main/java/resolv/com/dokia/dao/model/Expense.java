package resolv.com.dokia.dao.model;

public class Expense {
	
	private String typeExpense;
	private String codeExpense;
	private String descriptionExpense;
	private String releaseDay;
	private String idProcess;
	private String type;
	private String _id;
	private String _rev;
    
	public Expense(String typeExpense, String codeExpense, String descriptionExpense, String releaseDay, String idProcess, String _id, String _rev, String type) {
		this.typeExpense = typeExpense;
		this.codeExpense = codeExpense;
		this.descriptionExpense = descriptionExpense;
		this.releaseDay = releaseDay;
		this._id = _id;
		this._rev = _rev;
		this.type = type;
	}
	
	public Expense() {
		this.type = "EXPENSE";
	}

	public String getTypeExpense() {
		return typeExpense;
	}

	public void setTypeExpense(String typeExpense) {
		this.typeExpense = typeExpense;
	}

	public String getCodeExpense() {
		return codeExpense;
	}

	public void setCodeExpense(String codeExpense) {
		this.codeExpense = codeExpense;
	}

	public String getDescriptionExpense() {
		return descriptionExpense;
	}

	public void setDescriptionExpense(String descriptionExpense) {
		this.descriptionExpense = descriptionExpense;
	}

	public String getReleaseDay() {
		return releaseDay;
	}

	public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}

	public String getIdProcess() {
		return idProcess;
	}

	public void setIdProcess(String idProcess) {
		this.idProcess = idProcess;
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
