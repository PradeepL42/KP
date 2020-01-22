package Mobile.KP;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.AssertJUnit;


public class android
{
    
    public String android( ) throws MalformedURLException
    
    {
    	AndroidDriver<AndroidElement> driver;
    	 File f = new File("");
    	DesiredCapabilities cap =new DesiredCapabilities();
    	cap.setCapability("deviceName", "motog4");
    	cap.setCapability("app", f.getAbsolutePath());
    	cap.setCapability("automationName", "appium");
    	cap.setCapability("appPackage", "");
    	cap.setCapability("appActivity", "");
    	cap.setCapability("appVersion", "7.1");
    
    	driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    	
    	 return "driver";
    }

    public AndroidDriver<AndroidElement> getDriver()
    {
		return getDriver();
	}
    
}
