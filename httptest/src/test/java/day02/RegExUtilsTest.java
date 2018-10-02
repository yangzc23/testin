package day02;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegExUtilsTest {

  @Test(dataProvider="data")
  public void  testIdentityCard(String id,boolean expected) {
	assertEquals(RegExUtils.identityCard(id),expected);
  }
 
  @DataProvider(name="data")
  public Object[][] provideData(){
	  Object[][] arr = {
			  			{"123456789",false},
			  			{"321234199009091234",true}
	  					};
	  return arr;
  }
 
 
  
}  
  
