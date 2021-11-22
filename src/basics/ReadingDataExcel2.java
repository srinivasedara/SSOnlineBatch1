package basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataExcel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Outlookdata.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		// Rows
		for(int i=1;i<=rows-1;i++) {
			int cells = sheet.getRow(i).getLastCellNum();
			// Cells
			for(int j=0;j<=cells-1;j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+",");
			}
			System.out.println("\n");
		}	
		book.close();
		
	}

}
