package com.teamsix.uboxprototype;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendYahoo
{
	static // Get system properties
	   Properties properties = System.getProperties();
	// Get the default Session object.
	   static Session session = Session.getDefaultInstance(properties);
	static Transport transport = null;	
	static MimeMessage message = null;
public static void SendYahoo()
{    
		
		
}

public SendYahoo(int one)
	{
		try
		{
			transport = session.getTransport("smtp");
		} catch (NoSuchProviderException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    // Sender's email ID needs to be mentioned
     String from = "kreeseeker@yahoo.com";
     String pass ="Programming01";
    // Recipient's email ID needs to be mentioned.
   String to = "kreeseeker@gmail.com";
   String host = "smtp.mail.yahoo.com";

   
   // Setup mail server
   properties.put("mail.smtp.starttls.enable", "true");
   properties.put("mail.smtp.host", host);
   properties.put("mail.smtp.user", from);
   properties.put("mail.smtp.password", pass);
   properties.put("mail.smtp.port", "587");
   properties.put("mail.smtp.auth", "true");

   

   try{
      // Create a default MimeMessage object.
     message = new MimeMessage(session);

      // Set From: header field of the header.
      message.setFrom(new InternetAddress(from));

      // Set To: header field of the header.
      message.addRecipient(Message.RecipientType.TO,
                               new InternetAddress(to));

      // Set Subject: header field
      message.setSubject("This is the Subject Line!");

      // Now set the actual message
      message.setText("This is actual message");

      // Send message
      
      transport.connect(host, from, pass);
      send();
    //  transport.sendMessage(message, message.getAllRecipients());
      //transport.close();
      //System.out.println("Sent message successfully....");
   }catch (MessagingException mex) {
      mex.printStackTrace();
   }
}

public static void send()
	{
		try
		{
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (MessagingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}