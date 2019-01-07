package com.qa.testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Method1 {
	
	@Test(priority=1)
	public void addM()
	{
		Reporter.log("Addition", true); 
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test(priority=0)
	public void subM()
	{
		Reporter.log("Subtration", true);
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}   
	@Test(priority=-2)
	public void mulM()
	{
		Reporter.log("Multiplication", true);
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
	}
	@Test(priority=-3)
	public void divM()
	{
		Reporter.log("Division", true);
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
	}

}
