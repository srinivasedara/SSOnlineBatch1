package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Actions action =new Actions(driver);
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		driver.switchTo().frame(frame.get(0));
		
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).perform();
		Thread.sleep(3000);
		action.release(driver.findElement(By.xpath("//div[@id='draggable']"))).perform();
		
	}
}
