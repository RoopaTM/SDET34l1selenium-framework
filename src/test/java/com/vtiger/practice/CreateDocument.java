package com.vtiger.practice;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import com.SDET34l1.genericUtility.ExcelLibrary;
import com.SDET34l1.genericUtility.FileLibrary;
import com.SDET34l1.genericUtility.Iconstantpath;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.SDET34l1.genericUtility.WebDriverLibrary;
import com.vtiger.PomRepository.CreateNewDocumentPage;
import com.vtiger.PomRepository.DocumentPage;
import com.vtiger.PomRepository.Homepage;
import com.vtiger.PomRepository.LoginPage;

public class CreateDocument 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException, AWTException 
	{
		JavaLibrary jutil = new JavaLibrary();
		FileLibrary.openPropertyFile(Iconstantpath.PROPERTYFILE_PATH);
		String url = FileLibrary.getDataFromPropertyFile("url");
		String un = FileLibrary.getDataFromPropertyFile("un");
		String pwd = FileLibrary.getDataFromPropertyFile("pwd");
		String timeout = FileLibrary.getDataFromPropertyFile("timeout");
		String browsername = FileLibrary.getDataFromPropertyFile("browsername");
		long longtimeout=jutil.stringToLong(timeout);
		int random=jutil.getRandomNumber(1000);
		//ExcelLibrary.openExcel(Iconstantpath.EXCELFILE_PATH);
		//String doctitle = ExcelLibrary.getDataFromExcel("Document", 2, 1)+random;
		//String textarea= ExcelLibrary.getDataFromExcel("Document", 3, 1)+random;
		WebDriverLibrary.intailizeBrowser(browsername);
		WebDriver driver1 = WebDriverLibrary.getDriver();
		WebDriverLibrary.navigateApp(url, driver1);
		WebDriverLibrary.browserSetting(longtimeout, driver1);
		WebDriverLibrary.explicitlyWait(longtimeout, driver1);
		LoginPage loginpage = new LoginPage(driver1);
		Homepage homepage = new Homepage(driver1);
		DocumentPage docPage=new DocumentPage(driver1);
		CreateNewDocumentPage newDocPage=new CreateNewDocumentPage(driver1);
		loginpage.loginAction(un, pwd);
		homepage.homePageDocumentLink();
		docPage.documentPageAction();
		//newDocPage.documentPageSendTitle(doctitle);
		driver1.switchTo().frame(0);
		//newDocPage.documentPageSendTextAndCopyAll(textarea);
		driver1.switchTo().defaultContent();
		newDocPage.documentPageBoldAndItalicText();
		newDocPage.documentPageFileUpload("C:\\Users\\Roopa\\Desktop\\image.jpg");
		WebDriverLibrary.switchBackToHomePage(driver1);
		homepage.signOutIconMouseHoverAction(driver1);
		WebDriverLibrary.quitbrowser(driver1);
}
}