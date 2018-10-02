package app.test;


import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppTest {
	
	private AppiumDriver driver;
	
	@Test
	public void testAdd() throws Exception{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");//指定测试平台
		capabilities.setCapability("deviceName", "127.0.0.1:26944"); //指定测试机的ID,通过adb命令[adb devices]获取
		capabilities.setCapability("platformVersion", "4.2.2"); 
		//根据上面获取到的包名和Activity名进行设置
		capabilities.setCapability("appPackage", "com.ibox.calculators");
		capabilities.setCapability("appActivity", "com.ibox.calculators.CalculatorActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@text='1']").click();
		//Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.Button[@text='+']").click();
		//Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.Button[@text='2']").click();
		//Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.Button[@text='=']").click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void end(){
		driver.quit();
	}
}	