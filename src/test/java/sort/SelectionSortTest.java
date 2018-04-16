package sort;

import org.junit.Test;

public class SelectionSortTest {
    @Test
    public void test() {
        int [] arr = {9, 7, 5, 3, 2, 1, 8,  4, 10, 6};
        SelectionSort sorter = new SelectionSort();
        sorter.sort2(arr);
        System.out.println("排序结果：");
        sorter.list(arr);
    }
}
