package day02_test;

import java.lang.*; // 자바가 기본적으로 수행
import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int height=0;
		double weight=0.0;
		char name = 'n'; //문자 초기화 방식
		
		System.out.print("키를 입력하세요");
		height = sc.nextInt();
		System.out.print("몸무게를 입력하세요");
		weight = sc.nextDouble();
		System.out.print("이름을 입력하세요");
		name = sc.next().charAt(0);     // 한개 문자[charAt(0) or 문자열[next()]
				
		System.out.printf("키 = %d \n",height);
		System.out.printf("몸무게 = %.1f \n",weight);
		System.out.printf("이름 = %c \n",name); // %c, %s
		
		sc.close();
	}
}
