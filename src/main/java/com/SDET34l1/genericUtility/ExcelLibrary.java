package com.SDET34l1.genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class is used to maintain all excel specific common methods
 * @author Roopa
 *
 */
public class ExcelLibrary 
{
	   static Workbook workbook;
	
	
	
/**
 * This method is used to fetch the data from the excel sheet
 * @param filePath
 * @param sheetName
 * @param rowNumber
 * @param cellNumber
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public String getDataFromExcel(String sheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, IOException
	{
	    
		String data = workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	     return data;  
	}
	
	
	
	public static Object[][] getMultltipleDataFromExcel(String sheetName)
	{
		   Sheet sheet = workbook.getSheet(sheetName);
		Object[][] arr= new Object[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<=sheet.getLastRowNum();i++)
		{

			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			{
			arr[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();	
			}
		}
		return arr;
		
		
	}
	/**
	 * this method is used to open the excel
	 * @param filePath
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void openExcel(String filePath) throws EncryptedDocumentException, IOException
	{
	    
	   FileInputStream file = new FileInputStream(filePath);
	   workbook=WorkbookFactory.create(file);  
	}
	
	/**
	 * this method is used to sav the data into the excel file
	 * @param filesavepath
	 * @throws IOException
	 */
	public  void writeIntoExcel(String filesavepath) throws IOException
	{
		FileOutputStream file2 = new FileOutputStream(filesavepath);
		workbook.write(file2);
	}
	
	/**
	 * 
	 * @param filepath
	 * @throws IOException
	 */
	public  void closeExcel() throws IOException
	{
		workbook.close();
	}
	/**
	 * This method is used to set the Value into Excel
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @param value
	 */
	public  void setCellvalue(String sheetName,int rowNumber,int cellNumber,String value)
	{
		workbook.getSheet(sheetName).getRow(rowNumber).createCell(cellNumber).setCellValue(value);
	}

}
