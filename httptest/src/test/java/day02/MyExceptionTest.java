package day02;

import org.testng.annotations.Test;

public class MyExceptionTest {
  @Test(expectedExceptions=MyException.class)
  public void f() throws MyException {
	  Fibonacci.getFib(47);
  }
}
