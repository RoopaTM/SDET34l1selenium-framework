package com.vtiger.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchmultipleData_Xl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fos = new FileInputStream("./src/test/resources/TestData.xlsx");

		Workbook book = WorkbookFactory.create(fos);
		Sheet sheet = book.getSheet("Sheet3");
		for(int i=0; i<=sheet.getLastRowNum();i++)
		{

			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			{
				System.out.println(sheet.getRow(i).getCell(j));
			}
		}
		book.close();

	}

}
