package dataDrivenTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream out = new FileOutputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\WebdriverDemo\\src\\dataDrivenTest\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet");
		
		for (int i = 0; i < 5; i++) {
			
			XSSFRow row = sheet.createRow(i);
			
			for (int j = 0; j < 4; j++) {
				
				row.createCell(j).setCellValue("XYZ");
			}
			
		}
		
		workbook.write(out);
		out.close();
		
		System.out.println("Writing data into excel is completed");
		
		
		
	}

}
