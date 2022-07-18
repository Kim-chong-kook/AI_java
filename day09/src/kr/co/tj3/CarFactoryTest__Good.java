package kr.co.tj3;

class Car{
	private static int serialNum = 10000;
	private int carNum;
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	public int getCarNum() { //인리 int--return ////////////////////////////////
		return carNum;
	}
	public void setCarNum(int carNum) { //보디 void--this //////////////////////
		this.carNum = carNum; /// 카번호는 임의로 주면 안되므로 없애야 한다.
	}
}
class CarFactory{ // 공장은 무조건 1개 = 회사명과 같은 싱글패턴
	private static CarFactory instance = new CarFactory(); 
	private CarFactory() {
	}
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}

//=============================================
public class CarFactoryTest__Good {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance(); // 회사 객체를 만들지 않고 함수를 불렀음.
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum()); // 같은 주소값
		System.out.println(yourSonata.getCarNum()); // 같은 주소값

	}

}
