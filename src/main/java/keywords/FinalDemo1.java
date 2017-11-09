package keywords;

/**
 * 演示final关键字在引用类型中的情况
 * 
 * - 不可以改变指向
 * - 可以改变指向的内容
 * 
 * @author martin.wang
 *
 */
class Alligator{
    private String name;
    
    public Alligator() {
        
    }
    
    public Alligator(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class FinalDemo1 {
    public static void main(String[] args) {
        Alligator a1 = new Alligator("Alligator1");
        // Alligator类型的变量a是引用类型，指向a1，并且是不能改变指向
        final Alligator a = a1;
        a.info();
        
        // 但是，可以修改指向的内容
        a.setName("Alex");
        a.info();
        
        // 甚至别的变量也可以来修改指向的内容
        a1.setName("Alice");
        a.info();
    }
}
