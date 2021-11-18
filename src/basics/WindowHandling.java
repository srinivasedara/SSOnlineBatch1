package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		// It will return the single window id
		System.out.println(driver.getWindowHandle());
		// It will return the all the window id's from a session
		System.out.println(driver.getWindowHandles());
		
		driver.close();
	
	}

}
