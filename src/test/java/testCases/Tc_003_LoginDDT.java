package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.Dataproviders;

public class TC_003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=Dataproviders.class)
	public void test_loginddt(String email, String password ,String exp)
	{
		logger.info("***TC_003_LoginDDT***");
		Homepage hp=new Homepage(driver);
		
		hp.Clicklogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.enteremail(email);
		lp.enterpassword(password);
		
		lp.clicklogin();
		
		logger.info("clicked on login button");
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.verifylogin();
		
		if(exp.contains("valid"))
		{
			if(targetpage==true)
			{
				macc.Clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail();
			}	
			
		}
		
		if(exp.equals("invalid"))
		{
			if(targetpage==true)
			{
				macc.Clicklogout();
				Assert.fail();
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	
	
	

}
