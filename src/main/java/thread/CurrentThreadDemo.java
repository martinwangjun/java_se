package thread;

class MyThread extends Thread{
    public MyThread() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(this.getName());
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(this.getName());
    }
}

public class CurrentThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        
        System.out.println("-----------");
        
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        t1.setName("T1");
        t1.start();
    }
}
