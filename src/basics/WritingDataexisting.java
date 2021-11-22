package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataexisting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\HP\\Desktop\\Outlookdata.xlsx");
		FileInputStream fi = new FileInputStream("C:\\Users\\HP\\Desktop\\Outlookdata.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		sheet.getRow(2).createCell(5).setCellValue("passed");
		sheet.getRow(3).createCell(5).setCellValue("failed");
		
		FileOutputStream fo = new FileOutputStream(file);
		
		book.write(fo);
		fo.close();	
		book.close();
		
	}

}
