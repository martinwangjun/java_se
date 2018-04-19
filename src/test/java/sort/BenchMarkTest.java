package sort;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class BenchMarkTest {
    private static final int MAX = 100000;
    public int [] arr = new int[MAX];
    
    @Before
    public void initArray() {
        Random rnd = new Random();
        for(int i = 0; i < MAX; i++) {
            arr[i] = rnd.nextInt(MAX);
        }
//        for(int i = 0; i < MAX; i++) {
//            arr[i] = MAX - i;
//        }
//        Set<Integer> arrSet = new HashSet<>();
//        while(arrSet.size() < MAX) {
//            arrSet.add(rnd.nextInt(MAX * 100));
//        }
//        int i = 0;
//        Iterator<Integer> it = arrSet.iterator();
//        while(it.hasNext()) {
//            arr[i] = it.next();
//            i++;
//        }
    }
    
    @Test
    public void test() {
        int [] a = new int[MAX];
        int [] b = new int[MAX];
        int [] c = new int[MAX];
        int [] d = new int[MAX];
        long start = 0;
        long end = 0;
        
        System.arraycopy(arr, 0, a, 0, MAX);
        System.arraycopy(arr, 0, b, 0, MAX);
        System.arraycopy(arr, 0, c, 0, MAX);
        System.arraycopy(arr, 0, d, 0, MAX);
        
        System.out.println("----------- 开始 -----------");

        BubbleSort sort = new BubbleSort();
        start = System.currentTimeMillis();
        sort.sort(a);
        end = System.currentTimeMillis();
        System.out.println("冒泡法：" + (end - start) + " (" + start + " - " + end + ")");
        
        SelectionSort sort2 = new SelectionSort();
        start = System.currentTimeMillis();
        sort2.sort(b);
        end = System.currentTimeMillis();
        System.out.println("选择法：" + (end - start) + " (" + start + " - " + end + ")");
        
        InsertSort sort3 = new InsertSort();
        start = System.currentTimeMillis();
        sort3.sort(c);
        end = System.currentTimeMillis();
        System.out.println("插入法：" + (end - start) + " (" + start + " - " + end + ")");
        
        InsertSort sort4 = new InsertSort();
        start = System.currentTimeMillis();
        sort4.sort(d);
        end = System.currentTimeMillis();
        System.out.println("快速法：" + (end - start) + " (" + start + " - " + end + ")");
        
    }
}
