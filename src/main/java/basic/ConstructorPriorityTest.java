package basic;

public class ConstructorPriorityTest {
    
    private int qty = 1111;
    
    {
        System.out.println("初始化块执行前， qty = " + qty);
        System.out.println("初始化块执行赋值");
        qty = 2222;
        System.out.println("初始化块执行后， qty = " + qty);
    }
    
    public ConstructorPriorityTest() {
        System.out.println("构造函数执行前， qty = " + qty);
        System.out.println("构造函数执行赋值");
        qty = 3333;
        System.out.println("构造函数执行后， qty = " + qty);
    }
    
    public static void main(String[] args) {
        new ConstructorPriorityTest();
    }
}
