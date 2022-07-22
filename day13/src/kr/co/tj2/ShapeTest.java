package kr.co.tj2;

abstract class Shape{
	public abstract void draw(); // 추상 메소드 선언 가능
	protected int x,y; // 변수도 선언 가능
	public void draw(int x,int y) { // 일반 함수 선언도 가능
		System.out.println("Shape Draw");
	}
}
class Rectangle extends Shape{
	protected int width, height;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}
class Trangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}
class Circle extends Shape{
	protected int radius;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle Draw");

	} // 추상클래스 내에서 추상 메소드에 대해 제작하라고 에러
	
}

public class ShapeTest {

	public static void main(String[] args) {
		// Shape shape new Shape();// 추상클레스 에서 new해서 에러 발생
		
	}

}
