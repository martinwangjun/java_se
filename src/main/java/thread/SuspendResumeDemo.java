package thread;

import javax.security.auth.login.LoginContext;

/**
 * 使用suspend和resume来暂停线程的执行
 * 
 * 缺点：
 * 1. 独占 在SuspendResumeDealLockDemo中体现
 * 2. 不同步 在SuspendResumeDemo2中体现
 * 
 * @author martin.wang
 *
 */

class MyThread17 extends Thread{
    private long i = 0;
    public long getI() {
        return i;
    }
    public void setI(long i) {
        this.i = i;
    }
    @Override
    public void run() {
        while(true) {
            i++;
        }
    }
}

public class SuspendResumeDemo {
    public static void main(String[] args) {
        try {
            MyThread17 t = new MyThread17();
            t.start();
            Thread.sleep(5000);
            
            // A
            t.suspend();
            System.out.println("A=" + System.currentTimeMillis() 
                + " - " + t.getI());
            Thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() 
                + " - " + t.getI());
            
            // B
            t.resume();
            Thread.sleep(5000);
            
            // C
            t.suspend();
            System.out.println("C=" + System.currentTimeMillis() 
                + " - " + t.getI());
            Thread.sleep(5000);
            System.out.println("C=" + System.currentTimeMillis() 
                + " - " + t.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
