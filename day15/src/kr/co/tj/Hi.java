package kr.co.tj;

// 의존 낮추기 == > 인터페이스 사용 => 몸체의 Override만 추가 => 메서드명 등 수정없음.

interface MessageBean{
	void call(String name); // 추상메서드
}
class MessageBeankr implements MessageBean{ // 추상클래스 몸체 구현.

	@Override
	public void call(String name) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요,"+name+"씨!");
	}
	
}
class MessageBeanEn implements MessageBean{ // ★★★ 수정 추가부분1 : 몸체만 추가해주고 메소드 명칭은 변경하지 않았다.

	@Override
	public void call(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello "+name+"!");
	}
	
}
public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageBean bean = new MessageBeankr(); // 업캐스팅
		bean.call("윤종혁");
		
		bean = new MessageBeanEn(); // ★★★ 수정 교체부분1
		bean.call("Yoon"); // ★★★ call하는 영향력이 낮아졌다.
	}

}
