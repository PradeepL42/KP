package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Signin {
	AndroidDriver<AndroidElement> driver;
	
	public Signin(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}

	@FindBy(xpath="")
	WebElement email;
	
	@FindBy(how=How.ID,using="")
	WebElement password;
	
	@FindBy(id="")
	WebElement submit;
	
	public WebElement emailfield()
	{
		return email;
	}
	
	public WebElement passwordfield()
	{
		return password;
	}
	
	public WebElement button()
	{
		return submit;
	}
}
