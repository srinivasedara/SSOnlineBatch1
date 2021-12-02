package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Order2 {
	
	WebDriver driver;
	
	@Test(priority=0)
	public void chromeBrowser() {
	
		System.out.println("chromeBrowser");
		
	}
	@Test(priority=2)
	public void chromeBrowserB() {
	
		System.out.println("chromeBrowserB");
		
	}
	@Test(priority=1)
	public void firefoxBrowserC() {
	
		System.out.println("FirefoxBrowserC");
	}
	@Test(priority=3)
	public void firefoxBrowserA() {
	
		System.out.println("FirefoxBrowserA");
		
	}

}
