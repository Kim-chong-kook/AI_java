package kr.co.tj;

class Shape { // extends Object 묵시적 있음.
    public Shape(String msg) {	
         System.out.println("Shape 생성자() " + msg);
    }
}

public class Rectangle extends Shape {
    public Rectangle(){	// 생성자를 실행한다. / 매개변수 없는 기본생성자/////////////////	
		 super("from Rectangle");	// 명시적인 호출 / 없으면 자동으로 빈공백 super()호출
         System.out.println("Rectangle 생성자()");
    }
    public static void main(String[] args) {
          Rectangle r = new Rectangle();
    }
} 
