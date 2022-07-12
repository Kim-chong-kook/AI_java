package kr.co.tj;

import java.util.Scanner;

public class Testing13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a =0,b=0;
		System.out.println("두 수를 입력하세요.:");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a>=4 && b>=4) {
			System.out.println("이겼습니다.");
		}else if(a>=4 || b>=4) {
			System.out.println("비겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
		
		
	}

}
