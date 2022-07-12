package day03;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자의 범위를 줄때 &&, 숫자를 넣으세요.");
		System.out.println("나이입력1");
		int num=scan.nextInt();
		String str=(num>0 && num<10)?"10세미만":"10세미만이 아닙니다."; // 3항연산자 ? true실행: false실행;
		System.out.println(str);
		System.out.println("나이입력2");
		num = scan.nextInt();
		str=(num>10 && num<20)?"10대":"10대가 아닙니다.15";
		System.out.println(str);
	}

}