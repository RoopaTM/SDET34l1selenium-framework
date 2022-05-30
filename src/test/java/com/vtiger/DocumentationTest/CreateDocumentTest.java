package com.vtiger.DocumentationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.ExcelLibrary;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.SDET34l1.genericUtility.WebDriverLibrary;
import com.vtiger.PomRepository.CreateNewDocumentPage;
import com.vtiger.PomRepository.DocumentPage;

public class CreateDocumentTest extends BaseClass
{
	@Test
	public void createDocumentTest() throws IOException, InterruptedException
	{
		ExcelLibrary excelLibrary = new ExcelLibrary();
		String doctitle = excelLibrary.getDataFromExcel("Document", 2, 1)+randomNumber;
		String textarea= excelLibrary.getDataFromExcel("Document", 3, 1)+randomNumber;
		DocumentPage docPage=new DocumentPage(driver1);
		CreateNewDocumentPage newDocPage=new CreateNewDocumentPage(driver1);
		homepage.homePageDocumentLink();
		docPage.documentPageAction();
		newDocPage.documentPageSendTitle(doctitle);
		WebDriverLibrary.switchToFrame(driver1, 0);
		newDocPage.documentPageSendTextAndCopyAll(textarea);
		WebDriverLibrary.switchBackToHomePage(driver1);
		newDocPage.documentPageBoldAndItalicText();
		newDocPage.documentPageFileUpload("C:\\Users\\Roopa\\Desktop\\image.jpg");	
		

	}

}
