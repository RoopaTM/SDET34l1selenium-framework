package com.vtiger.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchmultipleData 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("loginData");
		
		Object[][] arr= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<=sheet.getLastRowNum();i++)
		{

			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			{
			arr[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();	
			}
		}
		//System.out.println(arr[i][]);


	}

}
