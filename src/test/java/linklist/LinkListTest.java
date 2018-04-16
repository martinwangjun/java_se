package linklist;

import org.apache.log4j.Logger;
import org.junit.Test;

import junit.framework.TestCase;

public class LinkListTest {
    
    private final Logger LOGGER = Logger.getLogger(LinkListTest.class);
    
    @Test
    public void testInsertNode() {
        // 新建一个链表
        LinkList myList = new LinkList();
        TestCase.assertEquals(0, myList.length());
        myList.insertNode(1);
        myList.insertNode(2);
        myList.insertNode(3);
        myList.insertNode(4);
        myList.insertNode(5);
        myList.listNodes();
        
        // 在第2个位置（从0开始）后面插入一个元素
        TestCase.assertEquals(5, myList.length());
        System.out.println("--------------------------");
        
        
        myList.insertNode(2, 100);
        myList.listNodes();
    }
}
