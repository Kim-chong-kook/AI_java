package kr.co.tj1;

class Vehicle{
		
}
class Car extends Vehicle{
	public boolean compare(Vehicle V) {
		boolean isSame=false;
		
		if (V instanceof Car) {
			isSame = true;
		}
		
		return isSame;
	}
}
class Truck extends Vehicle{
	public boolean compare(Truck T) {
		boolean isSame=false;
		
		if (T instanceof Truck) {
			isSame = true;
		}
		
		return isSame;
	}	
}
class Bus extends Vehicle{
	
}

public class CarCastTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Truck truck = new Truck();
		
		System.out.println(car1.compare(car2));
		System.out.println(car1.compare(truck));

		System.out.println(truck.compare(car1)); // 부모 자식만 비교된다. 형제간 비교는 에러. Truck타입 파라미터가 아니므로 에러.
	}

}