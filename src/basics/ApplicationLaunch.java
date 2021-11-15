package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationLaunch {

	public static void main(String[] args) {
		
		// Launch Browser
	
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();	
		
		// ApplicationLaunch
		driver.get("https://gmail.com");

	}

}
