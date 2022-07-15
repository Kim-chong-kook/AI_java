package kr.co.tj1;

public class 스태틱Static은new_무관 {
	
	public static void main(String[] args) {

	// << 메모리 공간 구분 >>
	// new ===> 새로운 객체가 stack과 힙에 할당됨.
	// static ===> 별도의 공간에 메소드와 함께 존재 / 클레스들이 공유함
	// 메모리 영역 : 코드영역 / 데이터영역 / 상수영역 / static 영역
	// 상수영역 : 리터럴 값, constant.
	
	// 객체의 공통점을 찾아내 [공유형 변수 static]으로 할당.
	// 고유특성은 인스턴스로 만든다.
	
	// 인스턴스는 객체 소속 (객체/인스턴스.키워드).
	// static은 class 변수, 정적 변수로써, class 소속 (class.키워드) : 객체 생성과 관계없이 class 소속으로 거의 변하지 않는다.
	// static은 class에는 거의 붙지 않고 메소드(함수)/변수에 주로 붙는다.
	
	
		
	}
}
