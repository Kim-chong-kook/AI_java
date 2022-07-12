package kr.co.tj_1;

import java.util.Scanner;

public class Testing1 {

	public static void main(String[] args) {
		int cnt=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("10이하의 정수를 입력");
		cnt = scan.nextInt();
		for(int i=1;i<=cnt;i++) {
			System.out.println("Java언어 프로그래밍");
		}
	}

}
