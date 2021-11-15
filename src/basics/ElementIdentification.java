package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIdentification {

	public static void main(String[] args) {
		
		// Launch Browser
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		// Maximizing the browser
		driver.manage().window().maximize();
			
		// ApplicationLaunch
		driver.get("https://www.timesjobs.com/candidate/register.html?pageFlow=TJ_HOME");
		
		// input on EmailId
		driver.findElement(By.id("emailAdd")).sendKeys("selenium");
		
		// Password
		driver.findElement(By.id("passwordField")).sendKeys("abcd1234");

		// ConfirmPassword
		driver.findElement(By.name("retypePassword")).sendKeys("abcd1234");
		
		// MobileNumber
	//	driver.findElement(By.className("mobno fl inpt-typ")).sendKeys("1234689765");
		driver.findElement(By.name("mobNumber")).sendKeys("1234689765");
		
		// resume - checkbox
	//	driver.findElement(By.name("dontHaveResume")).click();
		
		//submit button
	//	driver.findElement(By.className("button3 mrgn_t10 button_dft")).click();
		WebElement submit = driver.findElement(By.id("basicSubmit"));
		
	//	driver.findElement(By.xpath(".//div[@id='basicFormButton']//button")).click();
		
	/*
	 * JavascriptExecutor js = ((JavascriptExecutor)driver);
	 * js.executeScript("arguments[0].scrollIntoView(true);",submit);
	 * 
	 * submit.click();
	 */	
		System.out.println("end");
		
	}

}
