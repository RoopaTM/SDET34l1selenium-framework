package com.vtiger.contactsTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.vtiger.PomRepository.ContactInformationPage;
import com.vtiger.PomRepository.ContactPage;
import com.vtiger.PomRepository.CreateNewContactInformationPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class CreateContactsTest extends BaseClass
{
	@Test(groups="sanity",description="testng:- CreateContactTest")
	@Description("Description:- Create the Contact")
	@Epic("Epic:- EP001")
	@Story("Strory:- CreateContact")
	@Step("Step:- CreateContactTest")
	@Severity(SeverityLevel.MINOR)
	
	public void creatContactTest() throws IOException, InterruptedException
	{
	    
		
		//ExcelLibrary excelLibrary = new ExcelLibrary();
		String excpectedContactName = excelLibrary.getDataFromExcel("Contact", 2, 1)+randomNumber;
		ContactPage contactpage = new ContactPage(driver1);
		ContactInformationPage contactinfopage=new ContactInformationPage(driver1);
		CreateNewContactInformationPage newcontactpage = new CreateNewContactInformationPage(driver1);
		homepage.HomePageContactLink();
		contactpage.contactPageAction();
		newcontactpage.contactInformationPageSendLastName(excpectedContactName);
		newcontactpage.contactInformationPageSaveLastName();
		String actaulResult = contactinfopage.ContactInformationPageAction();
		JavaLibrary.assertionThroughIfCondition(actaulResult, excpectedContactName, "Contact ");
	}}




		
