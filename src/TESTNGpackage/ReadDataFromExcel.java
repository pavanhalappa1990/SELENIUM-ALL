package TESTNGpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel 
{
  @Test
  public void f()
  {
	  	try{
			  File f = new File("C:/pavan-stuffs/Qspid-learn/readDatafromexcel.xlsx");
			  //String excelFilePath = "Books.xlsx";
		      FileInputStream inputStream = new FileInputStream(f);
		       
		     // Workbook workbook = new XSSFWorkbook(inputStream);
		      //Sheet firstSheet = workbook.getSheetAt(0);
		      Workbook wb = WorkbookFactory.create(inputStream);
		      Sheet st = wb.getSheet("Sheet1");
		      Iterator<Row> iterator = st.iterator();
		       
		      while (iterator.hasNext()) 
		      {
		          Row nextRow = iterator.next();
		          Iterator<Cell> cellIterator = nextRow.cellIterator();
		           
		          while (cellIterator.hasNext()) 
		          {
		              Cell cell = cellIterator.next();
		               
		              switch (cell.getCellType()) 
		              {
		                  case Cell.CELL_TYPE_STRING:
		                      System.out.print(cell.getStringCellValue());
		                      break;
		                  case Cell.CELL_TYPE_BOOLEAN:
		                      System.out.print(cell.getBooleanCellValue());
		                      break;
		                  case Cell.CELL_TYPE_NUMERIC:
		                      System.out.print(cell.getNumericCellValue());
		                      break;
		              }
		              System.out.print(" - ");
		          }
		          System.out.println();
		      }
		       
		      wb.close();
		      inputStream.close();
		}
	  	catch(Exception e)
	  	{}
  }
}
