package kr.co.tj2;

class Shape{
	protected int x,y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}
class Rectangle extends Shape{
	private int width, height;
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	public void draw() { // 상속받아 실행하게 된다.
		System.out.println("Rectangle Draw");
	}
}
class Circle extends Shape{
	private int radius;
	public void draw() { // 상속받아 실행하게 된다.
		System.out.println("Circle Draw");
	}
}
class Triangle extends Shape{
	private int base, height;
	public void draw() { // 상속받아 실행하게 된다.
		System.out.println("Triangle Draw");
	}
}

public class ShapeTest_모양상속실험2 {
	private static Shape arrayOfShapes[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		drawAll();
	}
	public static void init() {
		arrayOfShapes = new Shape[3]; // 객체가 아니다.
		arrayOfShapes[0] = new Rectangle(); // 배열 객체의 다형성
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();
		
	}
	public static void drawAll() {
		for(int i=0; i< arrayOfShapes.length;i++) {
			arrayOfShapes[i].draw(); // 실제 객체이다.  // 각 모양에서 상속받아 실행하게 된다.
		}
	}

}
