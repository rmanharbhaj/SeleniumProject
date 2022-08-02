package tests;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(i=1;i<=10;i++) {
			System.out.println(i);
			if(i==7) {
				System.out.println("user 7 founded");
				break;
			}
		}
		System.out.println("quit");
	}

}
