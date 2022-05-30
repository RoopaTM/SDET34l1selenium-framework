package com.SDET34l1.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{

	int count=0;
	int maxCount=2;
	
	@Override
	public boolean retry(ITestResult result)
	{
	if(count<maxCount)
	{
		count++;
		return true;
	}
		return false;
	}
   
}
