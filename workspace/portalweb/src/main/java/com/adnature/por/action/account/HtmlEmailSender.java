package com.adnature.por.action.account;

import java.util.Date;
import java.util.Properties;
 
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.adnature.por.action.VerifEmail;
 
public class HtmlEmailSender {
	
 
    public void sendHtmlEmail(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message) throws AddressException,
            MessagingException {
 
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
 
        Session session = Session.getInstance(properties, auth);
 
        // creates a new e-mail message
        MimeMessage msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses );
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        // set plain text message
        msg.setContent(message, "text/html"); 
        msg.saveChanges();
 
        // sends the e-mail
        Transport.send(msg);
 
    }
 
    /**
     * Test the send html e-mail method
     *
     */
    public static void main(String[] args) {
        // SMTP server information
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "no.reply.adnature@gmail.com";
        String password = "no.reply.adnature11";
 
        // outgoing message information
        String mailTo = "mmilne130@gmail.com";
        String subject = "Authenticate your AdNature Account";
 
        // message contains HTML markups
        String message = "<div style='position: absolute; right: 50%; background-color: #FEF2F2; border: 1px solid black;   text-align: center; width: 550px; font-size: 16pt; transform: translate(50%);'>";
        message += "<h1 style=font-size: 23pt; padding-top: 40px;> Hi ${(webUser.login)!}, </h1>";
        message += "<p style='padding: 30px;'>Thank you for activating your account at AdNature. Please click <a style= 'color: #0000FF; text-decoration: none;' href='${taglibs.ctx}/account/index.htm'>this link</a> to verify your account. </p>";
        message += "<p>We look forward to seeing you around,<br><br>The Team at AdNature</p><br>";
        message += "<div style='background-color:white; padding-top: 30px;'>";
        message += "<img src='https://github.com/TheScienceGuy/AdNature/blob/master/workspace/portalweb/src/main/webapp/style/Laurel-Creek.jpg?raw=true' width=400px height=150px>";
        message += "<p style='font-size: 12pt; font-family: calibri;'>Have you been to Laurel Creek yet?</p><p style='font-size: 12pt; font-family: calibri;'><a style='color: #0000FF; text-decoration: none;'>Click here to find out more</a></p>";
        message += "<div style= 'background-color: #b3ffb3; height: 80px; width: 550px;'>";
        message += "<img src='https://github.com/TheScienceGuy/AdNature/blob/master/workspace/portalweb/src/main/webapp/style/logo.png?raw=true' width=165px; height=84px; style= 'position: absolute; left:20px; align=left'>";
        message += "<p style= 'font-size:14pt; font-family: calibri; position: relative; left: 70px; top: 35px; font-weight: bold;'>Making it easier for you to get outside</p>";
        message += "</div>";
        message += "</div>";
        message += "</div>";
        HtmlEmailSender mailer = new HtmlEmailSender();
        
        try {
            mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo,
                    subject, message);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Failed to sent email.");
            ex.printStackTrace();
        }
        
       
    }
}