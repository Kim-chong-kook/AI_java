package kr.co.tj1;

class Shape{
	protected int x,y;
}
interface Drawable{
	void draw();
}

class Rectangle extends Shape implements Drawable{
	
	//Rectangle 오류에서 add 함.
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Draw");
	}
	
}
// ===============================================================
//인터페이스와는 다르게 추상클래스는 일반적인 필드나 메소드를 가질 수 있다. 
//그러한 추상클래스는 일부의 구현을 제공한다는 점에서만 인터페이스와 차이가 있다. 
//왜 인터페이스라는 개념을 귀찮게 도입하는 것인가? 그냥 추상클래로 처리하면 안되는가? 
//		그 이유는 자바가 다중상속을 지원하지 않는다는 점에 있다. 

// ★★★★추상클래스나 클래스로 부터 2개이상 상속받을 수 없는 문제는 interface로 해결할 수 있다.★★★★

public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.draw();
		Drawable d = new Rectangle(); // 자식생성을 업캐스팅도 가능함.
		d.draw();
	}

}
