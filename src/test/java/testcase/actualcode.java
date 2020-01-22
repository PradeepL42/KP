package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Mobile.KP.android;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Epic;
import pages.Signin;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.model.SeverityLevel;

public class actualcode {
	
	AndroidDriver<AndroidElement> driver;
	Signin login=PageFactory.initElements(driver, Signin.class);
	android and=PageFactory.initElements(driver, android.class);
	
	@Test
	@Description("To Test the home page")
	@Epic("Sprint 1 epic")
	@Stories("Sprint 1 stories")
	@Severity(SeverityLevel.BLOCKER)
	@Features(" user need to login to the app")
	
	public void homepage()
	{
	login.emailfield().sendKeys("tested");
	login.passwordfield().sendKeys("test");
	login.button().click();
	}
			

}
