package com.vtiger.contactsTestAssignment;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.ExcelLibrary;
import com.vtiger.PomRepository.ContactPage;

public class SearchContact_with_OnefieldTest extends BaseClass
{
	@Test
	public void searchContact_with_OnefieldTest() throws IOException, InterruptedException
	{
		ExcelLibrary excelLibrary = new ExcelLibrary();
		String expectedcontactName = excelLibrary.getDataFromExcel("Searchcontact_with_onefield",1, 1);
		System.out.println(driver1.getTitle());
		if(driver1.getTitle().contains("vtiger CRM 5"))
		{
			excelLibrary.setCellvalue("Searchcontact_with_onefield", 7, 7,"login page is displayed");
			excelLibrary.setCellvalue("Searchcontact_with_onefield", 7, 8,"Pass");

		}
		if(driver1.getTitle().contains("Home"))
		{
			excelLibrary.setCellvalue("Searchcontact_with_onefield", 8, 7,"login page is displayed");
			excelLibrary.setCellvalue("Searchcontact_with_onefield", 8, 8,"Pass");
		}
		ContactPage contactpage = new ContactPage(driver1);
		homepage.HomePageContactLink();
		contactpage.sendDataToText(expectedcontactName);
		Thread.sleep(1000);
		contactpage.selectDropDown("Last Name");
		Thread.sleep(1000);
		contactpage.searchNowButton();
		Thread.sleep(1000);
		if(driver1.getPageSource().contains("SAM"))
		{
			excelLibrary.setCellvalue("Searchcontact_with_onefield", 9, 7,"contacts is displayed for SAM");
			excelLibrary.setCellvalue("Searchcontact_with_onefield", 9, 8,"Pass");
		}
		

	}

}
