package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class AllAnnotations2 {
  @Test
  public void f() {
	  System.out.println("Test1");
  }
  @Test
  public void f1() {
	  System.out.println("Test2");
  }
  @Test
  public void f2() {
	  System.out.println("Test3");
  }
  @Test
  public void f3() {
	  System.out.println("Test4");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

}
