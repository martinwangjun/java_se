package sort;

/**
 * 插入法排序
 * 
 * @author martin.wang
 *
 */
public class InsertSort {
    public void sort(int [] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            // list(arr);
            if (arr[i - 1] > arr[i]) {
                temp = arr[i];
                int j = i;
                while (j > 0 && arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
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
