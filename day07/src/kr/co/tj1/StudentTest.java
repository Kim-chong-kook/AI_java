package kr.co.tj1;


class Student {
	int studentNumber;
	String studentName;
	int grade;
	
	public Student() { // 컴파일러가 기본 해줘야 하지만, 아래서 변경했기에 이것도 [기본문구만]써주면 된다.
	// ★★★ 아래에서 데이터의 균일성에 문제가 생기므로 생략하는 것이 좋다.
		//studentNumber=0; // 생략가능
		//studentName=null; // 생략가능 
		//grade=0; // 생략가능
	}	
	// 생성자 임의 셋팅하면, 기본 생성자를 만들어 줘야 한다.
	public Student(int studentNumber,String studentName,int grade) {
		this.studentNumber = studentNumber; // [this.]는 자기자신이 가지고 있는...
		this.studentName = studentName;
		this.grade = grade;
	}

	public String showStudentInfo() {
		return studentName+"학생의 학번은"+studentNumber+"이고,"+grade+"학년입니다.";
	}
}

//===================
/**
class Student{
	int studentNumber;
	String studentName;
	int grade;
	public Student() {
	}
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	public String showStudentInfo() {
		return studentName+"학생의 학번은"+studentNumber+"이고,"+grade+"학년입니다.";
	}	
}
*/
	//====================================
	
public class StudentTest {
	public static void main(String[] args) {
		
		// 오버로딩이 10여개 이상 개발자가 만들어 놓았다.
		// 오버라이딩은 다른 개념이다.
		//System.out.print
		Student studentLee = new Student(); // 객체를 생성할때마다 1회 호출하고 끝나며 재사용 불가
		Student studentKim = new Student(123456,"kim",3);
		studentLee.grade=1;
		
		System.out.println(studentLee.showStudentInfo());
		System.out.println(studentKim.showStudentInfo());
	}
}
	
	
	

