package string;

public class ReverseString {

	public static void main(String[] args) {

		String inputStr = "ABCDE";
		
		String reverseStr = "";
		
		int strLength = inputStr.length();
		
		for(int i = strLength - 1; i >= 0; i--) {
			
			reverseStr = reverseStr + inputStr.charAt(i);
		}
		
		System.out.println("The Reverse String is :" + reverseStr);
	}
	
	
	
}
