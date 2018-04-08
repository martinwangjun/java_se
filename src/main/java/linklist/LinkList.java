package linklist;

import org.apache.log4j.Logger;

public class LinkList {
    public Node head; // 定义头结点
    private final Logger LOGGER = Logger.getLogger(LinkList.class);
    
    // 插入数据
    public void addNode(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        // 不是空链表，插入到最后一个元素后面
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addNode(Node node) {
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    // 删除数据，按index来，index从0开始
    public boolean deleteNode(int index) {
        // 如果是不存在的Node
        if (index < 0 || index > length()) {
            return false;
        }
        // 如果是第一个结点
        if (index == 0) {
            head = head.next; // 指向第一个
            return true;
        }
        // 如果不是第一个结点
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    // 不知道头结点的情况下，删除
    public boolean deleteNode(Node node) {
        if(node== null) {
            return false;
        }
        if(node == head) {
            head = node.next;
            return true;
        }
        Node preNode = head;
        while(preNode.next != null) {
            if(preNode.next == node) {
                preNode.next = node.next;
                return true;
            }
            preNode = preNode.next;
        }
        return false;
    }

    // 获取长度
    public int length() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder("");
        Node temp = head;
        while (temp != null) {
            sBuilder.append(
                    "{ NodeHashCode: " + temp.hashCode() + 
                    ", NodeData: " + temp.data + 
                    ", NodeNext: " + (temp.next==null?"NULL":temp.next.hashCode()) + 
                    " }\n");
            temp = temp.next;
        }
        return sBuilder.toString();
    }

}
