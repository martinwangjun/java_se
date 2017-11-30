package basic;

import org.apache.log4j.Logger;

public class FinalizeDemo {
    private static final Logger logger = 
            Logger.getLogger(FinalizeDemo.class);
    
    public class TestClass{
        public TestClass() {
            logger.debug("Test Class init.");
        }
        
        @Override
        protected void finalize() throws Throwable {
            logger.debug("Test Class finalized.");
        }
    }
    
    public static void main(String[] args) throws Throwable {
        TestClass tc = new FinalizeDemo().new TestClass();
        // finalize()后，tc就被垃圾回收了吗？
        tc.finalize();
        System.out.println(tc instanceof TestClass);
        // 具体什么时候tc被垃圾回收的，不知道。
    }
}
