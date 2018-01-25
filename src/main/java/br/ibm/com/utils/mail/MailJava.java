package br.ibm.com.utils.mail;

import java.util.List;
import java.util.Map;

public class MailJava {
	//indica se o formato de texto ser� texto ou html
	public static final String TYPE_TEXT_PLAIN = "text/plain";
	public static final String TYPE_TEXT_HTML = "text/html";
	//indica qual ser� o servidor de email(gmail, hotmail...)
	private String smtpHostMail;
	//indica a porta de acesso ao servidor
	private String smtpPortMail;
	private boolean ssl;
	//indica que a necessidade de autentica��o no servidor(true ou false)
	private String smtpAuth;
	//indica ao servidor que ele est� recebendo uma conex�o segura
	private String smtpStarttls;
	//nome do remetente do email
	private String fromNameMail;
	//email do remetente
	private String userMail;
	//senha do email do remetente
	private String passMail;
	//assunto do email
	private String subjectMail;
	//corpo do email, onde estar� o texto da mensagem
	private String bodyMail;
	//lista com email e nome dos destinat�rios
	private Map<String, String> toMailsUsers;
	private Map<String, String> ccMailsUsers;
	private Map<String, String> bccMailsUsers;
	//lista contendo os arquivos anexos
	private List<String> fileMails;
	//charset, no caso de html � necess�rio
	private String charsetMail;
	//tipo do formato da mensagem, texto ou html
	private String typeTextMail;
	
	public MailJava(){
		setSsl(false);
	}
	
	
	public Map<String, String> getCcMailsUsers() {
		return ccMailsUsers;
	}
	public void setCcMailsUsers(Map<String, String> ccMailsUsers) {
		this.ccMailsUsers = ccMailsUsers;
	}
	public Map<String, String> getBccMailsUsers() {
		return bccMailsUsers;
	}
	public void setBccMailsUsers(Map<String, String> bccMailsUsers) {
		this.bccMailsUsers = bccMailsUsers;
	}
	public String getSmtpHostMail() {
		return smtpHostMail;
	}
	public void setSmtpHostMail(String smtpHostMail) {
		this.smtpHostMail = smtpHostMail;
	}
	public String getSmtpPortMail() {
		return smtpPortMail;
	}
	public void setSmtpPortMail(String smtpPortMail) {
		this.smtpPortMail = smtpPortMail;
	}
	public boolean isSsl() {
		return ssl;
	}
	public void setSsl(boolean ssl) {
		this.ssl = ssl;
	}
	public String getSmtpAuth() {
		return smtpAuth;
	}
	public void setSmtpAuth(String smtpAuth) {
		this.smtpAuth = smtpAuth;
	}
	public String getSmtpStarttls() {
		return smtpStarttls;
	}
	public void setSmtpStarttls(String smtpStarttls) {
		this.smtpStarttls = smtpStarttls;
	}
	public String getFromNameMail() {
		return fromNameMail;
	}
	public void setFromNameMail(String fromNameMail) {
		this.fromNameMail = fromNameMail;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getPassMail() {
		return passMail;
	}
	public void setPassMail(String passMail) {
		this.passMail = passMail;
	}
	public String getSubjectMail() {
		return subjectMail;
	}
	public void setSubjectMail(String subjectMail) {
		this.subjectMail = subjectMail;
	}
	public String getBodyMail() {
		return bodyMail;
	}
	public void setBodyMail(String bodyMail) {
		this.bodyMail = bodyMail;
	}
	public Map<String, String> getToMailsUsers() {
		return toMailsUsers;
	}
	public void setToMailsUsers(Map<String, String> toMailsUsers) {
		this.toMailsUsers = toMailsUsers;
	}
	public List<String> getFileMails() {
		return fileMails;
	}
	public void setFileMails(List<String> fileMails) {
		this.fileMails = fileMails;
	}
	public String getCharsetMail() {
		return charsetMail;
	}
	public void setCharsetMail(String charsetMail) {
		this.charsetMail = charsetMail;
	}
	public String getTypeTextMail() {
		return typeTextMail;
	}
	public void setTypeTextMail(String typeTextMail) {
		this.typeTextMail = typeTextMail;
	}
	public static String getTYPE_TEXT_PLAIN() {
		return TYPE_TEXT_PLAIN;
	}
	public static String getTYPE_TEXT_HTML() {
		return TYPE_TEXT_HTML;
	}
}
