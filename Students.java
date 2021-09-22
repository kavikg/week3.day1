package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println(id + " " + name);
	}

	public void getStudentInfo(String email, String phoneno) {
		System.out.println(email);
		System.out.println(phoneno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s = new Students();
		s.getStudentInfo(6);
		s.getStudentInfo(6, "Test");
		s.getStudentInfo("a@gmail.com", "1234567890");

	}

}
