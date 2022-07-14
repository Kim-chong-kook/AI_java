package kr.co.tj1;

//문제1===========
class Person{
	
	public String name;
	public int age;
	public int height;
	public int weight;
	public String gender;
	
	public Person() {}


	public Person(String name, int age, int height,int weight,String gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	public void showPersonInfo() {
		//return "고객님의 이름은"+name+ "이고, 나이는"+age+ "입니다."+"키는"+height+"이고 몸무게는"+weight+"입니다.";
		System.out.println("키"+height+"몸무게"+weight);
		System.out.println("고객님의 이름은"+name+ "이고, 나이는"+age+ "입니다."+"키는"+height+"이고 몸무게는"+weight+"입니다.");
	}
}


public class 객체구현1 {
	public static void main(String args[]) {
		Person Tomas = new Person("Tomas",37,180,78,"남"); // 세부 오버라이딩으로 입력됨.
		//System.out.println(Tomas.showPersonInfo()); // return 방식 출력
		Tomas.showPersonInfo(); // void방식 출력
	}
}


