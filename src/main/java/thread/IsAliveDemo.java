package thread;

class MyThread7 extends Thread{
    @Override
    public void run() {
        // 这里是否打印true是不确定的，取决于是否执行完毕，执行完毕是false，还在执行是true
        System.out.println("Run = " + this.isAlive());
    }
}

public class IsAliveDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread7 myThead = new MyThread7();
        System.out.println("Begin = " + myThead.isAlive());
        myThead.start();
        Thread.sleep(1000);
        System.out.println("End = " + myThead.isAlive());
    }
}
