package com.yzc.mysystem.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void loginTest() throws Exception {
	//设置火狐浏览器的路径
	  System.setProperty("webdriver.firefox.bin", 
			  "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	  //创建一个驱动（用来控制浏览器的）
	  WebDriver driver = new FirefoxDriver();
	  //设置等待的最长时间（超过15秒，就中断测试方法）
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  //浏览器窗口最大化
	  driver.manage().window().maximize();
	  //打开员工管理系统的网站
	  driver.get("http://192.168.0.153:8080/hris");
	  //找到账号的输入框
	  WebElement accountBox = driver.findElement(By.className("inputgri"));
	  //输入账号
	  accountBox.sendKeys("admin");
	  //找到密码的输入框
	  WebElement passwdBox = driver.findElement(By.xpath("//form/table/tbody/tr[2]/td[2]/input"));
	  //输入密码
	  passwdBox.sendKeys("123456");
	  //找到登录按钮
	  
	  //点击登录按钮
	  
	  //验证结果
	  
	  Thread.sleep(3000);
	  driver.quit();
  }
}
