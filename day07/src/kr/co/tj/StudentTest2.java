package kr.co.tj;

// @@ class를 삭제하고 에러난곳 새로 구축해보자.
class Student2{
	private int student_ID; //--접근제한 // 캡슐화
	public String studentName; //-- 공개됨
	public String address; //--공개됨
	
	// @@@@@@ 묵시적 생성자 @@@@@@@
	public Student2() { // ★★★ 이것이 없어도 컴파일러가 묵시적인 [디폴트 생성자]를 수행한다.
		// 생성자의 목적 : 초기화.
		// 묵시적인 초기화 작업을 수행
		// class명과 동일하게, public으로 한다.
		// 간혹 필요에 의해 private로 한다. 
		student_ID =0;
		studentName = null;
		address = null;
	}
	public void showStrudentInfo() { // -- 공개된 메소드.
		System.out.println(studentName+","+address);
	}
	public String getStudentName() { //-- 공개된 메소드.
		return studentName;
	}
	public void setStudentID() { // 공개메소드 : student_ID에 접근할 수 있게 하는 문장.
		student_ID = 1;
	}
	
	// 디폴트 처리방식 (default는 컴파일러가 자체진행함)
	// default String student_name;
	String student_name;
	
}
//=======================================================================

public class StudentTest2 { // 공개 클래스는 단1개라야 함.
	public static void main(String[] args) {
		Student2 studentLee = new Student2(); // ★생성자 : new Student()
		Student2 studentKim = new Student2(); // ★생성자 : new Student()
		
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
		
		//StudentTest의 결과와 동일한 주소값이다. 동일데이터. 힙(동적메모리)의 값이 같으니, 
		// 스택의 주소도 같은곳을 사용.
		
		
	}
}
