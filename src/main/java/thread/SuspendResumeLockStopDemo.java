package thread;

class MyThread18 extends Thread{
    private long i = 0;
    @Override
    public void run() {
        while(true) {
            i++;
            System.out.println(i);
        }
    }
}

public class SuspendResumeLockStopDemo {
    public static void main(String[] args) {
        try {
            MyThread18 t = new MyThread18();
            t.start();
            Thread.sleep(1000);
            t.suspend();
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
