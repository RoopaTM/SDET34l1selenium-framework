package com.vtiger.contactsTestAssignment;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.ExcelLibrary;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.vtiger.PomRepository.ContactInformationPage;
import com.vtiger.PomRepository.ContactPage;
import com.vtiger.PomRepository.CreateNewContactInformationPage;
import com.vtiger.PomRepository.EventInformationPage;
import com.vtiger.PomRepository.QuickCreatePage;

public class CreateAnEventTest extends BaseClass
{
	@Test
	public void createAnEventTest() throws IOException, InterruptedException
	{
		ExcelLibrary excelLibrary = new ExcelLibrary();
		String expectedcontactfristName = excelLibrary.getDataFromExcel("Createanevent",0, 2);
		String expectedcontactlastName = excelLibrary.getDataFromExcel("Createanevent",1, 2);
		String eventName = excelLibrary.getDataFromExcel("Createanevent",3, 2);
		System.out.println(driver1.getTitle());
		if(driver1.getTitle().contains("vtiger CRM 5"))
		{
			excelLibrary.setCellvalue("Createanevent", 6, 7,"login page is displayed");
			excelLibrary.setCellvalue("Createanevent", 6, 8,"Pass");

		}
		
		ContactPage contactpage = new ContactPage(driver1);
		ContactInformationPage contactinfopage=new ContactInformationPage(driver1);
		QuickCreatePage quickNewPage=new QuickCreatePage(driver1);
		CreateNewContactInformationPage newcontactpage = new CreateNewContactInformationPage(driver1);
		EventInformationPage eventinfoPage=new EventInformationPage(driver1);
		if(driver1.getTitle().contains("Home"))
		{
			excelLibrary.setCellvalue("Createanevent", 7, 7,"Home page is displayed");
			excelLibrary.setCellvalue("Createanevent", 7, 8,"Pass");

		}

		homepage.HomePageContactLink();
		System.out.println(driver1.getTitle());
		if(driver1.getTitle().contains("Home"))
		{
			excelLibrary.setCellvalue("Createanevent", 8, 7,"contact page is displayed");
			excelLibrary.setCellvalue("Createanevent", 8, 8,"Pass");

		}
		contactpage.contactPageAction();
		newcontactpage.contactInformationPageSendFristName(expectedcontactfristName);
		newcontactpage.contactInformationPageSendLastName(expectedcontactlastName);
		newcontactpage.contactInformationPageSaveLastName();
		String actualFristName = contactinfopage.ContactInformationPageAction();
		String actualLastName = contactinfopage.ContactfristNameValidate();
		JavaLibrary.assertionThroughIfCondition(actualLastName, actualFristName, "Quickevent");
		excelLibrary.setCellvalue("Createanevent", 9, 7,"contact informaionis displayed");
		excelLibrary.setCellvalue("Createanevent", 9, 8,"Pass");
		JavaLibrary.printStatement("contact has been created sucessfully");
		homepage.clickQuickEventdropdown("New Event");
		quickNewPage.quickEventSendEventName(eventName);
		quickNewPage.quickeventsavePage();
		String validaeventName = eventinfoPage.validateEventName();
		JavaLibrary.assertionThroughIfCondition(validaeventName, eventName, "eventName");
		excelLibrary.setCellvalue("Createanevent", 10, 7,"new event in calender is displayed");
		excelLibrary.setCellvalue("Createanevent", 10, 8,"Pass");

		
	
		

	}

}
