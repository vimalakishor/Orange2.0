package com.testngfeatures;

import org.testng.annotations.Test;

public class InvocationCountTest {
  @Test
  public void f() {
	  System.out.println("UI");
  }
  
  @Test (invocationCount = 2)
  public void f2() {
	  System.out.println("API");
  }
}
