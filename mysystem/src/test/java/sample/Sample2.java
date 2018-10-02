package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://www.leshu.com.cn/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[4]/a")).click();
		 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[3]/a")).click();
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/a")).click();
		  
		  
		  Thread.sleep(3000);
		  for(String winHandle : driver.getWindowHandles()){ 
				 System. out.println( "+++" + winHandle); 
				 driver.switchTo().window(winHandle); 
				 }  
		  
		 driver.findElement(By.cssSelector("body > div.main-1200 > div.l-box > div.dl-box > div.start-game > a")).click();
		 
		 Thread.sleep(3000);
		 
		  for(String winHandle : driver.getWindowHandles()){ 
				 System. out.println( "+++" + winHandle); 
				 driver.switchTo().window(winHandle); 
				 }  		 
		
		  WebElement inputBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		  inputBox.sendKeys("14782948589");
		  WebElement inputBox2 = driver.findElement(By.xpath("//*[@id=\"logPsd\"]"));
		  inputBox.sendKeys("xujiaqiaini1");
		  driver.findElement(By.xpath("//*[@id=\"log-btn\"]")).click();
		 driver.quit();
		 
		 
		 
		
		 
		
	}
}
