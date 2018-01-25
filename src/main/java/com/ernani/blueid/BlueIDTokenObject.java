package com.ernani.blueid;

import com.google.gson.annotations.SerializedName;

/**
 * @author Ernani Joppert Pontes Martins
 *
 */
public class BlueIDTokenObject {

	@SerializedName("iss")
	private String iss;

	@SerializedName("ext")
	private String ext;

	@SerializedName("at_hash")
	private String atHash;

	@SerializedName("sub")
	private String sub;

	@SerializedName("email_verified")
	private String emailVerified;

	@SerializedName("realmName")
	private String realmName;

	@SerializedName("uniqueSecurityName")
	private String uniqueSecurityName;

	@SerializedName("preferred_username")
	private String preferredUsername;

	@SerializedName("given_name")
	private String givenName;

	@SerializedName("aud")
	private String aud;

	@SerializedName("name")
	private String name;

	@SerializedName("exp")
	private String exp;

	@SerializedName("iat")
	private String iat;

	@SerializedName("family_name")
	private String familyName;

	@SerializedName("email")
	private String email;

	public String getIss() {
		return iss;
	}

	public String getExt() {
		return ext;
	}

	public String getAtHash() {
		return atHash;
	}

	public String getSub() {
		return sub;
	}

	public String getEmailVerified() {
		return emailVerified;
	}

	public String getRealmName() {
		return realmName;
	}

	public String getUniqueSecurityName() {
		return uniqueSecurityName;
	}

	public String getPreferredUsername() {
		return preferredUsername;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getAud() {
		return aud;
	}

	public String getName() {
		return name;
	}

	public String getExp() {
		return exp;
	}

	public String getIat() {
		return iat;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getEmail() {
		return email;
	}
}