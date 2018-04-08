package linklist;

import org.apache.log4j.Logger;
import org.junit.Test;

public class LinkListTest {
    
    private final Logger LOGGER = Logger.getLogger(LinkListTest.class);
    
    @Test
    public void test() {
        LinkList list = new LinkList();
        Node n1 = new Node(1000);
        list.addNode(n1);        
        list.addNode(2000);
        list.addNode(3000);
        list.addNode(4000);
        Node n5 = new Node(5000);
        System.out.println(n5.hashCode());
        Node n6 = new Node(6000);
        System.out.println(n6.hashCode());
        System.out.println("--------------------");        

        list.addNode(n5);
        list.addNode(n6);
        LOGGER.info(list.toString());

        list.addNode(7000);
        list.deleteNode(n5);
        LOGGER.info(list.toString());
        list.deleteNode(n6);
        LOGGER.info(list.toString());
        list.deleteNode(n1);
        LOGGER.info(list.toString());
    }
}
