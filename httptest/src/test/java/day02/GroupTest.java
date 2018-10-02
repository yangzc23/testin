package day02;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {	
  @BeforeGroups("g01")
  public void begin(){
	  System.out.println("g01 begin");
  }  
  
  @AfterGroups("g01")
  public void end(){
	  System.out.println("g01 end");
  }  
  
  @Test(groups="g01")
  public void f1() {
	  System.out.println("hello test case 001");
  }
  
  @Test(groups="g01")
  public void f2() {
	  System.out.println("hello test case 002");
  } 
  
  @Test(groups="g02")
  public void f3() {
	  System.out.println("hello test case 003");
  }
  
  @Test(groups="g02")
  public void f4() {
	  System.out.println("hello test case 004");
  } 
  
  @Test(dependsOnGroups = {"g01","g02"})
  public void f5() {
	  System.out.println("hello test case 005");
  }  
  
}
