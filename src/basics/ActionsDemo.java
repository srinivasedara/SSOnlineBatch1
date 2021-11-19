package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		Thread.sleep(4000);
		
		Actions action = new Actions(driver);
		
		WebElement electronics = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		
		action.moveToElement(electronics).perform();
		Thread.sleep(4000);
		
		WebElement element1 = driver.findElement(By.xpath("//div[@class='_3XS_gI']//a[7]"));
		action.moveToElement(element1).perform();
		
		action.click().perform();
		
		action.moveToElement(element1).click().build().perform();
		
		action.click(element1).perform();
		
		action.sendKeys(Keys.CONTROL).sendKeys("A").build().perform();
		
	}

}
