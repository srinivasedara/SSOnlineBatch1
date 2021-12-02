package testng;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(23,56);
		String c = add("12", "23");
		
		System.out.println(c);
	}

	public static void add() {
		int a = 23;
		int b = 12;
		int result = a+b;
		System.out.println(result);
	}
	
	public static void add(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}

	public static String add(String a, String b) {
		String result = a+b;
		return result;
	}
}
