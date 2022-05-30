package com.vtiger.compainTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.WebDriverLibrary;
import com.vtiger.PomRepository.CampanionNewWindowPage;
import com.vtiger.PomRepository.CompanionPage;
import com.vtiger.PomRepository.CreateNewCampanionPage;
import com.vtiger.PomRepository.CreatingNewProductPage;
import com.vtiger.PomRepository.ProductPage;

public class CreateProduct_CompanionTest extends BaseClass

{
	String productName;
	String campaignName;
	@Test(groups={"sanity","regression"})
	public void createProduct_CompanionTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		
		//ExcelLibrary excelLibrary = new ExcelLibrary();
		productName=excelLibrary.getDataFromExcel("Product", 1, 1)+randomNumber;
		campaignName=excelLibrary.getDataFromExcel("Companion", 2, 1)+randomNumber;
		ProductPage productPage=new ProductPage(driver1);
		CreatingNewProductPage newProductPage=new CreatingNewProductPage(driver1);
		CompanionPage campanionPage=new CompanionPage(driver1);
		CreateNewCampanionPage newCampanionPage=new CreateNewCampanionPage(driver1);
		CampanionNewWindowPage newWindowPage=new CampanionNewWindowPage(driver1);
		homepage.homePageProductLink();
		productPage.productPageAction();
		newProductPage.productInformationPageSendName(productName);
		newProductPage.productInformationPageClickOnsave();
		homepage.clickCampaign(driver1);
		campanionPage.campanionPageAction();
		newCampanionPage.campaniontInformationPageSendName(campaignName);
		newCampanionPage.campaniontInformationPageClickSelect();
		WebDriverLibrary.switchToWindow(driver1, "Products");
		newWindowPage.organizationnextWindowActions(productName, driver1);
		WebDriverLibrary.switchToWindow(driver1, "Campaigns");
		newCampanionPage.campaniontInformationPageClickOnSave();


	}

}
