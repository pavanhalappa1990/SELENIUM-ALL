package TESTNGpackage;

import org.testng.annotations.Test;

public class getDataInDiffClass 
{
	@Test
	public void b()
	{
		String data = GetData.fromExcel("C:/pavan-stuffs/Qspid-learn/readDatafromexcel.xlsx", "sheet1", 0, 0);
		System.out.println(data);
		
	}
}
