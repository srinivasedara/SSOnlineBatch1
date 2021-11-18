package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidatingAlertWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String expectedalertMessage = "Please enter a valid user name";
		// sign in element
		driver.findElement(By.xpath("//*[@name='proceed']")).click();
		
		new WebDriverWait(driver, 10)
        .until(ExpectedConditions.alertIsPresent());
		// Switching the cursor point from web-page to alert
		Alert alert = driver.switchTo().alert();
		// Taking the message from an alert
		String actualalertMessage = alert.getText();
		// To click on the OK button at alert
		alert.accept();
		// Validating alert message
		if(actualalertMessage.equals(expectedalertMessage)) {
			System.out.println("Passed - The actaul Message is: "+actualalertMessage);
		}
		else {
			System.out.println("Fail:The expected message is:"+expectedalertMessage+" but, actual message is:"+actualalertMessage);
		}
		// Closing the browser	
		driver.close();
	}

}
