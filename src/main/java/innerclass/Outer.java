package innerclass;

/**
 * 成员内部类的一个示例
 * 
 * @author martin.wang
 *
 */
public class Outer {
    
    private String info = "我是外部类";
    private String duplicateName = "我是外部类的小芳";

    public static void main(String[] args) {
        Outer outer = new Outer();
        // 别扭！
        Outer.Inner inner = outer.new Inner(); 
        inner.print();
        
        // 推荐用这个办法创建内部类
        inner = outer.getInner();
        inner.print();
        
        inner.showOuterProperty();
        inner.showOuterName();
        inner.showInnerName();
        
        System.out.println("外部类必须通过内部类的实例才可以访问到内部类的成员变量或方法：" + inner.duplicateName);
        
    }
    
    public Inner getInner() {
        return new Inner();
    }
    
    public class Inner{
        public String duplicateName = "我是内部类的小芳";
        
        public void print() {
            System.out.println("Inner");
        }
        
        public void showOuterProperty() {
            // 内部类可以访问外部类的
            System.out.println(info);
        }
        
        public void showOuterName() {
            // 如果成员变量/方法和外部类重名了，就要用 外部类.this.成员变量 来解决
            System.out.println(Outer.this.duplicateName);
        }
        
        public void showInnerName() {
            System.out.println(duplicateName);
        }
    }
}
