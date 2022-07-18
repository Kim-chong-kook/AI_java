package kr.co.tj2;

class Car{
	private String color;
	private int speed;
	private int gear;
	private int id; // 시리얼 번호
	private static int numberOfCars = 0;
	// static {} 구조화가 원칙
	// 실체화된 Car객체의 개수를 위한 정적변수

	public Car(){
		//초기화 됨
		// 무관함
	}
	public Car(String c, int s, int g) { // Car를 생성하면 자동차 댓수도 증가 해야 함.
		color = c; // 이름이 달라서 this 생략가능
		speed = s;
		gear = g;
		// 자동차의 개수를 증가, id번호 할당
		id = ++numberOfCars; // 상위에서 가져온 변수들. 선행 증가
	}
	// 정적메소드
	public static int getNumberOfCars() { // ★★★ static 변수만 받는다.
		//id = ++numberOfCars; // 여기에서는 에러
		return numberOfCars;
	}
	
	/**
	public void Carprint() {
		System.out.print("2.속도는 "+speed+"기어는 "+gear+"색상은 "+color);
	}
	public String toString() {
		return "현재 자동차의 속도는 = "+speed+"\n현재 자동차의 기어는 = "+gear+"\n현재 자동차의 색깔은 = "+color+"색";
	} */
}


public class CarTest3 {
	public static void main(String[] args) {
		Car car1 = new Car("파란색",100,1);
		Car car2 = new Car("흰색",0,1);
		int n = Car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = "+n); // toString이 없으면, car의 주소만 나온다.
	}
}
