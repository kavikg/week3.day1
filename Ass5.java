package week3.day1;

public class Ass5 {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		if (str3 == str4) {
			System.out.println("Same text");
		} else
			System.out.println("Diff text");

		System.out.println("***");
	}

}



//Answer: == operator compares the storage location of the object. If both the strings have stored in same memory  it would have returned Same text.