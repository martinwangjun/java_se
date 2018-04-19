package sort;

import org.junit.Test;

public class QuickSortTest {
    @Test
    public void test() {
        int [] arr = {9, 7, 5, 3, 2, 1, 8,  4, 10, 6};
        QuickSort sorter = new QuickSort();
        sorter.sort(arr, 0, 9);
        sorter.list(arr);
    }
}
