package email;

import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

// import com.sun.mail.util.MailSSLSocketFactory;

public class SendMailNetease {

//    private String from = "martinwangjun@163.com"; // 发件人邮箱地址  
//    private String user = "martinwangjun"; // 发件人称号，同邮箱地址  
//    private String password = "Fisher123"; // 发件人邮箱客户端授权码  
//  
//    /** 
//     *  
//     * @param to 
//     * @param text 
//     * @param title 
//     * @throws GeneralSecurityException 
//     */  
//    /* 发送验证信息的邮件 */  
//    public boolean sendMail(String to, String text, String title) throws GeneralSecurityException {  
//        Properties props = new Properties();  
//        props.setProperty("mail.smtp.host", "smtp.163.com"); // 设置发送邮件的邮件服务器的属性（这里使用网易的smtp服务器）  
//        props.put("mail.smtp.host", "smtp.163.com"); // 需要经过授权，也就是有户名和密码的校验，这样才能通过验证（一定要有这一条）  
//        props.put("mail.smtp.auth", "true"); // 用刚刚设置好的props对象构建一个session  
//        MailSSLSocketFactory sf = new MailSSLSocketFactory();
//        sf.setTrustAllHosts(true);
//        props.put("mail.smtp.ssl.enable", "true");
//        props.put("mail.smtp.ssl.socketFactory", sf);
//        
//        Session session = Session.getDefaultInstance(props, new Authenticator(){
//            public PasswordAuthentication getPasswordAuthentication()
//            {
//                return new PasswordAuthentication("martinwangjun", "Fisher123"); //发件人邮件用户名、密码
//            }
//        }); // 有了这句便可以在发送邮件的过程中在console处显示过程信息，供调试使  
//                                                                // 用（你可以在控制台（console)上看到发送邮件的过程）  
//        session.setDebug(true); // 用session为参数定义消息对象  
//        MimeMessage message = new MimeMessage(session); // 加载发件人地址  
//        try {  
//            message.setFrom(new InternetAddress(from));  
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); // 加载收件人地址  
//            message.setSubject(title); // 加载标题  
//            Multipart multipart = new MimeMultipart(); // 向multipart对象中添加邮件的各个部分内容，包括文本内容和附件  
//            BodyPart contentPart = new MimeBodyPart(); // 设置邮件的文本内容  
//            contentPart.setContent(text, "text/html;charset=utf-8");  
//            multipart.addBodyPart(contentPart);  
//            message.setContent(multipart);  
//            message.saveChanges(); // 保存变化  
//            Transport transport = session.getTransport("smtp"); // 连接服务器的邮箱  
//            transport.connect("smtp.163.com", user, password); // 把邮件发送出去  
//            transport.sendMessage(message, message.getAllRecipients());  
//            transport.close();  
//        } catch (MessagingException e) {  
//            e.printStackTrace();  
//            return false;  
//        }  
//        return true;  
//    }  
//  
//    public static void main(String[] args) throws GeneralSecurityException { // 做测试用  
////        SendMailNetease ds = new SendMailNetease();  
////        ds.sendMail("martinwangjun@163.com", "你好，这是一封测试邮件，无需回复。", "测试邮件");
//        
//        boolean isSSL = true;
//        String host = "smtp.163.com";
//        int port = 465;
//        String from = "martinwangjun@163.com";
//        String to = "martinwangjun@163.com";
//        boolean isAuth = true;
//        final String username = "martinwangjun";
//        final String password = "Fisher123";
//
//        Properties props = new Properties();
//        props.put("mail.smtp.ssl.enable", isSSL);
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.port", port);
//        props.put("mail.smtp.auth", isAuth);
//
//        Session session = Session.getDefaultInstance(props, new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(username, password);
//            }
//        });
//
//        try {
//            Message message = new MimeMessage(session);
//
//            message.setFrom(new InternetAddress(from));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.setSubject("主题");
//            message.setText("内容");
//
//            Transport.send(message);
//        } catch (AddressException e) {
//            e.printStackTrace();
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("发送完毕！");
//    }

}
