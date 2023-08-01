package com.testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
  @Test
  public void f() {
	  System.out.println("Java");
  }
  @Test
  public void f2() {
	  System.out.println("Selenium");
  }
  @Test 
  @Ignore
  public void f3() {
	  System.out.println("python");
  }
  @Test(enabled = false)
  public void f4() {
	  System.out.println("cypress");
  }
}
