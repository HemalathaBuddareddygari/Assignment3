package java32.com;

import sun.security.pkcs11.wrapper.Constants;

import java.util.Properties;

public class SendMailNotificationWithAttachment {

    public static <Session> void mailToSendWithAttachment(String messageTosend, String snapShotFile) {

        String to = Constants.MailTo;
        String from = Constants.MailFrom;
        String host = Constants.smtpHost;// or IP address
        String subject = Constants.subject;
        // Get the session object
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            // message.setText(messageTosend);
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(messageTosend);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();
            String filepath = snapShotFile;

            DataSource source = new FileDataSource(filepath);
            messageBodyPart.setDataHandler(new DataHandler(source));

            Path p = Paths.get(filepath);
            String NameOffile = p.getFileName().toString();

            messageBodyPart.setFileName(NameOffile);
            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);

            // Send message
            Transport.send(message);

            //          Log.info("Message is sent Successfully");
            //          System.out.println("Message is sent Successfully");
            System.out.println("Message is sent Successfully");
        } catch (MessagingException e) {
            //          Log.error("Mail sending is Failed " + "due to" + e);
            SendMailNotificationWithAttachment smnwa = new SendMailNotificationWithAttachment();
            smnwa.mailSendFailed(e);
            throw new RuntimeException(e);
        }
    }
    public void mailSendFailed(MessagingException e) {
        System.out.println("Mail sending is Failed " + "due to" + e);
        Log log = new Log();
        log.writeIntoLog("Mail sending is Failed " + "due to" + e.toString(), false);
    }

}
