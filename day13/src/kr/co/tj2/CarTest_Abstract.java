package kr.co.tj2;

abstract class Car{ // 동일 파일이므로 public 뺌. // 추상 클래스
	public abstract void drive(); // 추상 메소드 처리 ();
	public abstract void stop(); // 추상 메소드 처리 ();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
			
	final public void run() { // final은 상속, 재정의 되지 않는다.
		startCar();
		drive();
		stop();
		turnOff();
	}

}

class ManualCar extends Car{ // 동일 파일이므로 public 뺌.

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 정지 합니다.");
		
	}
	
}

class AICar extends Car{ // 동일 파일이므로 public 뺌.

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
		
	}
	
}

//==============================================================
public class CarTest_Abstract {

	public static void main(String[] args) {
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("==============================");
		Car manualCar = new ManualCar();
		manualCar.run();

	}

}
