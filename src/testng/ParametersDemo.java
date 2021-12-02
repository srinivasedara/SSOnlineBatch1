package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
  @Test(invocationCount=3)
  public void add() {
	  
	  int a = 34;
	  int b = 22;
	  int result = a+b;
	  System.out.println(result);
  }
  
  @Test
  @Parameters({"x","y"})
  public void add(int a, int b) {
	 
	  int result = a+b;
	  System.out.println(result);
  }
  
  @Test
  @Parameters({"a","b"})
  public void add(String a, String b) {
	 
	  String result = a+b;
	  System.out.println(result);
  }
  
}
