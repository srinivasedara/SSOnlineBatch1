package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String expectedText = "Facebook";
		
		/*
		 * String actualText = driver.findElement(By.xpath(
		 * "//img[@src='https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg']")).
		 * getAttribute("alt");
		 * 
		 * if(actualText.equalsIgnoreCase(expectedText)) {
		 * System.out.println("Opens the "+expectedText+ " application"); } else {
		 * System.out.println("Opens the different application"); }
		 */	
		
		String actualText = driver.getTitle();
		
		if(actualText.contains(expectedText)) {
			System.out.println("Opens the "+expectedText+ " application");
		}
		else {
			System.out.println("Opens the different application with title:"+actualText);
		}
		
		
		driver.close();
		
	}
}
