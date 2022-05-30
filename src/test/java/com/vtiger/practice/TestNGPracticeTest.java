package com.vtiger.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.ExcelLibrary;
import com.SDET34l1.genericUtility.Iconstantpath;

public class TestNGPracticeTest 
{

	@Test(dataProvider = "loginData")
	public void practiceTest(String un,String pwd) throws IOException, InterruptedException
	{
	  Reporter.log(un+"  ----->   "+pwd,true);
    }
	
@DataProvider
public Object[][] loginData() throws EncryptedDocumentException, IOException
{
	//ExcelLibrary.openExcel(Iconstantpath.EXCELFILE_PATH);
	return ExcelLibrary.getMultltipleDataFromExcel("loginData");
	
}
}