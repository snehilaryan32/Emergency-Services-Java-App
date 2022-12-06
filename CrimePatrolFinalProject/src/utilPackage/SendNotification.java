/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author aryan
 */
public class SendNotification {
    
    public static String sendEmailNotification(String subject, String body, String recipient){
        
        String status = null;
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true"); 
        properties.put("mail.smtp.starttls.enable", "true"); 
        properties.put("mail.smtp.host", "smtp.gmail.com"); 
        properties.put("mail.smtp.port", "587"); 
        
        String myAccountEmail = SystemConstants.SENDER_EMAIL_ADDRESS; 
        String recepient = recipient; 
        String password = SystemConstants.EMAIL_ADDRESS_PASSWORD; 
        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });
        
        System.err.println("Authenticated");
        
    //    Message message = prepareMessage(session, myAccountEmail, recepient);
        
        try{
            Message message = new MimeMessage(session); 
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject(subject);
            message.setText(body);
            Transport.send(message);
            status = "Notification Sent";
            
         //   return  message; 
            
        }
        
        catch(Exception ex){
            Logger.getLogger(SendNotification.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(status);
        
        return status; 
        
        
    }
    
}
