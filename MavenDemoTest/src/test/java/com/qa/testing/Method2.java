package com.qa.testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method2 {
	
	@Test
	public void firstM()
	{
		Reporter.log("Welcome", true);
	}
	
	@Test
	public void secondM()
	{
		Reporter.log("Hi", true);
	}
	
	@Test
	public void thirdM()
	{
		Reporter.log("Bye", true);
	}

}
 