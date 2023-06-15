package testCases;
import pageObjects.*;
import org.testng.*;
import org.testng.annotations.*;

import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	
	
	@Test(groups= {"Regression","Master"})
	void test_registrationaccount() throws InterruptedException
	{
		
		Homepage hp=new Homepage(driver);
		hp.clicklogin();
		hp.clickregister();
		
AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setfirstname("sree");
		
		 regpage.setlastname("lakshmi");
		 
		 regpage.setemail(rb.getString("email"));
		 
		 regpage.setpassword(rb.getString("password"));
		 
		 regpage.confirmpassword(rb.getString("password"));
		 
		 regpage.clickRegister();
		 
		 String message=regpage.Getconfirmationmsg();
		 
		 Assert.assertEquals(message,"Your registration completed");
		 Thread.sleep(3000);		
		
	}

}
