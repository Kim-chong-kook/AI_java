package kr.co.tj;

public class Student {
	//public static void main(String[] args) {
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStrudentInfo() {
		System.out.println(studentName+","+address);
	}
	public String getStrudentName() {
		return studentName;
	}
}
