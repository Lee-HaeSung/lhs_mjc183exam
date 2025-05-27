
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailApi {
    static Properties prop;
    static Session session;
    static MimeMessage message;

    public static void main(String[] args) throws Exception {
        generateAndSendEmail();
        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email...");
    }

    public static void generateAndSendEmail() throws Exception {
        final String user = "";
        final String password = "";

        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.naver.com");
        prop.put("mail.smtp.port", 465);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.ssl.trust", "smtp.naver.com");

        Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(""));
            message.setSubject("그들은 어떻게 강팀이 됐나?");
            message.setText("젠지는 어떻게 강팀이 됐나?");

            Transport.send(message);
            System.out.println("message sent successfully...");
        }   catch (AddressException e){
                e.printStackTrace();
        }   catch (MessagingException e) {
                e.printStackTrace();
        }
    }
}
