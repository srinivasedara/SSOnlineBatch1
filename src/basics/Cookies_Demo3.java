package basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Demo3 {

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
			System.out.println("Cookies are available defaultly:"+cookies.size());
		}
		
		Cookie usercookie = new Cookie("sri","sri@1234");
		driver.manage().addCookie(usercookie);
		
		cookies = driver.manage().getCookies();
		
		System.out.println("Total cookies after adding user cookie:"+cookies.size());
		
		System.out.println(driver.manage().getCookieNamed("sri"));
		
		

	}

}
