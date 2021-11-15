package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Browser
		
		System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		
		// Launch the application
		driver.get("https://www.gmail.com");
		
		/*
		 * // userid
		 * driver.findElement(By.id("identifierId")).sendKeys("srinivasedara");
		 * 
		 * // User id Next
		 * driver.findElement(By.xpath(".//span[text()='Next']")).click();
		 * Thread.sleep(5000); //Password
		 * driver.findElement(By.name("password")).sendKeys("1234567");
		 * 
		 * // Pwd Next driver.findElement(By.xpath(".//span[text()='Next']")).click();
		 * 
		 */	
		
		
		WebElement userid = driver.findElement(By.xpath("(//input)[1]"));
		userid.sendKeys("sri");
		
	//	driver.findElement(By.linkText("Learn more")).click();
		
		driver.findElement(By.partialLinkText("Learn")).click();
		
	//	driver.findElement(By.partialLinkText("more")).click();
		
		
		
	}

}
