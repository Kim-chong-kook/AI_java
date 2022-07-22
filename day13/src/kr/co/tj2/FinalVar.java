package kr.co.tj2;

class VarClass{
	final int x; // final 변수,메소드,클래스에 붙는다.
	static final int y; // [문자열] 상수로 정의 되었다. 수정되지 않는다.
	static {
		y = 100;
	}
	static final int z = 100;
	
	public VarClass(int x) {
		this.x = x;
	}
	public void setX() {
		this.x = 50; // final은 수정되지 않는다.
	}
}

class Methodsuper{
	final void superMethode() {
		System.out.println("super method");
	}
}
class MethodChild extends Methodsuper{
	void superMethod() {
	}
}

final class Methodesuper2{
	
}



public class FinalVar {

	public static void main(String[] args) {
		VarClass vc1 = new VarClass(10) ;
		vc1.x = 20; // final 수정되지 않는다.
		

	}

}
