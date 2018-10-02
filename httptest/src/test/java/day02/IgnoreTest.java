package day02;

import org.testng.annotations.Test;

public class IgnoreTest {
  @Test
  public void f1() {
	  System.out.println("hello testng");
  }
  
  @Test(enabled = false)
  public void f2() {
	  System.out.println("hello java");
  }  
}
