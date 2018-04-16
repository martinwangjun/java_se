package sort;

import org.junit.Test;

public class BubbleSortTest {
    
    @Test
    public void test() {
        int [] arr = {5, 3, 2, 1, 4};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(arr);
        sorter.list(arr);
    }
}
