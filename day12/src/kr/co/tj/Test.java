package kr.co.tj;

class Father extends Object{
	/**
	@Override
	public String toString() {
		return "Father";
	}*/
}

public class Test extends Object {
	
	@Override // 동적공간
	public String toString() {
		return "Test[]";
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("오버라이딩"+t.toString()); // 오버라이딩 했을때
		Father f = new Father();
		System.out.println("비오버라이딩"+f.toString()); // 오버라이딩 안했을때,

	}

}
