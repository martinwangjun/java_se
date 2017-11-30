package thread;

class ObjectLock{
    private String name;
    public ObjectLock() {
        
    }
    public ObjectLock(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class MyThreadPrinter2 implements Runnable {

    private String name;
    private ObjectLock prev;
    private ObjectLock self;

    private MyThreadPrinter2(String name, ObjectLock prev, ObjectLock self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 2;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    count--;
                    System.out.print(self.getName() + " NOTIFY ");
                    self.notify();
                    System.out.print("-" + name + "- ");
                }
                try {
                    System.out.println(prev.getName() + " WAIT");
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ObjectLock a = new ObjectLock("a");
        ObjectLock b = new ObjectLock("b");
        ObjectLock c = new ObjectLock("c");
        MyThreadPrinter2 pa = new MyThreadPrinter2("A", c, a);
        MyThreadPrinter2 pb = new MyThreadPrinter2("B", a, b);
        MyThreadPrinter2 pc = new MyThreadPrinter2("C", b, c);

        new Thread(pa).start();
        Thread.sleep(100); // 确保按顺序A、B、C执行
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
    }
}