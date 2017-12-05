package TESTNGpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MukeshWriteExcel 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\pavan-stuffs\\Qspid-learn\\mukeshwriteexcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		sheet1.getRow(0).createCell(1).setCellValue("dead");
		sheet1.getRow(0).createCell(2).setCellValue("beat");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
	}

}

