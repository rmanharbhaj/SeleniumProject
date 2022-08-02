package tests;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a = 0, b = 1, c, i, count = 10;
		// To print 0 and 1
		System.out.println(a + " " + b);
		// loop starts from 2. We have already printed 0 and 1 in the previous step
		for (i = 2; i < count; i++) {
		c = a + b;
		System.out.println(" " + c);
		a=b;
		b=c;
		}
		
		char j;

	    for(j = 'A'; j <= 'Z'; ++j) {
	    	
	    	System.out.print(j + " ");
	    	
	    }
	      
	    
	}

}




