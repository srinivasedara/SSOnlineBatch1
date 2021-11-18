package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidatingAlertonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//UserID
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("qwr");
		
		// Next
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		new WebDriverWait(driver, 10)
        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='o6cuMc']")));
		
		String expectedalertMsg = "Couldn't find your Google Account1";
		
		String actualalertMsg = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		
		// Validating the alert message
		
		if(actualalertMsg.equals(expectedalertMsg)) {
			System.out.println("Passed:The actual message is:"+actualalertMsg);
		}
		else {
			System.out.println("Fail:The expected message is:"+expectedalertMsg+" but, actual message is:"+actualalertMsg);
		}
		
		driver.close();
	}

}
