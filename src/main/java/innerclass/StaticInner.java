package innerclass;

public class StaticInner {
    private static int staticVal = 99;
    
    static class StaticInnerClass{
        private static int age = 88;
        public void accessOuterVal() {
            System.out.println(staticVal);
        }
    }
    
    public void test() {
        StaticInnerClass si = new StaticInnerClass();
        si.accessOuterVal();
    }
    
    public static void main(String[] args) {
        new StaticInner().test();
        System.out.println(StaticInner.StaticInnerClass.class.getName());
        System.out.println(StaticInner.StaticInnerClass.age);
    }
}
