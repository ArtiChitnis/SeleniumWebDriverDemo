package TestngDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataUtil {
	
	
	
	public static ArrayList<Object[]> getDataFromExcel() throws IOException {
		
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		
		FileInputStream in = new FileInputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\WebdriverDemo\\src\\TestngDemo\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(in);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		for(int i= 2;i <= rowCount;i++)
		{
			//XSSFRow row = sheet.getRow(i);
			for (int j = 1; j < colCount; j++) // this will give column count
			{
				 
				//String value = row.getCell(j).toString(); // in this row we have to get the cell at current row & column & read its value by toString method
				
			String username = sheet.getRow(i).getCell(j).toString();
			


			
			Object obj[] = {username, password};
			mydata.add(obj);
			
		}
		
		return mydata;
		
		
	}
	}
}
