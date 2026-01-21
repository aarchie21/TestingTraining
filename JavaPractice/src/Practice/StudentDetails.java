package Practice;

import java.util.Scanner;

public class StudentDetails {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	
	public StudentDetails(int studentId,String studentName, String studentAddress,String collegeName) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
		this.collegeName=collegeName;
	}
	public StudentDetails(int studentId,String studentName, String studentAddress) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
		this.collegeName="NIT";
	}
	public int getStudentID() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public String getStudentAddess() {
		return studentAddress;
	}
	public void setStudentAdress(String studentAddress) {
		this.studentAddress=studentAddress;
	}
	public String getStudentCollege() {
		return collegeName;
	}
	public void setStudentColege(String collegeName) {
		this.collegeName=collegeName;
	}
	
	public static void main(String[]args) {
		StudentDetails student=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("StudentID");
		int studentId=sc.nextInt();
		sc.nextLine();
		System.out.println("Student Name");
		String studentName=sc.nextLine();
		System.out.println("Student Address");
		String studentAddress=sc.nextLine();
//		StudentDetails student=new StudentDetails(studentId,studentName,studentAddress);
//		student.StudentDetails(studentId,studentName,studentAddress);
		while(true) {
			System.out.println("NIT(yes/no");
			String ans=sc.nextLine();
			if(ans.equalsIgnoreCase("Yes")) {
				student=new StudentDetails(studentId,studentName,studentAddress);
				break;
			}
			else if(ans.equalsIgnoreCase("No")) {
				System.out.println("College Name");
				String collegeName=sc.nextLine();
				student = new StudentDetails(studentId,studentName,studentAddress,collegeName);
				break;
			}
			else {
				System.out.println("Wronginput");
			}
		}
		System.out.println("StudentID"+student.getStudentID());
		System.out.println("Student Name"+student.getStudentName());
		System.out.println("Student Address"+student.getStudentAddess());
		System.out.println("College Name"+student.getStudentCollege());
	}

}
