package array;

/**
 * CopyArray.java
 * 
 * 测试数组复制的速度
 * 
 * System.arraycopy方法是个native方法，可以大幅度的提高速度。
 * 
 * @author martin.wang
 *
 */
public class CopyArray {
    
    private static void initArray(String[] arr) {
        for(int i = 0, len = arr.length; i< len; i++) {
            arr[i] = (i % 2 == 0) ? "白日依山尽" : "黄河入海流";
        }
    }
    
    private static void copySlow(String[] a, String[] b) {
        for(int i = 0, len = a.length; i < len; i++) {
            b[i] = new String(a[i]);
        }
    }
    
    private static void copyFast(String[] a, String[] c) {
        System.arraycopy(a, 0, c, 0, a.length);
    }
    
    public static void main(String[] args) {
        final int SIZE = 1000000;
        String [] arr = new String[SIZE];
        initArray(arr);
        
        String[] b = new String[SIZE];
        String[] c = new String[SIZE];
        
        long t1 = System.currentTimeMillis();
        copySlow(arr, b);
        long t2 = System.currentTimeMillis();
        copyFast(arr, c);
        long t3 = System.currentTimeMillis();
        
        System.out.println(t2-t1);
        System.out.println(t3-t2); // 这个要小很多
    }
}
