package kr.co.tj;

import java.util.Scanner;

public class Testing3 {

	public static void main(String[] args) {
		int a=0;int b=0; int c=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자2개입력:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = ++a + b--; // 그 자신이 선증가, 후감소한 값을 수행하였다.
		System.out.printf("a=%d,b=%d,c=%d",a,b,c);
	}

}
