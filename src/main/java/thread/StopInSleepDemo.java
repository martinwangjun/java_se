package thread;

class MyThread14 extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(100000);
            System.out.println("run end");
        }
        catch (InterruptedException e) {
            System.out.println("在沉睡中，线程被停止");
            e.printStackTrace();
        }
    }    
}

public class StopInSleepDemo {
    public static void main(String[] args) {
        try {
            MyThread14 t = new MyThread14();
            t.start();
            Thread.sleep(2000);
            t.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Main catch");
            e.printStackTrace();
        }
    }
}
