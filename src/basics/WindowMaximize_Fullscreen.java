package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximize_Fullscreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window to screen size
		
		driver.manage().window().maximize();
		
		// To make the page full screen
		
		driver.manage().window().fullscreen();
	}

}
