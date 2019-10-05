package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExampl2 
{
	@Test
	public void t1()
	{
		String Ex = "SSP";
		String Act = "SSP123";
		//Assert.assertEquals("SSP123", "SSP");//or Assert.assertEquals(Act,Ex);
		//Assert.assertEquals(Act,Ex);
		 Assert.assertEquals(Act, Ex, "Hi");
	}

}
