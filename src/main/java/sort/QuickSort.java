package sort;

public class QuickSort {
    public void sort(int[] unsorted, int low, int high){
        int loc = 0;
        if(low < high){
            loc = partition(unsorted, low, high);
            sort(unsorted, low, loc - 1);
            sort(unsorted, loc + 1, high);
        }
    }
    
    public int partition(int[] unsorted, int low, int high){
        int pivot = unsorted[low];
        while(low < high){
            while (low < high && unsorted[high] > pivot) {
                high--;
            }
            unsorted[low] = unsorted[high];
            while (low < high && unsorted[low] <= pivot) {
                low++;
            }
            unsorted[high] = unsorted[low];
        }
        unsorted[low] = pivot;
        return low;
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
