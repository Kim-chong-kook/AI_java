package kr.co.tj2;

class Point{
	public int x;
	public int y;
	
	public Point() {
		this(0,0);
	}
	public Point(int a, int b) {
		x = a;
		y = b;
	}
}

class Circle{
	public int radius = 0;
	public Point center; // <<<< Point 참조 변수가 필드로 선언되었다(has a) 포함관계>>>
	
	public Circle() {
		center = new Point(0,0); // ★★★첫번째 호출된 메소드
	}
	public Circle(int r) { // r은 반지름, 정수나 실수
		center = new Point(0,0);
		radius = r;
	}
	public Circle(Point p, int r) { // ★★★ 두번째 호출된 메소드
		center = p;
		radius = r;
	}
	public void printCircle() {
		System.out.println("x="+center.x); // center에 들어 있고 종속됨
		System.out.println("y="+center.y);
		System.out.println("radius="+radius); // center에 들어 있고 종속됨
	}
	
}
public class CircleTest {

	public static void main(String[] args) {
		// Circle 객체를 생성하고 초기화한다.
		Point p = new Point(25,78);
		Circle c = new Circle(p,10);
		c.printCircle();
		
	}

}
