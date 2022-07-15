package kr.co.tj;

//import javax.security.auth.Subject;

// 학생 아이덴티티 class
class Student{
	int studentID;
	String studentName;
	
	//과목 추가부분
	public Subject korea; //public을 안넣어도 default 수행되나, pakage 내부만 사용됨(같은 페키지)
	public Subject math; //public을 안넣어도 default 수행되나, pakage 내부만 사용됨(같은 페키지)
	
	public Student() { // ●●● 기본생성자 : 객체생성 new 부분은 꼭 넣어줘야 한다.
		korea = new Subject();
		math = new Subject();
	}
	public Student(int id,String name) {
		studentID = id; // 이름이 달라 this 안썼다.
		studentName = name;
		korea = new Subject();
		math = new Subject();
	}
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 종점은"+total+"점 입니다");
		System.out.println(korea); // = System.out.println(korea.toString()); // 동일하게 처리
		System.out.println(math.toString()); // toString()은 생략가능 = 컴파일러 추정기능
	}
}

// ====== 과목에 대한 세부 [처리 class]를 독립시켜 Student class를 단순화.
class Subject{
	public String subjectName;
	public int score;
	public int subjectID;
	//생성자
	public Subject() {}
	public Subject(String subjectName,int score,int subjectID) {
		this.subjectName=subjectName;
		this.score=score;
		this.subjectID = subjectID;
	}
	public String toString() {
		return subjectName+":"+score+":"+subjectID;
	}
	
}

//== 파일분리 : 클라이언트 메인===================================
public class StudentTest_클래스생성 {

	public static void main(String[] args) {
		
		// 입력부분
		Student studentLee = new Student(100,"이순신");
		studentLee.setKoreaSubject("국어",100);
		studentLee.setMathSubject("수학",95);
		
		Student studentKim = new Student(101,"김유신");
		studentKim.setKoreaSubject("국어",80);
		studentKim.setMathSubject("수학",99);
		
		// 출력부분
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}

}
