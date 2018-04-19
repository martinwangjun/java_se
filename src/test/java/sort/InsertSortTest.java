package sort;

import org.junit.Test;

public class InsertSortTest {
    
    @Test
    public void test() {
        int [] arr = {9, 7, 5, 3, 2, 1, 8,  4, 10, 6};
        InsertSort sorter = new InsertSort();
        sorter.sort(arr);
        sorter.list(arr);
    }
}
