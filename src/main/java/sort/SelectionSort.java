package sort;

/**
 * 选择排序
 * 
 * 原理：
 * 1. 找出最大的元素，放到最后
 * 2. 找出第二大的元素，放到倒数第二。
 * 依次类推
 * 
 * @author martin.wang
 *
 */
public class SelectionSort {

    public void sort(int []arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // list(arr);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    
    public void sort2(int []arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            minIndex = arr.length - 1;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // list(arr);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    // 显示数组
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
