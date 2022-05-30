package com.vtiger.organizationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.BaseClass;
import com.SDET34l1.genericUtility.ExcelLibrary;
import com.SDET34l1.genericUtility.JavaLibrary;
import com.vtiger.PomRepository.CreateNewOrgInfoPage;
import com.vtiger.PomRepository.CreateNewOrganizationPage;
import com.vtiger.PomRepository.OrganizationInformationValidationOfDropdownPage;
import com.vtiger.PomRepository.OrganizationPage;

public class CreateOrgWithIndustryAndTypeTest extends BaseClass
{
	
	@Test(groups={"sanity","regression"})
	public void org_DropDowntTest() throws IOException, InterruptedException
	{
		ExcelLibrary excelLibrary = new ExcelLibrary();
		String orgname = excelLibrary.getDataFromExcel("Organization", 2, 1)+randomNumber;
		OrganizationPage Orgpage=new OrganizationPage(driver1);
		CreateNewOrganizationPage OrgNewPage=new CreateNewOrganizationPage(driver1);
		CreateNewOrgInfoPage infoPage=new CreateNewOrgInfoPage(driver1);
		OrganizationInformationValidationOfDropdownPage validate=new OrganizationInformationValidationOfDropdownPage(driver1);
		if(driver1.getTitle().contains("Home"))
		{
			excelLibrary.setCellvalue("Organization", 8, 6,"Home page is displayed");
			excelLibrary.setCellvalue("Organization", 8, 7,"Pass");

		}
		homepage.homePageOrganizationAction();
		if(driver1.getTitle().contains("Organizations"))
		{
			excelLibrary.setCellvalue("Organization", 9, 6,"Organization page is displayed");
			excelLibrary.setCellvalue("Organization", 9, 7,"Pass");
		}
		Orgpage.organizationPageAction();
		if(driver1.getTitle().contains("Organizations"))
		{
			excelLibrary.setCellvalue("Organization", 10, 6,"create new Organization page is displayed");
			excelLibrary.setCellvalue("Organization", 10, 7,"Pass");
		}
		OrgNewPage.organizationInformationPageAction(orgname);
	    infoPage.industryNameOfOrg("Education");
		infoPage.accountTypeOfOrg("Press");
		OrgNewPage.organizationInformationPageSaveAction();
		String actualIndustryName = validate.orgDropvalidateIndustry();
		String actualTypeName = validate.orgDropvalidateType();
		JavaLibrary.assertionThroughIfCondition(actualIndustryName, actualTypeName, "education and type");
		excelLibrary.setCellvalue("Organization", 11, 6,"Industry value and type is selected");
		excelLibrary.setCellvalue("Organization", 11, 7,"Pass");
		JavaLibrary.printStatement("Organization created with indusrty and type");
		


	}

}
