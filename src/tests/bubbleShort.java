package tests;

import java.util.Arrays;

public class bubbleShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {1,34,4,2,23,11,14};
		System.out.println("original Array:" +Arrays.toString(ar));
		
		int n=ar.length;
		
		for(int i=0; i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					int t = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=t;
				}
				
			}
		}
		System.out.println("Short Array:"+Arrays.toString(ar));

	}

}
