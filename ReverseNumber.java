package string;

public class ReverseNumber {

	 public static void main(String[] args) {
		 
		 int input = 27495;
		 
		 
		 System.out.println("Input Number is :" + input);
		 
//		 first approach
		 
//		 int rev = 0;
//   /*	 while(input != 0) {
//			 rev = rev * 10 + input % 10;
//			 input = input/10;
//		 }
//		 
//		 System.out.println("Reverse Number is :" + rev);
//	*/	 
		 
		 // second approach
		 
//		 StringBuffer str = new StringBuffer(String.valueOf(input));
//		 
//		 StringBuffer rev = str.reverse();
//		 
//		 System.out.println("Reverse Number is :" + rev);
		 
		 
		// Third approach
		 StringBuilder str = new StringBuilder();
		 
		 str.append(input);
		 
		 StringBuilder rev = str.reverse();
		 
		 System.out.println("Reverse Number is :" + rev);
		 
		 } 
	 
}
