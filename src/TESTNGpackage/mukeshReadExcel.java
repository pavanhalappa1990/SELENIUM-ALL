package TESTNGpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class mukeshReadExcel 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\pavan-stuffs\\Qspid-learn\\mukeshfromexcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data1=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("data from first cell is "+data1);
		String data2=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("data from first cell is "+data2);
		
	}

}
