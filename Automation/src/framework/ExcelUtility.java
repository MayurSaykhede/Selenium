package framework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	/**
	 * This method is used to fetch Data From Excel Sheet
	 * 
	 * @param sheet --> Pass sheet name 
	 * @param row --> Pass row index
	 * @param cell --> Pass cell index
	 * @return String --> Data in the form of String
	 */
	public static String readDataFromExcel(String sheet, int row, int cell) {
		File f = new File(".\\test-data\\Demo Web Shop.xlsx");
		
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(f);
			workbook  = WorkbookFactory.create(fis);
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		String data = workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
		return data;
	}

}
