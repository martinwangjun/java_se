package thread;

class MyThread11 extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i = " + (i + 1));
        }
    }
    
}

public class StopThreadDemo1 {

    public static void main(String[] args) {
        try {
            MyThread11 thread = new MyThread11();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
