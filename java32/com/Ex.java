package java32.com;


    import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



    public class sendMail {

        static  String  alertByEmail(String emailMessage){
            try{

                final String fromEmail = "abc@gmail.com";
                final String password = "********"; //fromEmail password
                final String toEmail = "xyz@gmail.com";
                System.out.println("Email configuration code start");
                Properties props = new Properties();
                props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host set by default this
                props.put("mail.smtp.port", "587"); //TLS Port you can use 465 insted of 587
                props.put("mail.smtp.auth", "true"); //enable authentication
                props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
                //create Authenticator object to pass in Session.getInstance argument
                Authenticator auth = new Authenticator()
                {

                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication(fromEmail, password);
                    }
                };
                Session session = Session.getInstance(props, auth);

                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(fromEmail));
                message.addRecipient(Message.RecipientType.TO, new
                        InternetAddress(toEmail));
                message.setSubject("ALERT");
                message.setText(emailMessage);//here you can write a msg what you want to send... just remove String parameter in alertByEmail method oherwise call parameter
                System.out.println("text:"+emailMessage);
                Transport.send(message);//here mail sending process start.
                System.out.println("Mail Sent Successfully");
            }
            catch(Exception ex)
            {
                System.out.println("Mail fail");
                System.out.println(ex);
            }
            return emailMessage;

        }
        public static void main(String[] args) {
            String emailMessage = "This mail is send using java code.Report as a spam";
            alertByEmail(emailMessage);
        }
    }



}
