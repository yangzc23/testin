package  com.yzc.mysystem.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MySearchTest {
  @Test
  public void searchTest() throws Exception {
	  //设置火狐浏览器的路径
	  System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	  //创建一个驱动（用来控制浏览器的）
	  WebDriver driver = new FirefoxDriver();
	  //设置等待的最长时间（超过15秒，就中断测试方法）
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  //浏览器窗口最大化
	  driver.manage().window().maximize();
	  //打开必应搜索网站
	  driver.get("http://www.bing.com");
	  //获取关键字的输入框
	  WebElement inputBox = driver.findElement(By.id("sb_form_q"));
	  //输入搜索关键字
	  inputBox.sendKeys("赵薇");
	  //获取搜索的按钮
	  WebElement searchButton = driver.findElement(By.id("sb_form_go"));
	  //点击搜索
	  searchButton.click();
	  //
	  Thread.sleep(3000);
	  //获取服务器返回的搜索结果页面的html源码
	  String html = driver.getPageSource();
	  //验证结果
	  assertEquals(html.contains("万家文化（现为祥源文化）收购案的失败"),true);
	  assertEquals(html.contains("黄有龙"),true);	  
	  //等待3秒钟
	  Thread.sleep(3000);
	  //关闭火狐浏览器
	  driver.quit();
  }
}
