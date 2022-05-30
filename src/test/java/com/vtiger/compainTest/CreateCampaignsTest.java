package com.vtiger.compainTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.vtiger.PomRepository.CompanionPage;
import com.vtiger.PomRepository.CreateNewCampanionPage;

public class CreateCampaignsTest extends BaseClass
{
String campaignName;
@Test(groups={"sanity","regression"})
public void creatCampaignTest() throws EncryptedDocumentException, IOException, InterruptedException
{

	//ExcelLibrary excelLibrary = new ExcelLibrary();
	campaignName=excelLibrary.getDataFromExcel("Companion", 2, 1)+randomNumber;
	CompanionPage campanionPage=new CompanionPage(driver1);
	CreateNewCampanionPage creatnewCampanionPage=new CreateNewCampanionPage(driver1);
	homepage.clickCampaign(driver1);
	campanionPage.campanionPageAction();
	creatnewCampanionPage.campaniontInformationPageSendName(campaignName);
	creatnewCampanionPage.campaniontInformationPageClickOnSave();
	JavaLibrary.printStatement("campaign name has been created");
    Reporter.log("campaign name has been created");

	}

}
