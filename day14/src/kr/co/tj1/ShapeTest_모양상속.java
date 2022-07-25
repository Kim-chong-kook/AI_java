package kr.co.tj1;

class Shape{
	protected int x, y;
}

class Rectangle1 extends Shape{ // 상속받음
	public int width, height;
	
}

public class ShapeTest_모양상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s;
		Rectangle1 r = new Rectangle1();
		s = (Shape)r;
		s.x = 0;
		s.y = 0;
//		s.width = 100; // width 접근 불가, 사용하려면 down casting 한다.
//		s.height = 100; // width 접근 불가, 사용하려면 down casting 한다.
		
		r = (Rectangle1)s; // down casting
		r.width = 100; // width 접근가능함.
		
		// 첨부터 하향 캐스팅은 불가해서 위와 같이 한다.
		// Rectangle r = new Shape(); // 기본적으론 하향 casting 불가함.
	}

}
