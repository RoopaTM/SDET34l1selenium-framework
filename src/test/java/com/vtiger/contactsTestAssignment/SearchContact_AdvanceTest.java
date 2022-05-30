package com.vtiger.contactsTestAssignment;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.ExcelLibrary;
import com.vtiger.PomRepository.ContactPage;
import com.vtiger.PomRepository.SearchPage;

public class SearchContact_AdvanceTest extends BaseClass
{
	@Test
	public void searchContact_Advance() throws IOException, InterruptedException
	{	
		
		
		ExcelLibrary excelLibrary = new ExcelLibrary();
		String searchcontactName = excelLibrary.getDataFromExcel("SearchContact_Advance",1, 1);
		System.out.println(driver1.getTitle());
		if(driver1.getTitle().contains("vtiger CRM 5"))
		{
			excelLibrary.setCellvalue("SearchContact_Advance", 5, 8,"login page is displayed");
			excelLibrary.setCellvalue("SearchContact_Advance", 5, 9,"Pass");

		}
		ContactPage contactpage = new ContactPage(driver1);
		SearchPage searchPage=new SearchPage(driver1);
		System.out.println(driver1.getTitle());
		if(driver1.getTitle().contains("Home"))
		{
			excelLibrary.setCellvalue("SearchContact_Advance", 6, 8,"home page is displayed");
			excelLibrary.setCellvalue("SearchContact_Advance", 6, 9,"Pass");
		}
		homepage.HomePageContactLink();
		contactpage.clickAsdvanceSearchLink();
		System.out.println(driver1.getTitle());
		if(driver1.getTitle().contains("Contacts"))
		{
			excelLibrary.setCellvalue("SearchContact_Advance", 7, 8,"advance search page is displayed");
			excelLibrary.setCellvalue("SearchContact_Advance", 7, 9,"Pass");
		}
		searchPage.searchForlastNamedropdown("Last Name");
		searchPage.searchForEqualsdropdown("e");
	    searchPage.searchForcontactName(searchcontactName);
        searchPage.searchNowAction();
		if(driver1.getPageSource().contains("Dani"))
		{
			excelLibrary.setCellvalue("SearchContact_Advance", 8, 8,"advance search page is displayed based on inputs");
			excelLibrary.setCellvalue("SearchContact_Advance", 8, 9,"Passss");
		}
		

		
		
	}

}
