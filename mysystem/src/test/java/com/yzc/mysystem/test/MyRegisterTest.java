package com.yzc.mysystem.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyRegisterTest {

@Test(dataProvider="data")
public void registerTest (String user,String passwd,String passwd2,String email,String path,String expected) throws InterruptedException {
	  System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");	
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://192.168.1.6:8090/phpwind");
	  WebElement registerButton = driver.findElement(By.cssSelector("a.btn"));
	  registerButton.click();
	  WebElement accountBox = driver.findElement(By.cssSelector("#J_reg_username"));
	  accountBox.sendKeys(user);
	  WebElement passwdBox = driver.findElement(By.cssSelector("#J_reg_password"));
	  passwdBox.sendKeys(passwd);
	  WebElement checkpasswdBox = driver.findElement(By.cssSelector("#J_reg_repassword"));
	  checkpasswdBox.sendKeys(passwd2);
	  WebElement emailBox = driver.findElement(By.cssSelector("#J_reg_email"));
	  emailBox.sendKeys(email);
	  WebElement agreebutton = driver.findElement(By.cssSelector("button.btn"));
	  agreebutton.sendKeys(Keys.ENTER);
	  Thread.sleep(3000);	  
	  String result = driver.findElement(By.xpath(path)).getText();
	  assertEquals(result.contains(expected),true);
	  Thread.sleep(3000);
	  driver.quit();
}
@DataProvider(name="data")
public Object[][] provideData(){
	  Object[][] arr = {
			  			{"jojo","123456","123456","1319945286@qq.com","//*[@id='J_reg_tip_username']/span","用户名已经存在"},
			  			{"jojo2","12345","12345","1319945287@qq.com","//*[@id=\"J_reg_tip_password\"]/span","密码长度错误"},
			  			{"jojo3","123456","123457","1319945288@qq.com","//*[@id=\"J_reg_tip_repassword\"]/span","密码不一致"},
			  			{"jojo4","123456","123456","131@qq.com","//*[@id=\"J_reg_tip_email\"]/span","邮箱地址已经被注册"},
			  			{"jojo5","123456","123456","131999","//*[@id=\"J_reg_tip_email\"]/span","请输入正确的电子邮箱地址"},
			  			{"jojo6","123456","123456","","//*[@id=\"J_reg_tip_email\"]/span","邮箱不能为空"},
			  			{"jojo456","123456","123456","jojo456@qq.com","/html/body/div/div[2]/div/div/h1","恭喜"}
			  	
	  					};
	  return arr;
}
}