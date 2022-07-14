package kr.co.tj1;

class Academy {
	private int studentNo; // 캡슐화 하면, 아래 클라이언트 인스턴스에서 보이지 않는다. 그래서 임의 생성자만든다.
	private String studentName;
	public Academy() {//기본 생성자
		this(2022,"김철수"); // ★★★ 아래 것을 호출
	} 
	public Academy(int studentNo,String studentName) { // 매개변수가 있는 생성자 작성.
		// this. = 계속 재사용한다는 의미
		this.studentNo = studentNo; // 형과 이름이 같으면, this가 빠지면 멤버변수로 등록이 안되며 local 변수로 쓰고 사라진다.
		this.studentName = 	studentName;  // 형과 이름이 같으면, this가 빠지면 멤버변수로 등록이 안되며 local 변수로 쓰고 사라진다.
	}
	// ★★★★★★★ 캡슐화로 인해 클라이언트에 보여줄 [함수/메소드]를 별도로 만든다.
	public void academyAll() { // 함수/메소드는 소문자로 시작하고 중간에 대문자
		System.out.println(studentNo+":"+studentName);
	}
}


//======클라이언트====================================
public class AcademyTest_Good{
	public static void main(String[] args) {
		
		Academy academy = new Academy(2022,"이순신"); // 임의 생성자를 사용함....
		Academy academy1 = new Academy(); // 기본 생성자에서 가져옴.....
		
		//아래에서 출력할 academy. // privat 캡슐화로 [개발class의 함수/메소드]가 안보임(캡슐화).
		//개발자에서 주는 것만을 받아온다.
		academy.academyAll();
		academy1.academyAll();
		
	}
}