package kr.co.tj;

class Car{
	private int speed;
	private int gear;
	private String color;

	public Car(){
		this(0,0,"no"); // 초기화
	}
	public Car(int speed,int gear,String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
	}
	public void print() {
		System.out.print("2.차의 색깔:"+color+"\n차의 속도:"+speed+"\n차의 기어:"+gear);
	}
	public String toString() {
		return "차의 색깔:"+color+"\n차의 속도:"+speed+"\n차의 기어:"+gear;
	}
}


public class Test1_Car {
	public static void main(String[] args) {
		Car car = new Car(0,1,"red"); ////////// private 일경우 변수 직접넣어 사용
		Car car2 = new Car(0,1,"blue");
		
		System.out.println(car); // toString이 없으면, car의 주소만 나온다.
		
		car.print(); // 함수를 호출하는 방식
		
	}
}
