package jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class JMSProducer {
    // 默认连接用户名
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    // 默认连接密码
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    // 连接地址
    private static final String BROKEURL = "tcp://10.68.69.122:61616";
    // 发送的消息数量
    private static final int SENDQTY = 10;
    
    public static void main(String[] args) {
        // 连接工厂
        ConnectionFactory connectionFactory;
        // 连接
        Connection connection = null;
        // 会话 接受或发送消息的线程
        Session session;
        // 消息的目的地
        Destination destination;
        // 消息生产者
        MessageProducer messageProducer;
        // 实例化连接工厂
        connectionFactory = new ActiveMQConnectionFactory(
                JMSProducer.USERNAME,
                JMSProducer.PASSWORD,
                JMSProducer.BROKEURL
                );
                
        try {
            // 通过连接工厂获取连接
            connection = connectionFactory.createConnection();
            // 启动连接
            connection.start();
            // 创建session
            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            // 创建一个名叫HelloWorld的消息队列
            destination = session.createQueue("HelloWorld_MW");
            // 创建消息生产者
            messageProducer = session.createProducer(destination);
            // 发送消息
            sendMessage(session, messageProducer);
            session.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                } catch (JMSException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public static void sendMessage(Session session, MessageProducer messageProducer)
        throws Exception{
        for (int i = 0; i < JMSProducer.SENDQTY; i++) {
            // 创建一条文本消息
            TextMessage message = session.createTextMessage("ActiveMQ发送消息");
            System.out.println("发送消息： [ActiveMQ] -> " + i);messageProducer.send(message);;
            Thread.sleep(1000);
        }
    }
}
