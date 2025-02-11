package string;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String strInput = "its Java Programming";
		
		StringBuilder strOutput = new StringBuilder();
		
		for(int i = 0; i < strInput.length(); i++){
			
			char ch = strInput.charAt(i);
			if(!Character.isWhitespace(ch)) {
				
				strOutput = strOutput.append(ch);
			}
		}
		
		System.out.print(strOutput);
	}

}
