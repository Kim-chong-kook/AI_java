package kr.co.tj;

import java.util.Scanner;

public class Testing17_GoodSample { // 삼항연산자로 if문을 대체함.

	public static void main(String[] args) {
		int a=0, b=0;
		int max=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력");
		a = scan.nextInt();
		b = scan.nextInt();
		
		max = (a>b)?a:b;
		System.out.printf("%d\n",max);
			
		
		
	}

}
