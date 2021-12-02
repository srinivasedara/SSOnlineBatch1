package testng;

import org.testng.annotations.Test;

public class Dependant {
	@Test(dependsOnMethods = {"signup"})
	public void login() {
		System.out.println("Login");
	}
	@Test
	public void signup() {
		System.out.println("Signup");
	}

}
