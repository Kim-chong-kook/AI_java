package kr.co.tj;

// 인터페이스
interface RemoteControl{
	void turnOn();
	void turnOff();
	// abstract 생략됨.
}
//========<< 물건 내용 >> ==================================
//파일로 할땐, public 꼭 붙이자.
class Television extends Object implements  RemoteControl{  // extends Object 생략함.
// // ★★★ Television 에러에서 add 로 implements 구현해줘야 한다.
	
	@Override // 상속받았음.
	public void turnOn() { // ★★★ 컴파일러가 반드시 public 붙여준다.
		System.out.println("Tv켠다.");
	}
	@Override // 상속받았음.
	public void turnOff() {
		System.out.println("Tv끈다.");
	}
}
// ★★★ 파일로 할땐, public 꼭 붙이자.★★★
class Refrigerator implements RemoteControl{

	@Override  // 상속받았음.
	public void turnOn() {
		System.out.println("냉장고 켠다.");
		
	}

	@Override  // 상속받았음.
	public void turnOff() {
		System.out.println("냉장고 끈다.");
		
	}
	
}
//=====================================================
public class InterfaceTest1 {
	public static void main(String[] args) {
		
		// 1. ★★★ 인터페이스는 객체생성 불가
		// RemoteControl obj = new RemoteControl();
		
		// class만 상속된 객체는 생성 가능함
//		Television t = new Television(); // 물건객체는 생성가능 함.
//		t.turnOn();
//		t.turnOff();
//		Refrigerator r = new Refrigerator();
//		r.turnOn();
//		r.turnOff();
		
		//2. 업캐스팅 ---다운캐스팅 가능함.
		RemoteControl obj = (RemoteControl)new Television(); // 업 캐스팅하면 접근가능
		obj.turnOn();
		obj.turnOff();
	}
}
