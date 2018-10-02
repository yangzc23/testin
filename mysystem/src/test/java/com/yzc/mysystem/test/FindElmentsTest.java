package com.yzc.mysystem.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindElmentsTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.firefox.bin", 
			  "C:\\Program Files\\Mozilla Firefox\\firefox.exe");	
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://192.168.0.153:8080/hris");
	  //找到所有的class属性值为inputgri的web元素
	  List<WebElement> elements = driver.findElements(By.className("inputgri"));
	  for(WebElement e:elements){
		  System.out.println(e.toString());
	  }
	  driver.quit();//关闭浏览器
  }
}
