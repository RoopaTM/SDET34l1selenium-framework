package com.vtiger.practice;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.SDET34l1.genericUtility.ExcelLibrary;
import com.SDET34l1.genericUtility.FileLibrary;
import com.SDET34l1.genericUtility.Iconstantpath;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.SDET34l1.genericUtility.WebDriverLibrary;
import com.vtiger.PomRepository.ContactPage;
import com.vtiger.PomRepository.CreateNewOrganizationPage;
import com.vtiger.PomRepository.Homepage;
import com.vtiger.PomRepository.LoginPage;
import com.vtiger.PomRepository.OrganizationPage;
import com.vtiger.PomRepository.OrganizationsPage;

public class CreateOrgWithContact 
{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		JavaLibrary jutil = new JavaLibrary();
		FileLibrary.openPropertyFile(Iconstantpath.PROPERTYFILE_PATH);
		String url = FileLibrary.getDataFromPropertyFile("url");
		String un = FileLibrary.getDataFromPropertyFile("un");
		String pwd = FileLibrary.getDataFromPropertyFile("pwd");
		String timeout = FileLibrary.getDataFromPropertyFile("timeout");
		String browsername = FileLibrary.getDataFromPropertyFile("browsername");
		long longtimeout=jutil.stringToLong(timeout);
		int random1=jutil.getRandomNumber(1000);
//		ExcelLibrary.openExcel(Iconstantpath.EXCELFILE_PATH);
//		String excpectedContactName = ExcelLibrary.getDataFromExcel("Contact", 2, 1)+random1;
//		String orgname = ExcelLibrary.getDataFromExcel("Contact", 3, 1)+random1;
//		WebDriverLibrary.intailizeBrowser(browsername);
//		WebDriver driver1 = WebDriverLibrary.getDriver();
//		WebDriverLibrary.navigateApp(url, driver1);
//		WebDriverLibrary.browserSetting(longtimeout, driver1);
//		WebDriverLibrary.explicitlyWait(longtimeout, driver1);
//		LoginPage loginpage = new LoginPage(driver1);
//		Homepage homepage = new Homepage(driver1);
//		OrganizationPage orgPage=new OrganizationPage(driver1);
//		CreateNewOrganizationPage orgnewPage=new CreateNewOrganizationPage(driver1);
//		ContactPage contactpage = new ContactPage(driver1);
//		OrganizationsPage orgnewWindowpage=new OrganizationsPage(driver1);
//		loginpage.loginAction(un, pwd);
//		homepage.homePageOrganizationAction();
//		orgPage.organizationPageAction();
//		orgnewPage.organizationInformationPageAction(orgname);
//		orgnewPage.organizationInformationPageSaveAction();
//		homepage.HomePageContactLink();
//		contactpage.contactPageAction();
//		contactpage.contactLastNameAction(excpectedContactName);
//        contactpage.contactSelectClickAction();
//        WebDriverLibrary.switchToWindow(driver1, "Organizations");
//        orgnewWindowpage.organizationnextWindowActions(orgname, driver1, orgname);;
//        WebDriverLibrary.switchToWindow(driver1, "Contacts");
//        contactpage.contactSaveAction();
//        homepage.signOutIconMouseHoverAction(driver1);
	}
}
