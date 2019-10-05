package com.TestNG;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class DataProviderExample1 {
	@Test(dataProvider="login")
	public void login(String userName,String password)
	{
		
		System.out.println(userName);
		System.out.println(password);
	}

	@DataProvider(name="login")
	public String[][] senddata() throws BiffException, IOException
	{
		return ReadDataFromExelGeneric.getexel();
	}
}
