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
            // b = 1;
            System.out.println("finally");
            // return b;
        }
    }
    
    public static void main(String[] args) {
        ReturnInFinal rif = new ReturnInFinal();
        System.out.println(rif.test(0));
    }
}
