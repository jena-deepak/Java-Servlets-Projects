package demoservlets.entity;

public class Student {
	private int studentId;
	private String studentName;
	private int studentAge;
	private String password;
	private String confirmPassword;
	
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Student(int studentId, String studentName, int studentAge, String password,String confirmPassword) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.password = password;
		this.confirmPassword=confirmPassword;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return " [studentId :" + studentId + " |  studentName : " + studentName + " |  studentAge : " + studentAge + "]";
	}
	

}

