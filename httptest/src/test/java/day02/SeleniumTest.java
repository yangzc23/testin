package day02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
  @Test
  public void f() throws Exception {
	  //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");//设置chrome浏览器驱动的路径
	  //WebDriver driver = new ChromeDriver();//创建一个驱动（用来驱动chrome浏览器）
	  //System.setProperty("webdriver.ie.driver", "D:\\MicrosoftWebDriver.exe");//设置ie浏览器驱动的路径	  
	  //WebDriver driver = new InternetExplorerDriver();//创建一个驱动（用来驱动ie浏览器）
	  System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");//设置火狐浏览器执行文件的路径  	  
	  WebDriver driver = new FirefoxDriver();//创建一个驱动（用来驱动firefox浏览器）	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//设置超时（等待时间不能超过15s）
	  driver.manage().window().maximize();//浏览器窗口最大化
	  driver.get("http://www.bing.com");//根据url地址打开网页
	  Thread.sleep(3000);//延迟3秒（线程阻塞3秒）
	  driver.quit();//关闭浏览器
  }
}


