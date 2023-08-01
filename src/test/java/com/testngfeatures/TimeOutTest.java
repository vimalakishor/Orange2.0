package com.testngfeatures;

import org.testng.annotations.Test;

public class TimeOutTest {
  @Test (timeOut = 3000)
  public void f() throws InterruptedException {
	  
	  
	  System.out.println("Browser launch");
	  
	  System.out.println("Url Launch");
	  Thread.sleep(2000);
	  System.out.println("Application login");
  }
}
