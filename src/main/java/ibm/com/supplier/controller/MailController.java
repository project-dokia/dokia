package ibm.com.supplier.controller;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ibm.com.supplier.dao.model.Mail;
import ibm.com.supplier.dao.model.User;
import ibm.com.supplier.utils.LogTratative;
import ibm.com.supplier.utils.MailUtils;

public class MailController {
	public boolean sendEmail(Mail mail) {
		try {
			MailUtils.SendMailSemAnexoFull(mail.getSender(), mail.getRecipient(), "", "", mail.getTitle(), mail.getContent()) ;
			return true;
		} catch (Exception e) {
			System.out.println("erro" + e.getMessage());
			return false;
		}
	}
	
	Mail mail = null;
	Gson gson = new Gson();
	public ArrayList<Mail> listMail = new ArrayList<Mail>();
	public ArrayList<Mail> mailList = new ArrayList<Mail>();
	String mailJson = null;
	
	public Mail mailText(String mailText) {
		mailJson = mailText;
		mailJson = LogTratative.replaceJson(mailJson);
		getLogs(mailText);
		mailJson = LogTratative.removeLogs(mailJson);
		mailJson = LogTratative.replaceLogs(mailJson);
		
		gson = new Gson();
		mail = gson.fromJson(mailJson.toString(), Mail.class);
		
		return mail;
	}
	
	public List<Mail> getLogs(String text) {
		int firstPos = 0;
		int lastPos = 0;
		String init = "logs=[{";
		String end = "}]";
		
		firstPos = text.indexOf(init) + init.length();
		lastPos = text.indexOf(end, firstPos);
		
		TypeToken<List<Mail>> token = new TypeToken<List<Mail>>(){};
		if(lastPos > -1 && firstPos > -1) {
			System.out.println(LogTratative.replaceLogs("[{" + "" + LogTratative.replaceJson(text.substring(firstPos, lastPos)) + "" + "\"}]"));
			mailList = gson.fromJson(LogTratative.replaceLogs("[{" + "" + LogTratative.replaceJson(text.substring(firstPos, lastPos)) + "" + "\"}]"), token.getType());
		}		
		return mailList;	
	}
	
}
