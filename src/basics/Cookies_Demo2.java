package basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String expectedCookieName = "fr";
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		if(cookies.isEmpty()) {
			System.out.println("No cookies are avialable for the application");
		}
		else {
			System.out.println("Cookies are available:"+cookies.size());
			
			for(Cookie cookie:cookies) {
				String actualCookieName = cookie.getName();
				if(actualCookieName.equals(expectedCookieName)) {
					System.out.println("Cookie matched with expected:"+cookie);
					break;
				}
				else {
					continue;
				}
			}
		}
		
		driver.close();
	}

}
