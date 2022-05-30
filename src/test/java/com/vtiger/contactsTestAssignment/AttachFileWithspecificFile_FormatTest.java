package com.vtiger.contactsTestAssignment;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.ExcelLibrary;
import com.vtiger.PomRepository.ContactPage;
import com.vtiger.PomRepository.CreateNewContactInformationPage;

public class AttachFileWithspecificFile_FormatTest extends BaseClass
{
	@Test
	public void attachFileWithSpecificFormat() throws IOException, InterruptedException
	{

		ExcelLibrary excelLibrary = new ExcelLibrary();
		String expectedcontactName = excelLibrary.getDataFromExcel("Searchcontact_with_onefield",1, 1);
		ContactPage contactpage = new ContactPage(driver1);
		CreateNewContactInformationPage newcontactpage = new CreateNewContactInformationPage(driver1);
		CreateNewContactInformationPage page = new CreateNewContactInformationPage(driver1);
		System.out.println(driver1.getTitle());
		if(driver1.getTitle().contains("vtiger CRM 5"))
		{
			excelLibrary.setCellvalue("Searchcontact_with_onefield", 7, 7,"login page is displayed");
			excelLibrary.setCellvalue("Searchcontact_with_onefield", 7, 8,"Pass");

		}
		homepage.HomePageContactLink();
		contactpage.contactPageAction();
		newcontactpage.contactInformationPageSendLastName(expectedcontactName);
		page.contactInformationPageFileUpload("C:\\Users\\Roopa\\Desktop\\image.jpg\\");
		page.contactInformationPageSaveLastName();


	}

}
