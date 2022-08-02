package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> tools=new ArrayList<String>();
		
		tools.add("selenium");
		tools.add("java");
		tools.add("Html");
		tools.add("Css");
		
		System.out.println(tools.size());
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		tools.add("maven");
		System.out.println(tools.size());
		
		tools.remove(2);
		System.out.println(tools.get(2));
		
		System.out.println("---------------------");
		int i=0;

		for(i=0;i<tools.size();i++)
		{
		System.out.println(tools.get(i));	
		}
	}

}
