package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class AllAnnotations3 {
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
  @BeforeSuite
  public void beforeMethod() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterMethod() {
	  System.out.println("AfterSuite");
  }

}
