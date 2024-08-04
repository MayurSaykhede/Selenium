package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File(".\\test-data\\Demo Web Shop.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("RegisterCredentials");
		int rowNum = sheet.getPhysicalNumberOfRows();
		for(int i=0; i<rowNum; i++) {
			Row row = sheet.getRow(i);
			int cellNum = row.getPhysicalNumberOfCells();
			for(int j=0; j<cellNum; j++) {
				Cell cell = row.getCell(j);
				String data = cell.toString();
				System.out.print(data + "\t"); 
			}
			System.out.println();
		}
		
		//Cell cell = workbook.getSheet("RegisterCredentials").getRow(0).getCell(0);
		//System.out.println(cell);
		
	}

}
