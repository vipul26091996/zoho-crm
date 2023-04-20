package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUtilities {
	
	@DataProvider(name="excel login data")
	public String[][] readLoginDatafromExcel() throws EncryptedDocumentException, IOException
	{
		String excelSheetName = "login";
		File file = new File(System.getProperty("user.dir")+"/src/test/resources/testdata/loginexcel_data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(excelSheetName);
		int totalrows = sheet.getLastRowNum();
		Row rowcell = sheet.getRow(0);
		int totalcols = rowcell.getLastCellNum();
		DataFormatter format = new DataFormatter();
		String testData[][]=new String[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				testData[i-1][j]=  format.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
			}
		}
		return testData;
	}
	
	//only for testing purpose
	@Test
	public void createExcel() throws IOException
	{
		String filename = "D:\\TestExcel.xlsx";
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("Months");
		HSSFRow rowhead = sheet.createRow(0);
		rowhead.createCell(0).setCellValue("Months");
		rowhead.createCell(1).setCellValue("Days");
		HSSFRow row = sheet.createRow(1);
		row.createCell(0).setCellValue("January");
		row.createCell(1).setCellValue("31");
		HSSFRow row1 = sheet.createRow(2);
		row1.createCell(0).setCellValue("February");
		row1.createCell(1).setCellValue("28");
		HSSFRow row2 = sheet.createRow(3);
		row2.createCell(0).setCellValue("March");
		row2.createCell(1).setCellValue("31");
		FileOutputStream fileout = new FileOutputStream(filename);
		wb.write(fileout);
		fileout.close();
		wb.close();
		System.out.println("Excelfile has been generated successfully");
	}

}
