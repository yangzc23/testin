package day02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HelloTest {
  @Test
  public void f() {
	  System.out.println("testcase001");
  }

  @Test
  public void f2() {
	  System.out.println("testcase002");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("begin a case");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("end a case");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("begin");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("end");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("begin test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("end test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("suite begin");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("suite end");
  }

}
