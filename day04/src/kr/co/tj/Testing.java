package kr.co.tj;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		int a =0; int b=0; int c=0; int d=0; int e=0;
		a = 10; b = 5; c=7; d=9; e=10;
		int i= 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("5개의 수를 입력하시오.");	
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		e = scan.nextInt();
		
		a = a + 3;
		b = b - 3;
		c = c * 3;
		d = d / 3;
		e = e % 3;
		
		System.out.printf("%d %d %d %d %d",a, b, c, d, e);
		System.out.println();
				
		a += 3;
		b -= 3;
		c *= 3;
		d /= 3;
		e %= 3;
		
		System.out.print(a);
		System.out.print(" " + b);
		System.out.print(" " + c);
		System.out.print(" " + d);
		System.out.print(" " + e);

	}

}
