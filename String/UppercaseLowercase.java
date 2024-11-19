package String;

public class UppercaseLowercase extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "ABCdEfGhIJ";

		StringBuilder capitalLetters = new StringBuilder();
		StringBuilder smallLetters = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {

			char letter = input.charAt(i);

			if (String.valueOf(letter).matches("[a-z]")) {
				smallLetters.append(letter);
			} else if (String.valueOf(letter).matches("[A-Z]")) {
				capitalLetters.append(letter);
			}
		}
		System.out.println(capitalLetters.toString());
		System.out.println(smallLetters.toString());
	}

}
