package TESTNGpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;



public class readFromExcel 
{
	@Test
	public void readexcel() 
	{
		String data = null;
		try{
			
				//this peace of code is to get data from a single row
				//-----------------------------------------------------------------
				/*File f = new File("C:/pavan-stuffs/Qspid-learn/readDatafromexcel.xlsx");
				FileInputStream fis = new FileInputStream(f);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet st = wb.getSheet("Sheet2");
				Row r = st.getRow(0);
				int lastcellno = r.getLastCellNum();
				System.out.println(lastcellno);
				for(int i=0;i<4;i++)
				{
					Cell c = r.getCell(i);
					data = c.toString();
					System.out.println(data);
				}*/
				//------------------------------------------------------------------
				//this peace of code is to get data from single cell in a single row
				//------------------------------------------------------------------
			    File f = new File("C:/pavan-stuffs/Qspid-learn/readDatafromexcel.xlsx");
				FileInputStream fis = new FileInputStream(f);
				Workbook wkb = WorkbookFactory.create(fis);
				Sheet st = (Sheet) wkb.getSheet("sheet2");
				Row r = st.getRow(0);
				Cell c = r.getCell(0);
				//data = c.toString();
				data = c.getStringCellValue();
				System.out.println(data);	
				//------------------------------------------------------------------
				//this peace of code is to get data from a cell in multiple rows
				//------------------------------------------------------------------
				/*File f = new File("C:/pavan-stuffs/Qspid-learn/readDatafromexcel.xlsx");
				FileInputStream fis = new FileInputStream(f);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet st = wb.getSheet("Sheet1");
				int lastrowno = st.getLastRowNum();
				for(int i=0; i<lastrowno;i++)
				{
					Row r = st.getRow(i);
					Cell c = r.getCell(0);
					data = c.toString();
					System.out.println(data);
										
				}*/
				//---------------------------------------------------------------------
				
				
				
				
		}
		catch(Exception e)
		{
			
		}
	}
}
