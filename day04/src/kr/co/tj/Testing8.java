package kr.co.tj;

import java.util.Scanner;

public class Testing8 {

	public static void main(String[] args) {
		int a = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력:");
		a = scan.nextInt();
		System.out.printf("%d/4 = %d\n",a,a/4);
		System.out.printf("%d/4.0 = %.2f\n",a,a/4.0); // printf는 포맷용
	}

}
