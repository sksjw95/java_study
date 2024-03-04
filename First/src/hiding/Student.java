package hiding;

public class Student {
	public static int serialNum =1000;
	public int stuedentID;
	private String studentName;
	int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
