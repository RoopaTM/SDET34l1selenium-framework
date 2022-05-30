package com.vtiger.practice;

import java.io.IOException;

import com.SDET34l1.genericUtility.FileLibrary;
import com.SDET34l1.genericUtility.Iconstantpath;
import com.SDET34l1.genericUtility.JavaLibrary;

public class Property1 {

	public static void main(String[] args) throws IOException 
	{
		FileLibrary.openPropertyFile(Iconstantpath.PROPERTYFILE_PATH);

		String url = FileLibrary.getDataFromPropertyFile("url");
		String un = FileLibrary.getDataFromPropertyFile("un");
		String pwd = FileLibrary.getDataFromPropertyFile("pwd");
		String timeout = FileLibrary.getDataFromPropertyFile("timeout");
		String browsername = FileLibrary.getDataFromPropertyFile("browsername");

			JavaLibrary.printStatement(url);
			JavaLibrary.printStatement(un);
			JavaLibrary.printStatement(pwd);
			JavaLibrary.printStatement(timeout);
			JavaLibrary.printStatement(browsername);
		

	}

}
