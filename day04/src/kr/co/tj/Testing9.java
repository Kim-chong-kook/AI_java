package kr.co.tj;

import java.util.Scanner;

public class Testing9 {

	public static void main(String[] args) {
		int a = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("한개의 수를 입력");
		a = scan.nextInt();
		System.out.printf("%d\n", a);
		if (a>10) {
		System.out.println("10보다 큰수 입력하셨습니다.");
		}
		
	}

}
