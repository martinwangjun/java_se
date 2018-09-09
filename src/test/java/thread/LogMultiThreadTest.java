package thread;

import org.junit.Test;

public class LogMultiThreadTest {
	@Test
	public void runTest() {
		for (int i = 0; i < 1000; i++) {
			LogMultiThread lmt = new LogMultiThread();
			Thread t = new Thread(lmt, "Thread" + i);
			t.start();
		}
	}
}
