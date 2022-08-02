package tests;

public class occurences_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      
		  String input = "aaaabbccAAdd";
		  char search = 'a';             // Character to search is 'a'.
		  
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == search)
		      count++;
		  }
		  
		  System.out.println("The Character '"+search+"' appears "+count+" times.");
		  
		


	}

}
