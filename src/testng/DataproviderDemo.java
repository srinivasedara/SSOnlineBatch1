package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderDemo {
  @Test(dataProvider = "login")
  public void f(Integer n, String s) {
	  System.out.println(n +","+ s);
  }
  @Test(dataProvider = "signup")
  public void f1(String n, String s) {
	  System.out.println(n +","+ s);
  }
  @Test(dataProvider = "reg")
  public void f1(String n) {
	  System.out.println(n);
  }

  @DataProvider
  public Object[][] login() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
  }
  
  @DataProvider
  public String[][] signup() {
    return new String[][] {
      new String[] { "a", "a" },
      new String[] { "b", "b" },
      new String[] { "c", "c" },
    };
  }
  
  @DataProvider
  public String[][] reg() {
    return new String[][] {
      new String[] { "x" },
      new String[] { "y" },
      
    };
  }
}
