package String;

public class ToSeperateCapitalSmallString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCdEfgH";

		StringBuilder capitalStr = new StringBuilder();
		StringBuilder smallStr = new StringBuilder();

		for (char ch : str.toCharArray()) {

			if (Character.isUpperCase(ch)) {
				capitalStr.append(ch);
			} else {
				smallStr.append(ch);
			}
		}
		System.out.println("Capital Letters String :" + capitalStr);
		System.out.println("Small Letters String :" + smallStr);
	}

//	public static void main(String[] args) {
//
//		String originalString = "ABCdEfgH";
//
//		String uppercaseString = originalString.replaceAll("[^A-Z]", "");
//		String lowercaseString = originalString.replaceAll("[^a-z]", "");
//
//		System.out.println("Uppercase String: " + uppercaseString);
//
//		System.out.println("Lowercase String: " + lowercaseString);
//	}

}