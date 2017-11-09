package thread;

/**
 * 静态同步synchronized方法
 * 
 * synchronized关键字加到static方法是给Class类加锁，
 * 而synchronized方法加到非static方法上是给对象加锁
 * 
 * @see SyncTwoLockDemo
 * @author martin.wang
 *
 */
class Service229{
    synchronized public static void printA(){
        try {
            System.out.println(Thread.currentThread().getName()
                    + " @ " + System.currentTimeMillis() + " IN  PRINT_A");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()
                    + " @ " + System.currentTimeMillis() + " OUT PRINT_A");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    synchronized public static void printB() {
        System.out.println(Thread.currentThread().getName()
                + " @ " + System.currentTimeMillis() + " IN  PRINT_B");
        System.out.println(Thread.currentThread().getName()
                + " @ " + System.currentTimeMillis() + " OUT PRINT_B");
    }
}

class Thread229A extends Thread{
    @Override
    public void run() {
        Service229.printA();
    }
}

class Thread229B extends Thread{
    @Override
    public void run() {
        Service229.printB();
    }
}

public class SyncStaticMethodDemo {
    public static void main(String[] args) {
        Thread229A Ta = new Thread229A();
        Thread229B Tb = new Thread229B();
        Ta.setName("A");
        Tb.setName("B");
        Ta.start();
        Tb.start();
    }
}
