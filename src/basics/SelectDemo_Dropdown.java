package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjM3NDIzMzQzLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		
		select.selectByVisibleText("Jun");
		
		List<WebElement> option = select.getOptions();
		
		for(WebElement opt : option) {
			System.out.println(opt.getText());
		}
	
	//	select.deselectByVisibleText("Jun");
		
	}

}
