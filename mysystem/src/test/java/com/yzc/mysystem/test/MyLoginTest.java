package com.yzc.mysystem.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyLoginTest {
  @Test(dataProvider="data")
  public void loginTest (String user,String passwd,String expected) throws Exception {
	  System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");	
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://192.168.0.153:8080/hris");
	  WebElement accountBox = driver.findElement(By.className("inputgri"));
	  accountBox.sendKeys(user);
	  WebElement passwdBox = driver.findElement(By.xpath("//*[@id=\"content\"]/form/table/tbody/tr[2]/td[2]/input"));
	  passwdBox.sendKeys(passwd);
	  WebElement submitbutton = driver.findElement(By.xpath("//*[@id=\"content\"]/form/p/input"));
	  submitbutton.click();
	  Thread.sleep(3000);	  
	  String html = driver.getPageSource();
	  assertEquals(html.contains(expected),true);
	  Thread.sleep(3000);
	  driver.quit();
  }
  
  @DataProvider(name="data")
  public Object[][] provideData(){
	  Object[][] arr = {
			  			{"123456","123456","用户名或密码不正确"},
			  			{"admin","123456","您好"},
			  			{"admin","12345","用户名或密码不正确"},
			  			{"","123456","用户名或密码不正确"},
			  			{"admin","","用户名或密码不正确"}
	  					};
	  return arr;
  }
 
}