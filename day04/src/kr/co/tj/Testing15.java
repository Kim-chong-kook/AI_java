package kr.co.tj;

import java.util.Scanner;

public class Testing15 { // 정수나 딱떨어지는 범주는 switch 사용. 

	public static void main(String[] args) {
		// switch case 사용
		int num =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("1.삽입 2.수정 3.삭제. 숫자를 선택하세요.");
		num = scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("삽입을 선택함.");
			break;
		case 2:
			System.out.println("수정을 선택함.");
			break;
		case 3:
			System.out.println("삭제를 선택함.");
			break;
		default:
			System.out.println("숫자를 잘못 넣었습니다.");
		}
	}

}
