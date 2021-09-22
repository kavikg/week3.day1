package week3.day1;

public class Stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I am Learning Java";
		String s2 = "I am learning java";

		if (s1 == s2) {
			System.out.println("equals operator");
		} else {
			System.out.println("equals operator not working");
		}

		if (s1.equals(s2))

		{
			System.out.println("both strings are equal");
		} else {
			System.out.println("both strings are not equal");
		}
		if (s1.equalsIgnoreCase(s2))

		{
			System.out.println("both strings are equal ignoring casesensitivity");
		} else {
			System.out.println("both strings are not equal ignoring casesensitivity");
		}
	}
}
