package ibm.com.supplier.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.ibm.com.utils.StringUtils;
import br.ibm.com.utils.configs.MailConfig;
import br.ibm.com.utils.mail.MailJava;
import br.ibm.com.utils.mail.MailJavaSender;

//import br.ibm.com.Framework.Common.StringUtils;

public class MailUtils {

	// static ResourceBundle bundle = ResourceBundle.getBundle("jobsManut");
	// static String defaultSmtpServer = bundle.getString("defaultSmtpServer");
	// static String defaultSmtpServer =
	// "";UtilsPropriedades.getInstance().getDefaultSmtpServer();

	public static boolean SendMailComAnexo(String fromAddress,
			String recipientAddresses, String bccAddresses, String ccAddresses,
			String mailSubject, String mailContent, String fileName) {
		MailJava mj = new MailJava();
		mj.setSmtpHostMail(MailConfig.DEFAULT_SMTP_SERVER);
		mj.setSmtpPortMail("18390");
		mj.setSmtpAuth("false");
		mj.setSmtpStarttls("false");
		mj.setUserMail("rcmsla@br.ibm.com");
		mj.setCharsetMail("UTF-8");// mj.setCharsetMail("ISO-8859-1");
		mj.setSubjectMail(mailSubject);
		mj.setBodyMail(mailContent);
		mj.setTypeTextMail(MailJava.TYPE_TEXT_HTML);
		// sete quantos destinatarios desejar
		String[] listaTo = StringUtils.DelimitedStringToStringArray(
				recipientAddresses, ";");
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < listaTo.length; i++) {
			map.put("" + listaTo[i], "" + listaTo[i]);
		}
		// map.put("thiagoc@br.ibm.com", "email Thiago");
		// map.put("destinatario2@msn.com", "email msn");
		// map.put("destinatario3@ig.com.br", "email ig");
		mj.setToMailsUsers(map);
		// seta quatos anexos desejar
		List<String> files = new ArrayList<String>();
		files.add("" + fileName);
		// files.add("C:\\images\\hover_next.png");
		// files.add("C:\\images\\hover_prev.png");
		mj.setFileMails(files);
		try {
			new MailJavaSender().senderMail(mj);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}

	public static boolean SendMailSemAnexo(String fromAddress,
			String recipientAddresses, String bccAddresses, String ccAddresses,
			String mailSubject, String mailContent) {
		MailJava mj = new MailJava();
		mj.setSmtpHostMail(MailConfig.DEFAULT_SMTP_SERVER);
		mj.setSmtpPortMail("18390");
		mj.setSmtpAuth("false");
		mj.setSmtpStarttls("false");
		// mj.setUserMail("rcmsla@br.ibm.com");
		mj.setUserMail(fromAddress);
		mj.setCharsetMail("UTF-8");// mj.setCharsetMail("ISO-8859-1");
		mj.setSubjectMail(mailSubject);
		mj.setBodyMail(mailContent);
		mj.setTypeTextMail(MailJava.TYPE_TEXT_HTML);
		// sete quantos destinatarios desejar
		/** Seta To Mails */
		String[] listaTo = StringUtils.DelimitedStringToStringArray(
				recipientAddresses, ";");
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < listaTo.length; i++) {
			map.put("" + listaTo[i], "" + listaTo[i]);
		}
		// map.put("thiagoc@br.ibm.com", "email Thiago");
		// map.put("destinatario2@msn.com", "email msn");
		// map.put("destinatario3@ig.com.br", "email ig");
		mj.setToMailsUsers(map);

		// seta quatos anexos desejar
		List<String> files = new ArrayList<String>();
		// files.add(""+fileName);
		// files.add("C:\\images\\hover_next.png");
		// files.add("C:\\images\\hover_prev.png");
		mj.setFileMails(files);
		try {
			new MailJavaSender().senderMail(mj);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}

