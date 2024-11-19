package String;

public class CountCharacterOccurrance {

	public static void main(String[] srgs)
	{
		String str = "Java is a programming language";
		int totalLength = str.length();
		int lengthAfterRemovingA = str.replace("a", "").length();
		
		int finalLength = totalLength - lengthAfterRemovingA;
		
		System.out.print("number of Occurrance of A :" + finalLength);
	}
	}
