package String;

public class SeperateCapitalSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCdEfgH";

		String capitalStr = "";
		String smallStr = "";

		for (char ch : str.toCharArray()) {

			if (ch >= 65 && ch <= 90) {
				capitalStr = capitalStr + ch;
			} else {
				smallStr = smallStr + ch;
			}

		}
		System.out.println("Capital Letters String :" + capitalStr);
		System.out.println("Small Letters String :" + smallStr);
	}
}
