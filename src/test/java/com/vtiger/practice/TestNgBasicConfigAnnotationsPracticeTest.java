package com.vtiger.practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasicConfigAnnotationsPracticeTest 
{
	public class PracticeTest 
	{
	 @Test
	 public void teststep1Test()
	 {
		 Reporter.log("test case1",true);
	 }
	 
	 
	 @Test
	 public void teststep2Test()
	 {
		 Reporter.log("test case2",true);
	 }
	 
	 
	 @BeforeSuite
	 public void beforeSuitTest()
	 {
		 Reporter.log("beforeSuitTest",true);
	 }
	 
	 @AfterSuite
	 public void afterSuiteTest()
	 {
		 Reporter.log("afterSuiteTest",true);
	 }
	 
	 @BeforeClass
	 public void beforeClassTest()
	 {
		 Reporter.log("beforeClassTest",true);
	 }
	 
	 @AfterClass
	 public void afterClassTest()
	 {
		 Reporter.log("afterClassTest",true);
	 }
	 
	 @BeforeTest
	 public void beforeTestTest()
	 {
		 Reporter.log("beforeTestTest",true);
	 }
	 
	 @AfterTest
	 public void aterTestTest()
	 {
		 Reporter.log("aterTestTest",true);
	 }
	 
	 @BeforeMethod
	 public void beforeMethodTest()
	 {
		 Reporter.log("beforeMethodTest",true);
	 }
	 
	 @AfterMethod
	 public void afterMethodTest()
	 {
		 Reporter.log("afterMethodTest",true);
	 }
	} 
}
