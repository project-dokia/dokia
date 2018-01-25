package ibm.com.supplier.dao.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserW3idToken {

	private String sub;
	private String at_hash;
	private String realmName;
	private String iss;
	private String aud;
	private String exp;
	private String iat;
	private String nbf;
	private String emailAddress;
	private String lastName;
//	private List<String> blueGroups;
	private String clientIP;
	private String authMethod;
	private String userAgent;
	private String cn;
	private String dn;
	private String uid;
	private String firstName;
	
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getAt_hash() {
		return at_hash;
	}
	public void setAt_hash(String at_hash) {
		this.at_hash = at_hash;
	}
	public String getRealmName() {
		return realmName;
	}
	public void setRealmName(String realmName) {
		this.realmName = realmName;
	}
	public String getIss() {
		return iss;
	}
	public void setIss(String iss) {
		this.iss = iss;
	}
	public String getAud() {
		return aud;
	}
	public void setAud(String aud) {
		this.aud = aud;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getIat() {
		return iat;
	}
	public void setIat(String iat) {
		this.iat = iat;
	}
	public String getNbf() {
		return nbf;
	}
	public void setNbf(String nbf) {
		this.nbf = nbf;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//	public List<String> getBlueGroups() {
//		return blueGroups;
//	}
//	public void setBlueGroups(List<String> blueGroups) {
//		this.blueGroups = blueGroups;
//	}
	public String getClientIP() {
		return clientIP;
	}
	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}
	public String getAuthMethod() {
		return authMethod;
	}
	public void setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
