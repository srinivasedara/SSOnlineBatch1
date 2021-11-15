package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserLaunch {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		// Chrome
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		driver = new ChromeDriver();	
		// Firefox
		System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
		// Opera
		System.setProperty("webdriver.opera.driver", "./BrowserDrivers/operadriver.exe");
		driver = new OperaDriver();
		
		// Edge
		System.setProperty("webdriver.edge.driver", "./BrowserDrivers/msedgedriver.exe");
		driver = new EdgeDriver();
		
	}
	
}
