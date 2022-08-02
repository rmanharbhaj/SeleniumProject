package tests;

public class WhileLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=50) {
			System.out.println(i);
			
			if(i==10) {
				System.out.println("user 10 founded");
				break;
			}
			i++;
				
		}
	}

}
