package com.vtiger.contactsTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.WebDriverLibrary;
import com.vtiger.PomRepository.ContactPage;
import com.vtiger.PomRepository.CreateNewOrganizationPage;
import com.vtiger.PomRepository.OrganizationPage;
import com.vtiger.PomRepository.OrganizationsPage;

public class CreatContactWith_OrganizationTest extends BaseClass
{

	@Test(groups={"regression","sanity"})
	public void creatContactTest() throws IOException, InterruptedException
	{
		
		
		//ExcelLibrary excelLibrary = new ExcelLibrary();
		String excpectedContactName = excelLibrary.getDataFromExcel("Contact", 2, 1)+randomNumber;
		String organiazationname = excelLibrary.getDataFromExcel("Contact", 3, 1)+randomNumber;
		OrganizationPage orgPage=new OrganizationPage(driver1);
		CreateNewOrganizationPage orgnewPage=new CreateNewOrganizationPage(driver1);
		ContactPage contactpage = new ContactPage(driver1);
		OrganizationsPage orgnewWindowpage=new OrganizationsPage(driver1);
		homepage.homePageOrganizationAction();
		orgPage.organizationPageAction();
		orgnewPage.organizationInformationPageAction(organiazationname);
		orgnewPage.organizationInformationPageSaveAction();
		homepage.HomePageContactLink();
		contactpage.contactPageAction();
		contactpage.contactLastNameAction(excpectedContactName);
        contactpage.contactSelectClickAction();
        WebDriverLibrary.switchToWindow(driver1, "Organizations");
        orgnewWindowpage.organizationnextWindowActions(organiazationname, driver1, organiazationname);;
        WebDriverLibrary.switchToWindow(driver1, "Contacts");
        contactpage.contactSaveAction();
       
	}

}



