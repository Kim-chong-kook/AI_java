package kr.co.tj;

class DependenceBean{ // 결합성, 의존성, 의존콩, 의존씨앗
	//메서드 생성
	//public void call(String name) {
	public int calling(String name) { ////// 메서드명을 바꿀때 마다 에러가 발생해서 수정해야 한다.
	// type, 메서드 이름 등 수정을 가하면 연달아 의존된, 종속된 클래스가 에러난다. 모두 고쳐야 하는 문제발생.
	// 이럴때, 인터페이스를 사용한다.
		System.out.println("의존이 "+name);
	}
}
public class Dependece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DependenceBean bean = new DependenceBean();
		bean.call("너무 강하다.");
	}

}
