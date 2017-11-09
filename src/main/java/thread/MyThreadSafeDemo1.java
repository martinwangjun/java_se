package thread;

/**
 * 线程安全
 * 
 * 
 * @author martin.wang
 *
 */

// 线程不安全
class ThreadSafe1 extends Thread{
    private int count = 5;
    
    public ThreadSafe1(String name) {
        this.setName(name);
    }
    
    @Override
    public void run() {
        while(count > 0) {
            count--;
            System.out.println(Thread.currentThread().getName() + " - " + count);
        }
    }
}

// 线程不安全
class ThreadSafe2 extends Thread{
    private int count = 10;
    
    @Override
    public void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " - " + count);
    }
}

//线程安全
class ThreadSafe3 extends Thread{
 private int count = 10;
 
 @Override
 synchronized public void run() {
     count--;
     System.out.println(Thread.currentThread().getName() + " - " + count);
 }
}

public class MyThreadSafeDemo1 {
    public static void main(String[] args) {
        
        // 三个线程各自独立，无影响
        Thread a1 = new ThreadSafe1("A1");
        Thread b1 = new ThreadSafe1("B1");
        Thread c1 = new ThreadSafe1("C1");
        
        a1.start();
        b1.start();
        c1.start();
        
        // 线程共享数据，下面的代码会概率出现问题
        ThreadSafe2 t2 = new ThreadSafe2();
        for (int i = 0; i < 10; i++) {
            Thread a2 = new Thread(t2, "A2_" + i);
            a2.start();
        }
        
        // 线程共享数据，线程安全
        ThreadSafe3 t3 = new ThreadSafe3();
        for (int i = 0; i < 10; i++) {
            Thread a3 = new Thread(t3, "AB3_" + i);
            a3.start();
        }
        
    }
}
