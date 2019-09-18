package com.project2.socialmedia.utiles;


import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.project2.socialmedia.model.Email;
import com.project2.socialmedia.model.Users;

import javax.mail.PasswordAuthentication;

public class SendMail {		
		
	public static boolean sendMail(Email email, Users user) {
		String subject;
		String password = "Personal_01";
		String eFromEmail;
		
//		email.seteFromEmail(eFromEmail);
		
		email.seteFromEmail("personal56company@gmail.com");
		email.seteSubject(user.getFirstName() + " , ");
		email.setePassword(password);
//		email.seteSubject(subject);
		
				
		String fromEmail = email.geteFromEmail();
		
		//String password = EnDeCrypt.deCrypt(email.getePassword());
		String toEmail = user.getEmail();
		//String subject = user.getFirstName() + email.geteSubject();
		String message = email.geteMessage();
		Properties prop = System.getProperties();				
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		
		Session mailSession = Session.getDefaultInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});
		mailSession.setDebug(true);
		
		Message mailMessage = new MimeMessage(mailSession);
		
		
		try {
			mailMessage.setFrom(new InternetAddress(fromEmail));
			mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
//			mailMessage.setSubject(subject);
			mailMessage.setContent(message,"text/html");
			
			Transport.send(mailMessage);
			
			return true;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}				
		
		return false;
	}
}
