package com.yzc.mysystem.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyLoginFailTest {
  @Test
  @Parameters({"user","passwd","expected"})
  public void loginTest (String user,String passwd,String expected) throws InterruptedException {
	  System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");	
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://192.168.1.6:8080/myweb");
	  WebElement accountBox = driver.findElement(By.className("inputgri"));
	  accountBox.sendKeys(user);
	  WebElement passwdBox = driver.findElement(By.xpath("//*[@id=\"content\"]/form/table/tbody/tr[2]/td[2]/input"));
	  passwdBox.sendKeys(passwd);
	  WebElement submitbutton = driver.findElement(By.xpath("//*[@id=\"content\"]/form/p/input"));
	  submitbutton.click();
	  String message = driver.findElement(By.xpath("//*[@id='content']/form/table/tbody/tr[1]/td[2]")).getText();  
	  assertEquals(message.contains(expected),true);
	  Thread.sleep(3000);
	  driver.quit();
  }
}