	public static boolean SendMailSemAnexoFull(String fromAddress,
			String recipientAddresses, String bccAddresses, String ccAddresses,
			String mailSubject, String mailContent) {
		MailJava mj = new MailJava();
		mj.setSmtpHostMail(MailConfig.DEFAULT_SMTP_SERVER);
		mj.setSmtpPortMail("18390");
		mj.setSsl(false);
		// mj.setSmtpPortMail("587");//"25"
		// mj.setSsl(true);//false

		mj.setSmtpAuth("false");
		mj.setSmtpStarttls("false");
		// mj.setUserMail("rcmsla@br.ibm.com");
		mj.setUserMail(fromAddress);
		mj.setCharsetMail("UTF-8");// mj.setCharsetMail("ISO-8859-1");
		mj.setSubjectMail(mailSubject);
		mj.setBodyMail(mailContent);
		mj.setTypeTextMail(MailJava.TYPE_TEXT_HTML);
		// sete quantos destinatarios desejar
		/** Seta To Mails */
		String[] listaTo = StringUtils.DelimitedStringToStringArray(
				recipientAddresses, ";");
		Map<String, String> mapTo = new HashMap<String, String>();
		for (int i = 0; i < listaTo.length; i++) {
			mapTo.put("" + listaTo[i], "" + listaTo[i]);
		}
		mj.setToMailsUsers(mapTo);
		/** Seta CC Mails */
		String[] listaCc = StringUtils.DelimitedStringToStringArray(
				ccAddresses, ";");
		Map<String, String> mapCc = new HashMap<String, String>();
		for (int i = 0; i < listaCc.length; i++) {
			mapCc.put("" + listaCc[i], "" + listaCc[i]);
		}
		mj.setCcMailsUsers(mapCc);
		/** Seta BCC Mails */
		String[] listaBcc = StringUtils.DelimitedStringToStringArray(
				bccAddresses, ";");
		Map<String, String> mapBcc = new HashMap<String, String>();
		for (int i = 0; i < listaBcc.length; i++) {
			mapBcc.put("" + listaBcc[i], "" + listaBcc[i]);
		}
		mj.setBccMailsUsers(mapBcc);

		// seta quatos anexos desejar
		List<String> files = new ArrayList<String>();
		// files.add(""+fileName);
		// files.add("C:\\images\\hover_next.png");
		// files.add("C:\\images\\hover_prev.png");
		mj.setFileMails(files);
		try {
			new MailJavaSender().senderMailFull(mj);
			return true;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return false;
		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean SendMail(String fromAddress,
			String recipientAddresses, String bccAddresses, String ccAddresses,
			String mailSubject, String mailContent) throws AddressException,
			MessagingException, IOException {
		InternetAddress emailFrom;
		InternetAddress[] emailTo;
		InternetAddress[] emailBcc;
		InternetAddress[] emailCc;

		emailFrom = new InternetAddress();
		emailFrom.setAddress(fromAddress);
		InternetAddress[] fromList = { emailFrom };
		String[] listaTo = StringUtils.DelimitedStringToStringArray(
				recipientAddresses, ";");
		String[] listaBcc = StringUtils.DelimitedStringToStringArray(
				bccAddresses, ";");
		String[] listaCc = StringUtils.DelimitedStringToStringArray(
				ccAddresses, ";");

		emailTo = new InternetAddress[listaTo.length];
		for (int i = 0; i < listaTo.length; i++) {
			InternetAddress email = new InternetAddress();
			email.setAddress(listaTo[i]);
			emailTo[i] = email;
		}

		emailBcc = new InternetAddress[listaBcc.length];
		for (int i = 0; i < listaBcc.length; i++) {
			InternetAddress email = new InternetAddress();
			email.setAddress(listaBcc[i]);
			emailBcc[i] = email;
		}

		emailCc = new InternetAddress[listaCc.length];
		for (int i = 0; i < listaCc.length; i++) {
			InternetAddress email = new InternetAddress();
			email.setAddress(listaCc[i]);
			emailCc[i] = email;
		}

		return SendMail(fromList, emailTo, emailBcc, emailCc, mailSubject,
				mailContent, true, "");

	}

	private static boolean SendMail(Address[] fromList,
			Address[] recipientList, Address[] bccList, Address[] ccList,
			String mailSubject, String mailContent,
			boolean useDefaultSmtpServer, String smtpServer)
			throws AddressException, MessagingException, IOException {
		boolean result = false;
		Properties props = new Properties();
		// props.put("mail.smtp.auth", "true");
		// props.put("mail.smtp.transport.protocol", "smtp");
		// props.put("mail.smtp.starttls.enable", "true");
		// props.put("mail.smtp.localhost", "127.0.0.1");

		if (useDefaultSmtpServer) {
			// props.put("mail.smtp.host", defaultSmtpServer);
			// props.put("mail.smtp.host",
			// UtilsPropriedades.getInstance().getDefaultSmtpServer());
			props.put("mail.smtp.host", MailConfig.DEFAULT_SMTP_SERVER);
		} else {
			props.put("mail.smtp.host", smtpServer);
		}
		Session session = Session.getDefaultInstance(props, null);
		session.setDebug(false);

		MimeMessage msg = new MimeMessage(session);
		msg.addFrom(fromList);
		msg.addRecipients(RecipientType.TO, recipientList);
		msg.setSubject(mailSubject);
		msg.setSentDate(new Date());
		msg.setContent(mailContent, "text/plain");
		Transport.send(msg);
		result = true;
		return result;
	}

	public static boolean SendMail(Address[] fromList, Address[] recipientList,
			Address[] bccList, Address[] ccList, String mailSubject,
			String mailContent, String smtpServer) throws AddressException,
			MessagingException, IOException {
		return SendMail(fromList, recipientList, bccList, ccList, mailSubject,
				mailContent, false, smtpServer);
	}

	public static boolean SendMail(Address[] fromList, Address[] recipientList,
			Address[] bccList, Address[] ccList, String mailSubject,
			String mailContent) throws AddressException, MessagingException,
			IOException {
		return SendMail(fromList, recipientList, bccList, ccList, mailSubject,
				mailContent, true, null);
	}

	public static String footerHtmlThiagoc(String title, String msg,
			String inicio, String fim) {
		return "<html>\n" + "\t<head>\n" + "\t\t<title" + title + "</title> \n"
				+ "\t</head>\n" + "\t<body>\n" + "\t\t\t<ul>\n" + "\t\t\t\t "
				+ title + ". \n" + "\t\t\t\t<li>Inicio:" + inicio + "</li>\n"
				+ "\t\t\t\t<li>   Fim:" + fim + "</li>\n" + "\t\t\t\t  \n"
				+ "\t\t\t</ul>\n" + "<p>" + msg + signatureHtmlThiagoc()
				+ "</BODY></HTML>";
	}

	public static String template(String file) {
		return lerFile(file);
	}

	public static String signatureHtmlThiagoc() {
		return lerFile("TemplateSignatureThiagoc.html");
	}
	public static String signatureHtmlThiagocOld() {
		return "\t\t\t<p>RCMS LA Team \n"
				+ "\t\t\t<p> \n"
				+ "<BR>"
				+ "<DIV class=line1><FONT size=2>Atenciosamente, Regards, Saludos,</FONT></DIV><BR>"
				+ "<TABLE cellSpacing=0 cellPadding=0 width=600>"
				+ " <TBODY>"
				+ "<TR>"
				+ "		    <TD class=small_font colSpan=4>"
				+ "		      <HR color=#696969>"
				+ "		    </TD></TR>"
				+ "		  <TR>"
				+ "		    <TD class=small_font colSpan=4></TD></TR>"
				+ "		  <TR>"
				+ "		    <TD class=line2 colSpan=2><FONT size=1><B>Thiago de Menezes Nogueira"
				+ "		      Costa</B></FONT></TD>"
				+ "		    <TD class=inner><FONT size=1>&nbsp;Rua Tutoia, 1157 - TU14</FONT></TD>"
				+ "		    <TD align=right width=87 rowSpan=3></TD></TR>"
				+ "		  <TR>"
				+ "    <TD class=inner colSpan=2><FONT size=1>Application Focal Point and Java Developer TSS Tools</FONT></TD>"
				+ "    <TD class=inner><FONT size=1>&nbsp;Sao Paulo, SP 04007-900</FONT></TD></TR>"
				+ "  <TR>"
				+ "  <TD class=inner colSpan=2><FONT size=1>IBM CHQ, CIO Organization</FONT></TD>"
				+ "   <TD class=inner><FONT size=1>&nbsp;Brazil</FONT></TD></TR>"
				+ "  <TR>"
				+ "   <TD class=inner width=55><FONT size=1>Phone:</FONT></TD>"
				+ "   <TD class=inner width=200><FONT size=1>+55-11-2132-5146</FONT></TD>"
				+ "   <TD class=inner><FONT size=1>&nbsp;</FONT></TD></TR>"
				+ "  <TR>"
				+ "   <TD class=inner width=55><FONT size=1>Tie-Line:</FONT></TD>"
				+ "   <TD class=inner width=200><FONT size=1>842-5146</FONT></TD>"
				+ "   <TD class=inner><FONT size=1>&nbsp;&nbsp;</FONT></TD></TR>"
				+ "  <TR>"
				+ "   <TD class=inner width=55><FONT size=1>Mobile:</FONT></TD>"
				+ "   <TD class=inner width=200><FONT size=1>+55-11-98316-0606</FONT></TD>"
				+ "   <TD class=inner><FONT size=1>&nbsp;&nbsp;</FONT></TD></TR>"
				+ "  <TR>"
				+ "   <TD class=inner width=55><FONT size=1>e-mail:</FONT></TD>"
				+ "  <TD class=inner width=200><FONT size=1>thiagoc@br.ibm.com</FONT></TD>"
				+ "   <TD class=inner><FONT"
				+ "	size=1>&nbsp;&nbsp;</FONT></TD></TR></TBODY></TABLE>";
	}

	private static String lerFile(String nomeArquivo) {
		// String nomeArquivo = "entrada.txt";
		String r = "";
		try {
			/** Ler arquivo */
			BufferedReader in = new BufferedReader(new FileReader(nomeArquivo));
			while (in.ready()) {
				String st = in.readLine();
				r += st + "\n";
			}
			in.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return r;
	}
}

