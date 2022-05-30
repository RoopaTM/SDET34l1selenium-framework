package com.vtiger.product;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.ExcelLibrary;
import com.vtiger.PomRepository.CreatingNewProductPage;
import com.vtiger.PomRepository.ProductPage;

public class CreateProductTest extends BaseClass 
{
	String productName;
	@Test
	public void creatCampaignTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		ExcelLibrary excelLibrary = new ExcelLibrary();
		productName=excelLibrary.getDataFromExcel("Product", 1, 1)+randomNumber;
		ProductPage productPage=new ProductPage(driver1);
		CreatingNewProductPage newProductPage=new CreatingNewProductPage(driver1);
		homepage.homePageProductLink();
		productPage.productPageAction();
		newProductPage.productInformationPageSendName(productName);
		newProductPage.productInformationPageClickOnsave();

	}

}
