package kr.co.tj;

class Car extends Object { // 부모자식간에도 상속관계를 상호 주고받는다. => 형변환
	private String model;
	public Car(String model) {
		this.model= model;	// private된 변수호출 this.
	}
	
	// 아래 오버라이드의 목적 : 생성된 객체들의 스택 메모리 주소가 다르므로 
	@Override // 소스/오버라이드/Implement Methods
	public boolean equals(Object obj) { // second car를 업캐스팅 : equals 메소드 재정의 (슈퍼 Object 속의 것도아니고 문자열 비교도 아닌 재정의)
		if(obj instanceof Car) {  // 상속관계의 부모냐 묻는 문장.
			Car car = (Car)obj;   // 업캐스팅된 obj(second car)를 자식으로 다운캐스팅
			return model.equals(car.model); // model=first car, car.model=second car
			// ★★ 모델의 주소를 비교한다.
		}else {
		
		return false;
		}
	}
	
	/**
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			return model.equals( ( (Car) obj).model);
		}else {
			return false;
		}
	}*/
}
public class CarTest_Override_상속 { 
	
	// 회사 조상 Object equals는 스택의 주소만 비교하여 다른것으로 인식
	// 필요한 일은 문자 자료가 같은지 비교하는 일이므로 equals를 재정의(Override)필요
	public static void main(String[] args) {

		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		if (firstCar.equals(secondCar)) { // equals 메소드 재정의 (슈퍼 Object 속의 것도아니고 문자열 비교도 아닌 재정의)
			// return model.equals(car.model); 로 Override 재정의 된상태
			System.out.println("동일한 종류의 자동차입니다.");
		} else {
			// 기본 Object의 equals는 스택 주소를 비교한 결과.
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
	}
}

