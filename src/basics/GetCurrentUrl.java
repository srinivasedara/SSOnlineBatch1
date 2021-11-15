package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String expectedText = "recover";
		
		driver.findElement(By.xpath("//*[text()='Forgotten password?']")).click();
		
		String actualUrl = driver.getCurrentUrl();
		
		if(actualUrl.contains(expectedText)) {
			System.out.println("Opens the expected page");
		}
		else {
			System.out.println("Opens the different page:"+actualUrl);
		}
		
		
		driver.close();
		
	}
}
