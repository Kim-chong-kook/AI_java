package kr.co.tj1;

//코드 이동키 : 블럭잡고 alt+ "+"

class Member{
	private String name;
	private int age;
	// 슈퍼와 멤버는 상위에 위치 시킨다.
	public Member() {
		super(); // this.처럼 첫줄에 코딩해야 한다.
	}
	public Member(String name, int age) { // 필드: 멤버변수에 값 지정
		super();
		this.name = name;
		this.age = age;
	}
	// 우클릭/ Source에서 지정.
	//====get 가져감 / set 변수에 저장 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//=========Dto:데이터 전송 = vo 객체 처리=======================
	//=========Dao:데이터 엑세스 Obj===============================
	//=========자바는 Mvc model I,II : 입+출력/처리를 분리 (비빔밥 아닌 한정식, 리팩토링) : 
	//=========유지보수의 편의성 높인다 : 핵심은 객체(class)
	//=========입,출력을 빠르게 처리하고, 자원을 처리에 집중하게 한다.
	//====반면,,, C언어는 입,출,처리가 뒤섞여 있다. 유지보수 어렵다.
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}

//====클라이언트================================
public class MemberTest____Good {
	// 위에서 엔캡슐화로 인해 메소드로 처리함.
	public static void main(String[] args) { // 
		Member member1 = new Member();
		
		// set 깔끔
		member1.setName("이순신");
		member1.setAge(50);
		member1.toString(); // 문구 처리용 메소드
		System.out.println(member1.toString()); // 아래와 같은 수행목적을 인식한다.
		System.out.println(member1); // 위와 같은 결과치.
		
		// get 깔끔
		System.out.println("나이:"+member1.getAge());
		System.out.println("이름:"+member1.getName());
	}
}
