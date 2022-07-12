package kr.co.tj; // 페키지 이름은 소문자로 작성 // 도메인 꺼꾸로 중복되지 않게.

public class VariableTest { // 클래스명은 첫글자를 대문자로 작성
	public static void main(String[] args) {
		int age,count=0;
		age=10;
		
		int level =10000;
		System.out.println(age);
		System.out.println(level); // syso 찍고 컨트롤 스페이스바 : 완성
		System.out.println(count); // 초기화 하지 않으면, 에러
		age=20;
		System.out.println(age);
		System.out.println();
		
		// <<변수명>>
		// $, _.. 맨앞 변수중에 첫글자가능한 특수문자. 그러나 가독성이 떨어진다.
		// 123... 맨앞 숫자는 사용불가
		// 예약어, int while, int for 등은 사용불가.
		int numberOfStudent; // 의미가 통하는 말로 만든다. 
		
		// 변수선언시 =은 대입자이다. 왼쪽은 L value, 오른쪽은 R value.
		// R value의 것을 복사해서 L value의 공간에 넣는다.
		// 변수선언은 가급적 상부에 한번에 해라... 함수만들때는 예외일듯.
		// age = 10; // 대입방식
		// int age = 10; // 초기화 방식
		
		// 가독성이 문제라서 변수명을 정하는게 힘들다. 
		// 변수명은 길어도 무관하고 이해하기 쉽게... 축약은 비추다.
		
		
	}
}
