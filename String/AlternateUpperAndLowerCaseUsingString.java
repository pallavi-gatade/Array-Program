package string;

public class AlternateUpperAndLowerCaseUsingString {

	public static void main(String[] args) {

//		first way
		
		String input = "pallavi";

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (i % 2 == 0) {
				output.append(Character.toUpperCase(ch)); // Even index → Uppercase
			} else {
				output.append(Character.toLowerCase(ch)); // Odd index → Lowercase
			}
		}

		System.out.println(output.toString());
//		====================================================================
//		second way
		
		 String str = "pallavi";
	        char[] charArray = input.toCharArray(); // Convert string to char array

	        for (int i = 0; i < charArray.length; i++) {
	            if (i % 2 == 0) {
	                charArray[i] = Character.toUpperCase(charArray[i]); // Even index → Uppercase
	            } else {
	                charArray[i] = Character.toLowerCase(charArray[i]); // Odd index → Lowercase
	            }
	        }

	        String result = new String(charArray); // Convert char array back to string
	        System.out.println(result);
		
		
	}
}

//output
//PaLlAvI