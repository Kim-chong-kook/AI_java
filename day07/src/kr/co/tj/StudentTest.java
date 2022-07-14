package kr.co.tj;

// @@ class를 [파일로]분리하는게 맞지만 (교재처럼) 함께 작성한다.
class Student{
	private int student_ID; //--각기 메모리 할당. 초기값 0
	public String studentName; //--각기 메모리 할당. 초기값 null
	public String address; //--각기 메모리 할당. 초기값 null
	
	public void showStrudentInfo() {
		System.out.println(studentName+","+address);
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentID() {
		student_ID = 1;
	}
	
	// 디폴트 처리방식 (default는 컴파일러가 자체진행함)
	String student_name;  
	
}

// @@ class를 [파일로] 분리하는게 맞지만 (교재처럼) 함께 작성해본다.

public class StudentTest { // 공개 클래스는 단1개라야 함.
	public static void main(String[] args) {
		Student studentLee = new Student();
		Student studentKim = new Student();
		
		//studentLee.student_ID = 1; // class 의 private 처리된 부분은 접근제한됨
		studentLee.setStudentID(); // class의 public 부분만 접근가능함.
		
		studentLee.address="서울시";
		studentLee.studentName="이순신";
		studentLee.showStrudentInfo();
		studentKim.address="경기도";
		studentKim.studentName="김유신";
		studentKim.showStrudentInfo();
		
		System.out.println(studentLee); // 객체 정보 출력 : 스택의 4byte, 16진수 주소
		System.out.println(studentKim); // 객체 정보 출력 : 4byte, 16진수 주소
		
		
		
		
	}
}
