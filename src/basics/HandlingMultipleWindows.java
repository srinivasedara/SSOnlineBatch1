package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		// Login
		driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();
		// Login at popup window
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(4000);
		// Continue to Netbanking
		driver.findElement(By.xpath("(//a[text()='CONTINUE TO THE NEW LOGIN PAGE FOR NETBANKING'])[2]")).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame("login_page");
		
		// credit card login
		driver.findElement(By.xpath("//a[text()='Credit Card only? Login here']")).click();
		Thread.sleep(4000);
		String expectedTitle = "Welcome to HDFC Bank Credit Card";
		Set<String> windowids = driver.getWindowHandles();
		
		for(String id:windowids) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals(expectedTitle)) {
				System.out.println(driver.getTitle());
				break;
			}
			else {
				continue;
			}	
		}
		
		// UserID
		driver.findElement(By.xpath("//input[@name='fldLoginUserId' and @type='text']")).sendKeys("sriedara");
		// password
		driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("12345667");
		
		driver.close();
	}

}
