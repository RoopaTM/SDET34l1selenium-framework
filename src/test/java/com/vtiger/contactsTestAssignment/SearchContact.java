package com.vtiger.contactsTestAssignment;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.ExcelLibrary;
import com.vtiger.PomRepository.ContactPage;

public class SearchContact extends BaseClass
{
	@Test
	public void SearchContactTest() throws IOException, InterruptedException
	{
		ExcelLibrary excelLibrary = new ExcelLibrary();
		System.out.println(driver1.getTitle());
		if(driver1.getTitle().contains("CRM 5 "))
		{
			
			
			excelLibrary.setCellvalue("searchcontact", 6, 7,"login page is displayed");
			excelLibrary.setCellvalue("searchcontact", 6, 8,"Pass");

		}
		if(driver1.getTitle().contains("Home"))
		{
			excelLibrary.setCellvalue("searchcontact", 7, 7,"Home page is displayed");
			excelLibrary.setCellvalue("searchcontact", 7, 8,"Pass");

		}
		ContactPage contactpage = new ContactPage(driver1);
		homepage.HomePageContactLink();
		System.out.println(driver1.getTitle());
		if(driver1.getTitle().contains("Home"))
		{
			excelLibrary.setCellvalue("searchcontact", 8, 7,"contact page is displayed");
			excelLibrary.setCellvalue("searchcontact", 8, 8,"Pass");

		}
		contactpage.clickOnAlphaBet();
		if(driver1.getPageSource().contains("c"))
		{
			excelLibrary.setCellvalue("searchcontact", 9, 7,"contact information with letter displayed is displayed");
			excelLibrary.setCellvalue("searchcontact", 9, 8,"Pass");
		}
	}

}
