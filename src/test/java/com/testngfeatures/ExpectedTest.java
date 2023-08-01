package com.testngfeatures;

import org.testng.annotations.Test;

public class ExpectedTest {
  @Test(expectedExceptions = NullPointerException.class)
  public void f() {
	  String s = null;
	  System.out.println(s.length());
  }
}
