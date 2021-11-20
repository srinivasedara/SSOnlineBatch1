package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo_Dropdown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjM3NDIzMzQzLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		
		String expectedMonth = "Aug";
		
		List<WebElement> option = select.getOptions();
		int flag = 0;
		for(int i=0;i<=option.size()-1;i++) {
			if(option.get(i).getText().equals(expectedMonth)) {
				select.selectByIndex(i);
				flag = flag+1;
				System.out.println("Selected the month as:"+expectedMonth);
				break;
			}
		}
		if(flag==0) {
			System.out.println("No value with an: "+expectedMonth);
		}
			
		driver.close();
	}

}
