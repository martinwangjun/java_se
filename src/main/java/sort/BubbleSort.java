package sort;

/**
 * 冒泡法排序
 * 
 * 优点：简单，易学
 * 缺点：效率大大的差，O(N^2)
 * 
 * @author martin.wang
 *
 */
public class BubbleSort {
    
    /**
     * 最基本的冒泡法排序
     * @param arr
     */
    public void sort(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public void list(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                System.out.print(arr[i] + " -> ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
}
