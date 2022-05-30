package com.vtiger.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.SDET34l1.genericUtility.RetryAnalyzer;

public class Class 
{
	@Test(retryAnalyzer = com.SDET34l1.genericUtility.ListnerImplementation.class)
	public void testcase1()
	{
		Reporter.log("testcase 1");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testcase2()
	{
		Reporter.log("testcase 2");
		Assert.assertTrue(true);
	}
	

}
