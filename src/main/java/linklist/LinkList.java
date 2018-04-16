package linklist;

import org.apache.log4j.Logger;

public class LinkList {
    public Node head; // 定义头结点
    private final Logger LOGGER = Logger.getLogger(LinkList.class);
    
    /**
     * 插入新的节点
     * 
     * @param d
     */
    public void insertNode(int d) {
        Node temp = new Node(d);
        temp.next = head;
        head = temp;
        LOGGER.info(temp);
        LOGGER.info(head);
    }
    
    /**
     * 在指定位置插入Node
     * 
     * @param index
     * @param d
     */
    public void insertNode(int index, int d) {
        if(index < 0 || index > this.length() - 1) {
            LOGGER.info("Index: " + index + " illegal.");
            return;
        }
        if (index == 0) {
            insertNode(d);
            return;
        }
        Node temp = head;
        int currentPostion = 0;
        while (temp.next != null) {
            if(index == currentPostion) {
                Node node = new Node(d);
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
            currentPostion++;
        }
    }
    
    /**
     * 删除指定的节点，从0开始算
     */
    public void deleteNode(int index) {
        if(index < 0 || index >= this.length()) {
            LOGGER.info("Index: " + index + " illegal.");
            return;
        }
        if (index == 0) {
            
        }
        
    }
    
    /**
     * 列出所有的节点
     */
    public void listNodes() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public int length() {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
    
    
    
//    // 插入数据
//    public void addNode(int d) {
//        Node newNode = new Node(d);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public void addNode(Node node) {
//        node.next = head;
//        head = node;
//    }
//    
//    // 删除数据：按index来，index从0开始
//    public boolean deleteNode(int index) {
//        // 如果是不存在的Node
//        if (index < 0 || index > length()) {
//            return false;
//        }
//        // 如果是第一个结点
//        if (index == 0) {
//            head = head.next; // 指向第一个
//            return true;
//        }
//        // 如果不是第一个结点
//        int i = 1;
//        Node preNode = head;
//        Node curNode = preNode.next;
//        while (curNode != null) {
//            if (i == index) {
//                preNode.next = curNode.next;
//                return true;
//            }
//            preNode = curNode;
//            curNode = curNode.next;
//            i++;
//        }
//        return false;
//    }
//
//    // 删除数据：按Node来
//    public boolean deleteNode(Node node) {
//        if(node== null) {
//            return false;
//        }
//        if(node == head) {
//            head = node.next;
//            return true;
//        }
//        Node preNode = head;
//        while(preNode.next != null) {
//            if(preNode.next == node) {
//                preNode.next = node.next;
//                return true;
//            }
//            preNode = preNode.next;
//        }
//        return false;
//    }
//
//    // 获取长度
//    public int length() {
//        int length = 0;
//        Node temp = head;
//        while (temp != null) {
//            length++;
//            temp = temp.next;
//        }
//        return length;
//    }
//
//    // 遍历
//    public void list() {
//        Node pointer = head;
//        while (pointer != null) {
//            System.out.println(pointer.data);
//            pointer = pointer.next;
//        }
//    }
//    
//    // 按Node查找，返回位置，没有找到返回-1
//    public int searchByNode(Node node) {
//        int i = 0;
//        Node temp = head;
//        while(temp.next != null) {
//            if (node.equals(temp)) {
//                break;
//            }
//            i++;
//            temp = temp.next;
//        }
//        if (temp.next == null && !node.equals(temp)) {
//            i = -1;
//        }
//        return i;
//    }
//    
//    /**
//     * 反转一个链表
//     * 
//     * @param node
//     * @return
//     */
//    public Node reverse(Node node) {
//        Node prev;
//        if(node == null || node.next == null) {
//            prev = node;
//        } else {
//            Node temp = reverse(node.next);
//            node.next.next = node;
//            node.next = null;
//            prev = temp;
//        }
//        return prev;
//    }
//    
//    @Override
//    public String toString() {
//        StringBuilder sBuilder = new StringBuilder("");
//        Node temp = head;
//        while (temp != null) {
//            sBuilder.append(
//                    "{ NodeHashCode: " + temp.hashCode() + 
//                    ", NodeData: " + temp.data + 
//                    ", NodeNext: " + (temp.next==null?"NULL":temp.next.hashCode()) + 
//                    " }\n");
//            temp = temp.next;
//        }
//        return sBuilder.toString();
//    }

}
