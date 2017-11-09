package thread;

class SecondThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class CreateThreadSecond {

    public static void main(String[] args) {
        SecondThread t = new SecondThread();
        Thread t1 = new Thread(t, "T1");
        Thread t2 = new Thread(t, "T2");
        t1.start();
        t2.start();
    }

}
