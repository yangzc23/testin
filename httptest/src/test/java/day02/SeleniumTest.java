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
	  //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");//����chrome�����������·��
	  //WebDriver driver = new ChromeDriver();//����һ����������������chrome�������
	  //System.setProperty("webdriver.ie.driver", "D:\\MicrosoftWebDriver.exe");//����ie�����������·��	  
	  //WebDriver driver = new InternetExplorerDriver();//����һ����������������ie�������
	  System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");//���û�������ִ���ļ���·��  	  
	  WebDriver driver = new FirefoxDriver();//����һ����������������firefox�������	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//���ó�ʱ���ȴ�ʱ�䲻�ܳ���15s��
	  driver.manage().window().maximize();//������������
	  driver.get("http://www.bing.com");//����url��ַ����ҳ
	  Thread.sleep(3000);//�ӳ�3�루�߳�����3�룩
	  driver.quit();//�ر������
  }
}


