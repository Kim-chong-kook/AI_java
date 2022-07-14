package kr.co.tj;

public class StudentTest_작성된_클래스_시험 { // @@ 객체(Object, 메모리에는:인스턴스)를 사용한다.
	// @@ 배열은 같은 타입의 자료형으로 만들고, 
	// @@ 객체는 다른타입의 자료형으로도 만들 수 있다.
	public static void main(String[] args) {
		
		Student studentLee = new Student(); // 메모리 할당 : // 스택(주소값)과 힙(실재 변수자료)에 상주한다.
		// @@ class명. 하면 가지고 있는 객체의 종류가 나온다.
		studentLee.studentName = "이순신"; 
		studentLee.address = "서울";
		studentLee.showStrudentInfo();
		
		Student studentKim = new Student(); // 메모리 할당 : // 스택(주소값)과 힙(실재 변수자료)에 상주한다.
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		studentKim.showStrudentInfo();
		
		System.out.println(studentLee); // 객체 정보 출력 : 스택의 4byte, 16진수 주소
		System.out.println(studentKim); // 객체 정보 출력 : 4byte, 16진수 주소
		
	}
}
// @@@@@@@@@@@ 용어정리 @@@@@@@@@@@@@
// 객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
//클래스 : 객체를 프로그래밍 하기 위해 코드로 정의해 놓은 상태
//인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
//멤버 변수 : 클래스의 속성, 특성
//메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현한 함수
//참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
//참조 값 : 생성된 인스턴스의 메모리 주소 값