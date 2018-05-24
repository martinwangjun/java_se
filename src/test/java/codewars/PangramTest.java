package codewars;

/***
 * @see https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java
 * 
 * @author martin.wang
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class PangramTest {
    @Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }
}
