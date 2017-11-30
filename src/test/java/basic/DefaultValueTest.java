package basic;

import org.junit.Test;

import junit.framework.TestCase;

public class DefaultValueTest {
    private int a;
    private static int i = 1;
    
    @Test
    public void testDefaultValue() {
        int b;
        DefaultValueTest dValueTest = new DefaultValueTest();
        TestCase.assertEquals(0, dValueTest.a);
        // System.out.println(b); // 报错，无法通过编译
    }
    
    @Test
    public void testStaticMemberVariable() {
        DefaultValueTest d1 = new DefaultValueTest();
        DefaultValueTest d2 = new DefaultValueTest();
        d1.i++;
        TestCase.assertEquals(2, d2.i);
    }
}
