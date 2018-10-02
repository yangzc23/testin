package day02;

import org.testng.annotations.Test;

public class DependencyTest {
  
  @Test(dependsOnMethods = "f2")
  public void f1() {
	  System.out.println("hello case 100");
  }  

  @Test
  public void f2(){
	  System.out.println("hello case 200");
  }
  
}
