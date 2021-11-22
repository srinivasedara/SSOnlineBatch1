package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Outlook {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		
		File file = new File("C:\\Users\\HP\\Desktop\\OutlookData.xlsx");
		FileInputStream fi = new FileInputStream(file);
		
		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheet("Outlook_Login");
	
		int datarows = sheet.getLastRowNum();
		
		for(int i=1;i<=datarows-1;i++) {
			
			String browserName = sheet.getRow(i).getCell(0).getStringCellValue();
			String url = sheet.getRow(i).getCell(1).getStringCellValue();
			String userid = sheet.getRow(i).getCell(2).getStringCellValue();
			String password = sheet.getRow(i).getCell(3).getStringCellValue();
			String expected = sheet.getRow(i).getCell(4).getStringCellValue();
			
			// Browser
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver", "./BrowserDrivers/operadriver.exe");
				driver = new OperaDriver();
			}
			else if(browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "./BrowserDrivers/msedgedriver.exe");
				driver = new EdgeDriver();	
			}
			driver.manage().window().maximize();
			
			// Application
			driver.get(url);
			
			// Sign-in
			driver.findElement(By.xpath("//a[text()='Sign in']")).click();
			Thread.sleep(10000);
			
			// Userid
			driver.findElement(By.xpath("//input[@name='loginfmt']")).sendKeys(userid);
			// Next
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(5000);
			// Validating UserID data -- Positive
			if(driver.findElement(By.xpath("//input[@name='passwd']")).isDisplayed()) {
				driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(password);
				// Sign-in
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				Thread.sleep(5000);
				
				// Validating the Password data -- Positive
				if(driver.getTitle().contains(userid)) {
					sheet.getRow(i).createCell(5).setCellValue(driver.getTitle());
					sheet.getRow(i).createCell(6).setCellValue("Passed");
				}
				else {
					String actualpwdMsg = driver.findElement(By.xpath("//div[@id='passwordError']")).getText();
					sheet.getRow(i).createCell(5).setCellValue(actualpwdMsg);
					
					// Validating passwordMsg
					if(actualpwdMsg.equals(expected)) {
						sheet.getRow(i).createCell(6).setCellValue("Passed");
					}
					else {
						sheet.getRow(i).createCell(6).setCellValue("Failed");
					}
				}
				
			}
			else {
				String actualUsermsg = driver.findElement(By.xpath("//div[@id='usernameError']")).getText();
				sheet.getRow(i).createCell(5).setCellValue(actualUsermsg);
				
				// Validating usermsg
				if(actualUsermsg.equals(expected)) {
					sheet.getRow(i).createCell(6).setCellValue("Passed");
				}
				else {
					sheet.getRow(i).createCell(6).setCellValue("Failed");
				}
			}
			driver.close();
		}
		FileOutputStream fo = new FileOutputStream(file);
		book.write(fo);
		fo.close();
		book.close();
	}

}
