package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student2 student1 = new Student2();
		student1.studentName = "서지웅";
		System.out.println(student1.getStudentName());
		Student2 student2 =new Student2();
		student2.studentName="서의현";
		System.out.println(student2.getStudentName());
		System.out.println(student1);
		System.out.println(student2);
	}

}
