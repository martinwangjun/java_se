package innerclass;

import org.apache.log4j.Logger;

public class AnonymousInnerRunnable {
    private static final Logger logger = Logger.getLogger(AnonymousInnerRunnable.class);
    
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 500; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    // 使用log4j来记录日志
                    logger.debug(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        Thread t1 = new Thread(r, "T1");
        Thread t2 = new Thread(r, "T2");
        t1.start();
        t2.start();
    }
}
