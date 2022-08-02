package tests;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if i have to store value of return in different variables
		int x=sum();
		int p=x+8;
		System.out.println(x);
		System.out.println(p);
		System.out.println(sum());
		
		String a=tool();
		System.out.println(a);

	}
	
	public static int sum() {
		int a = 5+6;
		return a;
		
	}
	
	public static String tool() {
		String s = "Hello Selenium";
		return s;
		
	}

}
