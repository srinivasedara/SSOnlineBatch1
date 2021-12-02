package basics;

public class Sample {

	public static void main(String[] args) {
		
		Sample obj = new Sample();
		obj.m1();
		Sample.m2();
	}
	
	public void m1() {
		System.out.println("M1");
	}
	public static void m2() {
		System.out.println("Static Method");
	}
	public void m3() {
	
	}
	public void m4() {
	}
	
}


