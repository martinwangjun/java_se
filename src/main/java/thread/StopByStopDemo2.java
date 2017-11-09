package thread;

/**
 * stop()会触发ThreadDeath异常
 * 
 * @author martin.wang
 *
 */
class MyThreadStop2 extends Thread{
    @Override
    public void run() {
        try {
            this.stop();
        }
        catch (ThreadDeath e) {
            System.out.println("进入了catch()方法");
            e.printStackTrace();
        }
    }
}

public class StopByStopDemo2 {
    public static void main(String[] args) {
        MyThreadStop2 t = new MyThreadStop2();
        t.start();
    }
}
