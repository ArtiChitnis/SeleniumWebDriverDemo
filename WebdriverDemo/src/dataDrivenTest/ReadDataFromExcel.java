package dataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
			FileInputStream in = new FileInputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\WebdriverDemo\\src\\dataDrivenTest\\Employee.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(in);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			int rowcount = sheet.getLastRowNum(); // returns the np.of rows
			int columncount = sheet.getRow(0).getLastCellNum(); // returns column count
			System.out.println("The Row Count is "+rowcount);
			System.out.println("The Column Count is "+columncount);
			
			for (int i = 0; i < rowcount; i++) // this is used for the rows 
				
			{
				//XSSFRow row = sheet.getRow(i); //focus on current row returns the entire row
				//System.out.println(row);
				for (int j = 0; j < columncount; j++) // this will give column count
				{
					//is a generic method returns all the cells in sheet whatever the datatype 
					//String value = row.getCell(j).toString(); // in this row we have to get the cell at current row & column & read its value by toString method
					//String value = row.getCell(j).getStringCellValue(); will give only string datatype values
					//double value1 = row.getCell(j).getNumericCellValue(); will give only numeric datatype values
					//boolean value1 = row.getCell(j).getBooleanCellValue(); will give only boolean data type vales
					//System.out.print("  " +value);
					
					String username = sheet.getRow(i).getCell(j).toString();
					System.out.println(username);
				}
				System.out.println();
				
			}
			
			
			
		
		
	
		

	}

}
