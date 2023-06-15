package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {
	
	public Homepage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement lnkLogin;
	
	@FindBy(linkText="Register")
	WebElement lnkRegister;
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement lnkLogin1;
	
	public void clicklogin()
	{
		lnkLogin.click();
	}
	
	public void clickregister()
	{
		lnkRegister.click();
	}
	
	public void Clicklogin()
	{
		lnkLogin1.click();
		
	}

}
