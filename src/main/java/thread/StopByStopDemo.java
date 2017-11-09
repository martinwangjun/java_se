package thread;

/**
 * 使用stop()暴力停止线程，非常不推荐使用
 * 
 * @author martin.wang
 *
 */
class MyThreadStop1 extends Thread{
    private int i = 0;

    @Override
    public void run() {
        try {
            while(true) {
                i++;
                System.out.println(i);
                Thread.sleep(100);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}


public class StopByStopDemo {
    public static void main(String[] args) {
        try {
            MyThreadStop1 thread = new MyThreadStop1();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
