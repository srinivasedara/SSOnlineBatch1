package testng;

import org.testng.annotations.Test;

public class Regression {
	@Test(groups={"Smoke","Regression"})
	public void m1() {
		System.out.println("m1");
	}
	@Test(groups= {"Sanity"})
	public void m2() {
		System.out.println("m2");
	}
	@Test(groups={"Smoke"})
	public void m3() {
		System.out.println("m3");
	}
	@Test(groups={"Regression","Sanity"})
	public void m4() {
		System.out.println("m4");
	}
	@Test(groups={"Smoke"})
	public void m5() {
		System.out.println("m5");
	}
	@Test(groups={"Smoke"})
	public void m6() {
		System.out.println("m6");
	}
	@Test(groups={"Regression"})
	public void m7() {
		System.out.println("m7");
	}
	@Test(groups={"Sanity"})
	public void m8() {
		System.out.println("m8");
	}
	@Test(groups={"Sanity", "Regression"})
	public void m9() {
		System.out.println("m9");
	}

}
