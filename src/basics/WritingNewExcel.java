package basics;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingNewExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\HP\\Desktop\\data.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Sheet1");
		
		sheet.createRow(2).createCell(5).setCellValue("passed");
		sheet.createRow(4).createCell(8).setCellValue("failed");
		
		FileOutputStream fo = new FileOutputStream(file);
		
		book.write(fo);
		fo.close();	
		book.close();
	}

}
