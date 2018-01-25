package ibm.com.supplier.dao.model;

import java.util.List;

import javax.security.auth.login.CredentialExpiredException;

import com.ibm.websphere.security.auth.CredentialDestroyedException;
import com.ibm.websphere.security.cred.WSCredential;

public class UserW3id {
	
	private String realmName;
	private String securityName;
	private String accessId;
	private long expiration;
	private String oid;
	private List<String> groupIds;
	
	private UserW3idToken idToken;
	
	public UserW3id(WSCredential cred) throws CredentialExpiredException, CredentialDestroyedException {
		realmName = cred.getRealmName();
		securityName = cred.getSecurityName();
		accessId = cred.getAccessId();
		expiration = cred.getExpiration();
		oid = cred.getOID();
		groupIds = cred.getGroupIds();
	}
	
	public String getRealmName() {
		return realmName;
	}
	public void setRealmName(String realmName) {
		this.realmName = realmName;
	}
	public String getSecurityName() {
		return securityName;
	}
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}
	public String getAccessId() {
		return accessId;
	}
	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}
	public long getExpiration() {
		return expiration;
	}
	public void setExpiration(long expiration) {
		this.expiration = expiration;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public List<String> getGroupIds() {
		return groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public UserW3idToken getIdToken() {
		return idToken;
	}

	public void setIdToken(UserW3idToken idToken) {
		this.idToken = idToken;
	}

}
