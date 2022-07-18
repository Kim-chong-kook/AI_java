package kr.co.tj2;

class DeskLamp{
	private boolean isOn; // 켜짐이나 꺼짐과 같은 램프의 상태
	public DeskLamp() {
		
	}
	public void turnOn() { // 켠다.
		isOn = true;
	}
	public void turnOff() { //끈다.
		isOn = false;
	}
	public  String print() {
		String result = null;
		if(isOn==true) {
			result = "켜짐";
		}else {
			result = "꺼짐";
		}
		return result;
	}
}


public class DeskLampTest {
	public static void main(String[] args) {
		DeskLamp myLamp = new DeskLamp();
		myLamp.turnOn();
		String result=myLamp.print();
		System.out.println("현재상태는="+result);
		myLamp.turnOff();
		result = myLamp.print();
		System.out.println("현재상태는="+result);
	}
}

