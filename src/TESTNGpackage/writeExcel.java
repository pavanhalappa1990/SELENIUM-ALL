package TESTNGpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.testng.annotations.Test;

public class writeExcel 
{
	public void FileWrite()
	{
		try
			{
				File f = new File("C:\\pavan-stuffs\\Qspid-learn\\write-on-file.xlsx");
				FileInputStream fis = new FileInputStream(f);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet1 = wb.getSheetAt(0);
				sheet1.getRow(0).createCell(0).setCellValue("screw");
				sheet1.getRow(1).createCell(0).setCellValue("you");
				//Row r = st.getRow(0);
				//Cell c = r.getCell(0);
				
				FileOutputStream fos = new FileOutputStream(f);
				//c.setCellValue("bose");
				wb.write(fos);
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
	}
	

}
