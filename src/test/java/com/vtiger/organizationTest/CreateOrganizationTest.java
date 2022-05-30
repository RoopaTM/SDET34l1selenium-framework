package com.vtiger.organizationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.ExcelLibrary;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.vtiger.PomRepository.CreateNewOrganizationPage;
import com.vtiger.PomRepository.OrganizationInformationPage;
import com.vtiger.PomRepository.OrganizationPage;



public class CreateOrganizationTest extends BaseClass
{

	@Test(groups={"sanity","regression"})
	public void creatOrganizationTest() throws IOException, InterruptedException
	{
		ExcelLibrary excelLibrary = new ExcelLibrary();
		String orgname = excelLibrary.getDataFromExcel("Organization", 2, 1)+randomNumber;
		OrganizationPage orgPage=new OrganizationPage(driver1);
		CreateNewOrganizationPage orgnewPage=new CreateNewOrganizationPage(driver1);
		OrganizationInformationPage orgInfoPage=new OrganizationInformationPage(driver1);
		homepage.homePageOrganizationAction();
		orgPage.organizationPageAction();
		orgnewPage.organizationInformationPageAction(orgname);
		orgnewPage.organizationInformationPageSaveAction();
		String actualRes = orgInfoPage.organizationInformationPageAction();
		JavaLibrary.assertionThroughIfCondition(actualRes, orgname, "Organization ");
	
	}

}
