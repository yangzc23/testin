package day02;

import org.testng.annotations.Test;

public class OverTimeTest {
  @Test(timeOut=3000)
  public void f() throws MyException {
	  System.out.println("overtime test");
	  Fibonacci.getFib(46);
  }
}
