package day02_test;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		float x = 0.0f; double y = 0.0;             // float와 double로 따로 선언
		System.out.println("두 개의 실수를 입력하세요.");
		x = sc.nextFloat();
		y = sc.nextDouble();
		
		System.out.printf("x = %.2f \n",x);
		System.out.printf("y = %.2f \n",y);
		sc.close();
		
		
	}
}
