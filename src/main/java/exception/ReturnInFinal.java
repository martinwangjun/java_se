package exception;

public class ReturnInFinal {
    
    public int test(int a) {
        int b = 60;
        try {
            b = b / a;
            return b;
        }
        catch (Exception e) {
            e.printStackTrace();
            b = 999;
            return b;
        }
        finally {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("正在关闭相关资源");
        }
    }
    
    public static void main(String[] args) {
        ReturnInFinal rif = new ReturnInFinal();
        System.out.println(rif.test(1));
        System.out.println(rif.test(0));
    }
}
