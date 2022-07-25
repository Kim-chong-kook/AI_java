package kr.co.tj3;

// 인터페이스와 인터페이스 끼리는 상속된다.
// 추상클래스는 메소드 재정의 해도 안해도
// 일반클래스는 메소드 재정의 꼭 해줘야 한다.

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mClass =new MyClass();
		
		X xClass = mClass;
		xClass.x();
		
		Y yClass = mClass;
		yClass.y();
		
		MyClass iClass = mClass;
		iClass.x();
		iClass.y()
		iClass.myMethod();
	}

}
