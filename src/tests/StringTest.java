package tests;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tool="Selenium";
		System.out.println(tool);
		
		String type="WebDriver";
		System.out.println();
		
		String s=" ";
		System.out.println(tool + type);
		System.out.println(tool + " " +type);
		System.out.println(tool+s+type);
		
		int a=10;
		int b=20;
		
		System.out.println(tool+type+a+b);
		System.out.println(tool+type+(a+b));
		System.out.println(a+b+tool+type);
	}

}
