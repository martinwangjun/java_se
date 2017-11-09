package thread;

class MyThread8 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("run threadName = " 
                    + this.currentThread().getName() + " Begin");
            Thread.sleep(2000);
            System.out.println("run threadName = " 
                    + this.currentThread().getName() + " End");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SleepThreadDemo {

    public static void main(String[] args) {
        MyThread8 t = new MyThread8();
        System.out.println("Begin = " + System.currentTimeMillis());
        t.start();
        System.out.println("End = " + System.currentTimeMillis());
    }
}
