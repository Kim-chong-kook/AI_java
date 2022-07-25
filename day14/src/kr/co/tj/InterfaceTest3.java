package kr.co.tj;

interface SerialCommunication{
	void send(byte[] data);
	byte[] reseive();
}

class Television2 extends Object implements RemoteControl, SerialCommunication{
	
	// ★★★RemoteControl은 Test1에서 불러오게 된다. 
	// Remote와 Serial 양쪽에 동일한 method가 있으면 안된다.
	
	// 4개가 오버라이드 되었다.
	// ★★★★★★ 중요한 점은 중복된 메소드가 있더라도 한개만 인식한다. 따라서 다중상속이 가능하다.
	
	@Override
	public void send(byte[] data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public byte[] reseive() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		

	}

}
