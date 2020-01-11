package Basic;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch_data {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		//Step1
		FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
		//Step2
		Workbook wb=WorkbookFactory.create(fis);
		//step3
		Sheet sh = wb.getSheet("Sheet1");
		//step4
		Row r = sh.getRow(0);
		//step5
		Cell c = r.getCell(0);
		//step6
		String val = c.getStringCellValue();
		System.out.println(val);
		
		

	}

}

