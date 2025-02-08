package string;

public class PrintSpaceBetweenChar {

	public static void main(String[] args) {

//		first way
//		  String input = "Pallavi";
//	      String output = String.join(" ", input.split(""));
//	      System.out.println(output);
	      
//	      second way
		 String input = "Pallavi";  
		 
		 for(int i = 0; i < input.length(); i++) {
			 System.out.print (" " + input.charAt(i));
		 }
	}
}

//output
//P a l l a v i