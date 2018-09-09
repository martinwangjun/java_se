package thread;

import org.apache.log4j.Logger;

public class LogMultiThread implements Runnable{

	private final Logger LOGGER = Logger.getLogger(LogMultiThread.class);
	
	@Override
	public void run() {
		LOGGER.info("LOG" + Thread.currentThread().getName());		
	}
}
