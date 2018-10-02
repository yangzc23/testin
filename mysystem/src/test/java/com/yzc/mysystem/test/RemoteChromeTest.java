package com.yzc.mysystem.test;

import static org.testng.Assert.assertEquals;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteChromeTest {
  @Test
  public void f() throws Exception {
	  DesiredCapabilities capability = DesiredCapabilities.chrome();
      capability.setBrowserName("chrome");
      capability.setPlatform(Platform.WINDOWS);
      //capability.setVersion("61");
      //System.setProperty("webdriver.gecko.driver","D:\\Python27\\geckodriver.exe");
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.6:5555/wd/hub"), capability);
	  //打开必应搜索网站
	  driver.get("http://www.bing.com");
	  //获取关键字的输入框
	  WebElement inputBox = driver.findElement(By.id("sb_form_q"));
	  //输入搜索关键字
	  inputBox.sendKeys("赵薇");
	  //获取搜索的按钮
	  WebElement searchButton = driver.findElement(By.id("sb_form_go"));
	  //点击搜索
	  //searchButton.click();
	  searchButton.sendKeys(Keys.ENTER);
	  //
	  Thread.sleep(3000);
	  //获取服务器返回的搜索结果页面的html源码
	  String html = driver.getPageSource();
	  //验证结果
	  //assertEquals(html.contains("万家文化（现为祥源文化）收购案的失败"),true);
	  assertEquals(html.contains("黄有龙"),true);	  
	  //等待3秒钟
	  Thread.sleep(3000);
	  //关闭浏览器
	  driver.quit();
  }
}
