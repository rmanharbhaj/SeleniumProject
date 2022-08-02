package SeleniumFinalPractice;

public class splitWordsBySpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			String s1="Riddhi Ghori";  
			String[] words=s1.split(" ");//splits the string based on whitespace  
			//using java foreach loop to print elements of string array  
			for(String w:words){  
			System.out.println(w);  
			}  
			

	}

}
