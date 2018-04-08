package jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class JMSConsumer {
    // 默认连接用户名
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    // 默认连接密码
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    // 连接地址
    private static final String BROKEURL = "tcp://10.68.69.122:61616";
    
    public static void main(String[] args) {
        ConnectionFactory connectionFactory;
        Connection connection;
        
        Session session;
        Destination destination;
        MessageConsumer messageConsumer;
        
        connectionFactory = new ActiveMQConnectionFactory(
                JMSConsumer.USERNAME,
                JMSConsumer.PASSWORD,
                JMSConsumer.BROKEURL
                );
        try {
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            destination = session.createQueue("HelloWorld_MW");
            messageConsumer = session.createConsumer(destination);
            
            while (true) {
                TextMessage textMessage = 
                        (TextMessage) messageConsumer.receive(10000);
                if (textMessage != null) {
                    System.out.println("发送消息： [ActiveMQ] <- " + textMessage.getText());
                } else {
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
