package mysoft.Utilities;

import mysoft.Basedriver.BaseDriver;

public class CommonMethods extends BaseDriver {
	
	public  static void timeout() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public  static void timeout(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	
}
