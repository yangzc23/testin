package day02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRandomEmailGenerator {
  @Test
  public void f() {
      RandomEmailGenerator obj = new RandomEmailGenerator();
      String email = obj.generate();
      Assert.assertNotNull(email);
      Assert.assertEquals(email, "feedback@yzc.com");
  }
}
