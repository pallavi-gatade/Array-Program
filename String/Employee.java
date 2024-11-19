package String;

public class Employee {

	private String name;

	public static void main(String arg[]) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();

		Object obj = new Object();

		employee1.name = "Anant";
		employee2.name = "Anant";

		String str = new String("java");
		String str1 = new String("java");

		String s1 = "vani";
		String s2 = "vani";

		System.out.println("Employee class Method: ");
		System.out.println(employee1 == employee2);
		System.out.println(employee1.equals(employee2));

		System.out.println("String class: ");
		System.out.println(str == str1);
		System.out.println(str.equals(str1));

		System.out.println("String Literal: ");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));


	}
}