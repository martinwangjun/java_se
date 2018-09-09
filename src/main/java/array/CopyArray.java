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
    
    public void initArray(String[] arr) {
        for(int i = 0, len = arr.length; i< len; i++) {
            arr[i] = (i % 2 == 0) ? "白日依山尽" : "黄河入海流";
        }
    }
    
    public void copySlow(String[] a, String[] b) {
        for(int i = 0, len = a.length; i < len; i++) {
            b[i] = new String(a[i]);
        }
    }
    
    public void copyFast(String[] a, String[] c) {
        System.arraycopy(a, 0, c, 0, a.length);
    }
}
