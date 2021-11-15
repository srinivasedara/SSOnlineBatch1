package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		
		// Launch the application
		driver.get("https://www.gmail.com");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("Total No.of elements with tag - a:"+elements.size());
		
		for(WebElement a : elements) {
			System.out.println(a.getText());
		}
		driver.close();
	}

	
}
