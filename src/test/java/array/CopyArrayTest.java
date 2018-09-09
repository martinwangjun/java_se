package array;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;
public class CopyArrayTest {
    private static final Logger logger = LoggerFactory.getLogger(CopyArrayTest.class);
   
	@Test
	public void copyTest() {
		final int SIZE = 100000;
		CopyArray copyArray = new CopyArray();
        String [] arr = new String[SIZE];
        copyArray.initArray(arr);
        String[] b = new String[SIZE];
        String[] c = new String[SIZE];
        long t1 = System.currentTimeMillis();
        copyArray.copySlow(arr, b);
        long t2 = System.currentTimeMillis();
        copyArray.copyFast(arr, c);
        long t3 = System.currentTimeMillis();
        
        logger.error("使用普通的数组拷贝{}", t2 - t1);
        logger.error("使用本地方法的数组拷贝{}", t3 - t2);
        TestCase.assertTrue((t3 - t2) < (t2 - t1));
	}
}
