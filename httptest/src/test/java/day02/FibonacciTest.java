package day02;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FibonacciTest {
	
  @Test
  @Parameters({"input","expected"})	  
  public void f(int input,int expected) throws MyException {
	  assertEquals(
			  Fibonacci.getFib(input),expected);
  }
}
