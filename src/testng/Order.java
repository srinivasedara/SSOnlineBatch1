package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Order {
	
	WebDriver driver;
	
	@Test
	public void chromeBrowser() {
	
		System.out.println("chromeBrowser");
		
	}
	@Test
	public void chromeBrowserB() {
	
		System.out.println("chromeBrowserB");
		
	}
	@Test
	public void firefoxBrowserC() {
	
		System.out.println("FirefoxBrowserC");
	}
	@Test
	public void firefoxBrowserA() {
	
		System.out.println("FirefoxBrowserA");
		
	}
	
	

}
