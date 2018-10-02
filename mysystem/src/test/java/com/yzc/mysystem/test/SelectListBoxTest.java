package com.yzc.mysystem.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SelectListBoxTest {
	
  private WebDriver driver;

  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");	
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://192.168.0.153:8080/hris");
	  WebElement accountBox = driver.findElement(By.className("inputgri"));
	  accountBox.sendKeys("admin");
	  WebElement passwdBox = driver.findElement(By.xpath("//*[@id=\"content\"]/form/table/tbody/tr[2]/td[2]/input"));
	  passwdBox.sendKeys("123456");
	  WebElement submitbutton = driver.findElement(By.xpath("//*[@id=\"content\"]/form/p/input"));
	  submitbutton.click();
	  WebElement btn = driver.findElement(By.cssSelector(".button"));  
	  btn.click();//点击增加员工的按钮 
	  WebElement selectBox = driver.findElement(By.id("dept"));	//找到下拉列表框
	  Select select = new Select(selectBox);//创建一个操作Select类型的对象（对下拉框进行操作的）
	  //select.selectByIndex(2);//选择第3个选项
	  select.selectByVisibleText("研发部");
	  //找到保存的按钮
	  WebElement saveBtn = driver.findElement(By.cssSelector(".button"));
	  //点击提交
	  saveBtn.click();
	  //切换到对话框(找到对话框)
	  Alert msgBox = driver.switchTo().alert();
	  //获取对话框里面的提示信息
	  String message = msgBox.getText();
	  Thread.sleep(2000);
	  //点击确定
	  msgBox.accept();
	  //验证提示信息里面是否包含不能为空
	  assertEquals(message.contains("不能为空"),true);
	  
	  Thread.sleep(3000);  
  }
  @AfterMethod
  public void end(){
	  driver.quit();
  }
  
}
