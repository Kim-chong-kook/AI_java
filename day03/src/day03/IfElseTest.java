package day03;

import java.util.Scanner; // ◆ ◆ ◆ ctrl + shift + o로 설치

public class IfElseTest {

	public static void main(String[] args) {
		int age = 7;
		System.out.println("나이를 넣으세요");
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		
		if(age>=8) {
			System.out.println("학교에 다닐 나이네요.");
		}
		else {
			System.out.println("미취학 아동입니다.");
		}
		if( age >= 8) {
			System.out.println("학교에 다닙니다");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		/*if else와 삼항연산자는 같다.*/
		String str =null; // null 값으로 초기화.
		str = (age>=8)?"삼항:학교에 다닙니다.":"삼항:학교에 다니지 않습니다."; //삼항연산
		System.out.println(str);
		
		scanner.close();
	}

}
