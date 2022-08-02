package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum(6,7);
		sum(7,8,9);

	}
	
	public static void sum() {
		int a = 3+4;
		System.out.println(a);
	}
//generic method
	public static void sum(int b,int c) {
		int a = b+c;
		System.out.println(a);
	}
	
	public static void sum(int p,int q,int r) {
		int a = p+q+r;
		System.out.println(a);
	}
}
