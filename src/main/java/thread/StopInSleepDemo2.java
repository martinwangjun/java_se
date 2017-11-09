package thread;

class MyThread15 extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println(i);
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("Catch");
            e.printStackTrace();
        }
    }
    
}

public class StopInSleepDemo2 {
    public static void main(String[] args) {
        MyThread15 t = new MyThread15();
        t.start();
        t.interrupt();
        System.out.println("end!");
    }
}
