package innerclass;

/**
 * Thread类的匿名内部类的实现
 * 
 * @author martin.wang
 *
 */
public class AnonymousInnerThread {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    System.out.println(i);
                }
            }
        };
        t.start();
    }
}
