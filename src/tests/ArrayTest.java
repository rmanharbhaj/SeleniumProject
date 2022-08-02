package tests;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int
		int numbers[]= {1,2,3,4,5};
		System.out.println(numbers.length);
		Arrays.sort(numbers);
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		
		//string
		int i=0;
		String tools[]= {"abc","xyz","pqr"};
		
		System.out.println(tools[0]);
		System.out.println(tools[1]);
		
		for(i=0;i<tools.length;i++)
		{
		System.out.println(tools[i]);	
		}
		
		
	}

}
