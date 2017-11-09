package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CreateThreadThird  implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("当前线程名称是：" + Thread.currentThread().getName());
        int i = 0;
        for(; i < 10; i++) {
            System.out.println(i);
        }
        return i;
    }
    
    public static void main(String[] args) {
        CreateThreadThird rt = new CreateThreadThird();
        FutureTask<Integer> task = new FutureTask<>(rt);
        new Thread(task, "有返回值的线程").start();
        try {
            System.out.println("子线程的返回值: " + task.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
