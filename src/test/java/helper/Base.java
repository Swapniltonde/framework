package helper;

import java.io.*;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base {
	
	public void readExcel() {
		
		File file = new File("E:\\WS_Inportia\\nnnnn\\src\\test\\java\\testdata\\exe.xlsx");
		
	try {
		FileInputStream os = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(os);
			
			XSSFSheet sheet = wb.getSheetAt(0) ;
			XSSFRow rw = sheet.getRow(1);
			XSSFCell ce =rw.getCell(5);
		
			String st = ce.getStringCellValue();
			System.out.println(st);
			
			//wb.createSheet();
			
			
			//wb.write(os);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void writeExcel() {
		
		File file = new File("E:\\WS_Inportia\\nnnnn\\src\\test\\java\\testdata\\exe.xlsx");
		try {
			
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet() ;
			XSSFRow rw = sheet.createRow(1);
			XSSFCell ce =rw.createCell(5);
			ce.setCellValue("hello");
			
			//wb.createSheet();
			
			FileOutputStream os = new FileOutputStream(file);
			wb.write(os);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
