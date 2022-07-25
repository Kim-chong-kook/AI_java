package kr.co.tj1;

// 인터페이스도 다른 인터페이스를 상속받을 수 있다.
interface RemoteControl{
	void turnOn();
	void trunOff();
	
}
interface AdvancedRemoteControl extends RemoteControl{
	void volumeUp();
	void volumeDown();
}

public class InterfaceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
