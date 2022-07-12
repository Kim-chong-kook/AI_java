package day03;

public class RealtionalTest { // 관계형 연산자. 관계가 어떤가를 한번만 판단.
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		
		boolean value = (num1>num2);
		System.out.println(value);
		
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2); // (5는 3이다) => false.
		System.out.println(num1 != num2); // (5는 3이 아니다) => true.

	}
}
