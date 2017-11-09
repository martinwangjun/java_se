package thread;

class SyncObject{
    synchronized public void printString() {
        System.out.println("BEGIN");
        if(Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println("END");
    }
}

public class SuspendResumeDealLockDemo {
    public static void main(String[] args) {
        try {
            final SyncObject object = new SyncObject();
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };
            t1.setName("a");
            t1.start();
            Thread.sleep(1000);
            Thread t2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("Thread2启动");
                    object.printString();
                }
            };
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
