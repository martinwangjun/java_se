package basic;

/**
 * 构造函数是先从基类开始的。
 * 
 * @see Think in Java P244
 * @author martin.wang
 *
 */
class Art{
    public Art() {
        System.out.println("Art constractor.");
    }
}

class Drawing extends Art{
    public Drawing() {
        System.out.println("Drawing constrator.");
    }
}

class Cartoon extends Drawing{
    public Cartoon() {
        System.out.println("Cartoon constrator.");
    }
}

public class ConstructorCallDuringInheritanceDemo {
    public static void main(String[] args) {
        new Cartoon();
    }
}
