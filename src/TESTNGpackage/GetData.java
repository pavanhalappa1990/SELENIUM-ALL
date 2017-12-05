package TESTNGpackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.testng.annotations.Test;

public class GetData 
{
	
	public static String fromExcel(String filepath,String sheetname,int rindex,int cindex)
	{
		String data = null;
		try
		{
			File f = new File("filepath");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetname);
			Row r = st.getRow(rindex);
			Cell c = r.getCell(cindex);
			//data = c.toString();
			//return data;
			data = c.getStringCellValue();
			System.out.println(data);
		}
		catch(Exception e)
		{}
		return data;
	}

	public static void main(String[] args) 
	{
		String data1 = GetData.fromExcel("C:/pavan-stuffs/Qspid-learn/readDatafromexcel.xlsx","sheet1", 0, 1);
		System.out.println(data1);
		// TODO Auto-generated method stub

	}

}
