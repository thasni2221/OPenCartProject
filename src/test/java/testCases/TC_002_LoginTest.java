package testCases;
import pageObjects.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC_002_LoginTest  extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void test_login()
	{
		logger.info("***Tc_002_LoginTest***");
		Homepage hp=new Homepage(driver);
		
		hp.Clicklogin();
		logger.info("clicked on login link and page is visible");
		
		Loginpage lp=new Loginpage(driver);
		lp.enteremail(rb.getString("email"));
		lp.enterpassword(rb.getString("password"));
		
		lp.clicklogin();
		
		logger.info("clicked on login button");
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.verifylogin();
		
		Assert.assertEquals(targetpage,true);
		
	}
	

}
