package day02_test;
//import java.util.Scanner;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner sc  = new Scanner(System.in);
		System.out.print("두수를 입력하시요.");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("%d + %d = %d \n",a,b,a+b);
		System.out.printf("%d * %d = %d \n",a,b,a*b);
		sc.close();
	}
}
