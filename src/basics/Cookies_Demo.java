package basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		if(cookies.isEmpty()) {
			System.out.println("No cookies are avialable for the application");
		}
		else {
			System.out.println("Cookies are available:"+cookies.size());
		}
		
		driver.close();
	}

}
