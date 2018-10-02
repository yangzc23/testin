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
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchTest {
	
	private AppiumDriver driver;
	
	@Test
	public void testSearch() throws Exception{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");//指定测试平台
		capabilities.setCapability("deviceName", "127.0.0.1:26944"); //指定测试机的ID,通过adb命令[adb devices]获取
		capabilities.setCapability("platformVersion", "4.2.2"); 
		//根据上面获取到的包名和Activity名进行设置
		capabilities.setCapability("appPackage", "com.browser2345");
		capabilities.setCapability("appActivity", "com.browser2345.BrowserActivity");
		
		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyboard", true);

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000);
		MobileElement element = (MobileElement)driver.findElementByXPath("//android.widget.TextView[@text='上滑更多精彩']");
		element.click();
		//driver.findElementByXPath("//android.widget.TextView[@text='上滑更多精彩']").click();
		//
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@text='以后再说']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='百度一下']").click();
		Thread.sleep(3000);		
		driver.findElementByXPath("//android.widget.EditText[@text='输入关键字']").sendKeys("zhaowei");
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@text=' 搜索 ']").click();	
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void end(){
		driver.quit();
	}
}