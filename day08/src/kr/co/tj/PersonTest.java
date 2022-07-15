package kr.co.tj;

class Person {
	String name;
	int age;
	
	public Person() {
		this("이름없음",1); // 기본 생성자에서 아래의 다른 생성자를 호출함.
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person getPerson() { // Person이라는 class객체(인스턴스)화 하는 메소드/함수 정의.
		return this; // 자신의 주소값을 리턴함.
	}
}

// 클라이언트 진입점.
public class PersonTest{
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "James";
		p.age = 37;
		
		Person p2 = p.getPerson(); // new가 아닌 자신의 정보를 가져오는 함수호출.
		
		System.out.println(p); // toString 생략됨 
		System.out.println(p2);

	}

}
