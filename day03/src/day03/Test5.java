package day03;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 먼저작성 후, import 한다.
		System.out.println("주문하세요y/n");
		char ju = scan.next().charAt(0); // 한글자 문자 입력
		String str = (ju=='y'||ju=='Y')?"주문선택":"주문취소"; // 삼항연산 ?:; ? 콜론의 앞뒤에 실행할 것을 넣는다.
		System.out.println(str);
		
		System.out.println("문자입력");
		String str1 = scan.next(); // 단어, 연속된 문자열
		System.out.println(str1);
		String str2 = scan.nextLine(); // 한문장.
		System.out.println(str2);
		
		byte a = -128; // 서로 반대의 최대치가 된다.
		a -= 1;
		System.out.println(a);
		byte b = 127; // 서로 반대의 최대치가 된다.
		b += 1;
		System.out.println(b);
	}

}
