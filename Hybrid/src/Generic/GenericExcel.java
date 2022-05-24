package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericExcel {
	
	
		public static String getData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
		{
			String val=" ";
			FileInputStream fis = new FileInputStream("./excel/Advance.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			val=c.toString();
			return val;
		}
	}
	
