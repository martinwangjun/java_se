package thread;

class MyThread12 extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println(i);
        }
    }
    
}


public class IsInterruptedDemo {

    public static void main(String[] args) {
//        try {
//            MyThread12 t = new MyThread12();
//            t.start();
//            Thread.sleep(1000);
//            t.interrupt();
//            System.out.println("是否停止1？" + t.interrupted());
//            System.out.println("是否停止2？" + t.interrupted());
//        } catch (Exception e) {
//            System.out.println("main catch");
//            e.printStackTrace();
//        }
//        System.out.println("END");
        
//        Thread.currentThread().interrupt();
//        System.out.println("是否停止1？" + Thread.interrupted());
//        System.out.println("是否停止2？" + Thread.interrupted());
//        System.out.println("END");

        try {
            MyThread12 t = new MyThread12();
            t.start();
            Thread.sleep(1000);
            t.interrupt();
            System.out.println("是否停止1？" + t.isInterrupted());
            System.out.println("是否停止2？" + t.isInterrupted());
        } catch (Exception e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    
    }

}
