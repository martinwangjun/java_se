package basic;

/**
 * 复杂继承的情况下，构造函数的初始化顺序：
 * 
 * @author martin.wang
 *
 */
class A{
    public A() {
        System.out.println("A");
    }
}

class B{
    public B() {
        System.out.println("B");
    }
}

class C extends A{
    B b = new B();
    public C() {
        System.out.println("C");
    }
}

public class ConstuctorInitialDemo {
    public static void main(String[] args) {
        new C();
    }
}
