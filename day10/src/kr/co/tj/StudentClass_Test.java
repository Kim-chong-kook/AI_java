package kr.co.tj;

import java.util.ArrayList;

class Student{
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList = new ArrayList<Subject>(); // 컨트롤 쉬프트 O 생성
	// 원래는 생성자 안에서 만들어야 한다.
	
	public Student() {
		
	}
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
		System.out.println("과목이 등록됨.");
	}
	public void showStudentInfo() {
		int total = 0;
		for(Subject s: subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
		} // ★ ★ ★ ★이 함수를 호출했던 main에서 studentName과 과목/점수를 주었기 때문에 호출한 studentName이 된다.
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
		// ★ ★ ★ ★이 함수를 호출했던 곳에서 studentName과 과목/점수를 주었기 때문에 호출한 studentName이 된다.
	}
}
class Subject{
	private String name;
	private int scorePoint;
	
	public Subject() {
		this("no",0);
	}
	public Subject(String name, int scorePorint) {
		this.name = name;
		this.scorePoint = scorePoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScorePoint() {
		return scorePoint;
	}

	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	
}
public class StudentClass_Test {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002,"Kim");
		studentKim.addSubject("국어", 80);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 80);
		
		studentLee.showStudentInfo();
		System.out.println("=========================================");
		studentKim.showStudentInfo();

	}

}
