package thread;
/**
 * 静态同步synchronized方法
 * 
 * synchronized关键字加到static方法是给Class类加锁，
 * 而synchronized方法加到非static方法上是给对象加锁
 * 
 * @see SyncStaticMethodDemo
 * 
 * @author martin.wang
 *
 */


class Service98{
    synchronized public static void printA() {
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
    public void printC() {
        System.out.println(Thread.currentThread().getName()
                + " @ " + System.currentTimeMillis() + " IN  PRINT_C");
        System.out.println(Thread.currentThread().getName()
                + " @ " + System.currentTimeMillis() + " OUT PRINT_C");
    }
}

class Thread98A extends Thread{
    private Service98 service;
    public Thread98A(Service98 service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.printA();
    }
}

class Thread98B extends Thread{
    private Service98 service;
    public Thread98B(Service98 service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.printB();
    }
}

class Thread98C extends Thread{
    private Service98 service;
    public Thread98C(Service98 service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.printC();
    }
}

public class SyncTwoLockDemo {
    public static void main(String[] args) {
        Service98 service = new Service98();
        Thread98A a = new Thread98A(service);
        Thread98B b = new Thread98B(service);
        Thread98C c = new Thread98C(service);
        a.setName("A");
        b.setName("B");
        c.setName("C");
        a.start();
        b.start();
        c.start();
    }
}
