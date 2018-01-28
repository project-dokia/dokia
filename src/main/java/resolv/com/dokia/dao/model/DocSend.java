package resolv.com.dokia.dao.model;

public class DocSend {
	 private ProcessUser process;
	 private Company company;
	 private Expense expense;
	 private User user;
	 private Wallet wallet;
	 private String lot;
	 private String cpf;
	 private String requestedValue;
	 private String type;
	 private String idExpense;
	 private String _id;
	 private String _rev;
	 private String approveRule;
	 private String approvePerson;
	 
	 public DocSend() {
		this.type = "DOCSEND";
	}

	public DocSend(String type, String requestedValue, String cpf, String lot, Wallet wallet, User user, Expense expense, Company company, ProcessUser processUser, String idExpense, String approveRule, String approvePerson) {
		this.process = processUser;
		this.company = company;
		this.expense = expense;
		this.user = user;
		this.wallet = wallet;
		this.lot = lot;
		this.type = type;
		this.cpf = cpf;
		this.user = user;
		this.idExpense = idExpense;
		this.requestedValue = requestedValue;
		this.approveRule = approveRule;
		this.approvePerson = approvePerson;
	}
	


	public String getApproveRule() {
		return approveRule;
	}

	public void setApproveRule(String approveRule) {
		this.approveRule = approveRule;
	}

	public String getApprovePerson() {
		return approvePerson;
	}

	public void setApprovePerson(String approvePerson) {
		this.approvePerson = approvePerson;
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

	public String getIdExpense() {
		return idExpense;
	}

	public void setIdExpense(String idExpense) {
		this.idExpense = idExpense;
	}

	public ProcessUser getProcess() {
		return process;
	}

	public void setProcess(ProcessUser process) {
		this.process = process;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Expense getExpense() {
		return expense;
	}

	public void setExpense(Expense expense) {
		this.expense = expense;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRequestedValue() {
		return requestedValue;
	}

	public void setRequestedValue(String requestedValue) {
		this.requestedValue = requestedValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	 
	
}
