package kr.co.tj;

class Car2{
	private int speed;
	private int mileage;
	private String color;

	public Car2(){
		this(0,0,"no"); // 초기화
	}
	public Car2(int speed,int mileage,String color) {
		this.speed = speed;
		this.mileage = mileage;
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.out.print("2.차의 속도:"+speed+"\n차의 주행거리:"+mileage+"\n차의 색깔:"+color);
	}
	public String toString() {
		return "현재 자동차의 속도는 = "+speed+"\n현재 자동차의 주행거리는 = "+mileage+"\n현재 자동차의 색깔은 = "+color+"색";
	}
}


public class Test2_Car2 {
	public static void main(String[] args) {
		Car2 myCar = new Car2(100,0,"빨강");
		/**
		System.out.println(myCar); // toString이 없으면, car의 주소만 나온다.
		myCar.print(); // 생성자 함수를 호출
		*/
		myCar.setSpeed(100);
		myCar.setMileage(0);
		myCar.setColor("red");
		System.out.println("현재 자동차의 속도는 "+myCar.getSpeed());
		System.out.println("현재 자동차의 주행거리는 "+myCar.getMileage());
		System.out.println("현재 자동차의 색상은 "+myCar.getColor());
	}
}
