package thread;

/**
 * 通过异常来中断线程
 * 
 * @author martin.wang
 *
 */
class MyThread13 extends Thread{
    @Override
    public void run() {
        super.run();
//        for(int i = 0; i < 500000; i++) {
//            if(this.interrupted()) {
//                System.out.println("停止状态，退出");
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("我还活着");
        
        try {
            for (int i = 0; i < 5000000; i++) {
                if(Thread.interrupted()) {
                    System.out.println("已经停止了");
                    throw new InterruptedException();
                }
                System.out.println(i);
            }
            System.out.println("我还活着");
        }
        catch (InterruptedException e) {
            System.out.println("被抓了");
            e.printStackTrace();
        }
    }
}

public class StopThreadDemo {
    public static void main(String[] args) {
        try {
            MyThread13 t = new MyThread13();
            t.start();
            Thread.sleep(2000);
            t.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
