package thread;

/**
 * 
 * @see http://www.cnblogs.com/huangyichun/p/6071625.html
 * @author martin.wang
 *
 */
class CountOperate extends Thread{
    public CountOperate() {
        System.out.println("CountOperate -- Begin");
        System.out.println("Thread.currentThread().getName() -- " 
                + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() -- " 
                + Thread.currentThread().isAlive());
        System.out.println("this.getName() -- " + this.getName());
        System.out.println("this.isAlive() -- " + this.isAlive());
        System.out.println("CountOperate -- End");
    }
    
    @Override
    public void run() {
        System.out.println("run -- Begin");
        System.out.println("Thread.currentThread().getName() -- " 
                + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() -- " 
                + Thread.currentThread().isAlive());
        System.out.println("this.getName() -- " + this.getName());
        System.out.println("this.isAlive() -- " + this.isAlive());
        System.out.println("run -- End");
    }
}

public class CountOperateDemo {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread t1 = new Thread(countOperate);
        System.out.println("main begin t1 isAlive = " + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive = " + t1.isAlive());
    }
}
