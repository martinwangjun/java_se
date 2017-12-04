package basic;

public class ConstructorPriorityTest {
    private static int staticVal = 1;
    private int qty = 1111;
    
    {
        System.out.println("初始化块执行前， qty = " + qty);
        System.out.println("初始化块执行赋值");
        qty = 2222;
        System.out.println("初始化块执行后， qty = " + qty);
    }

    {
        System.out.println("静态初始化块执行前， staticVal = " + staticVal);
        System.out.println("静态初始化块执行赋值");
        qty = 2;
        System.out.println("静态初始化块执行后， staticVal = " + staticVal);
    }    
    
    public ConstructorPriorityTest() {
        System.out.println("构造函数执行前， qty = " + qty);
        System.out.println("构造函数执行赋值");
        qty = 3333;
        System.out.println("构造函数执行后， qty = " + qty);
        
        System.out.println("静态构造函数执行前， staticVal = " + staticVal);
        System.out.println("静态构造函数执行赋值");
        staticVal = 3;
        System.out.println("静态构造函数执行后， staticVal = " + staticVal);
    }
    
    public static void main(String[] args) {
        new ConstructorPriorityTest();
        System.out.println("- - - - - -");
        new ConstructorPriorityTest();
    }
}
