package kr.co.tj_1;

import java.util.Scanner;

public class Testing5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10개의 정수를 입력:");
		int num=0,cnt=0;
		for(int i=1;i<=10;i++) {
			num = scan.nextInt();
			if(num%2==0) {
				cnt++;
			}
			
		}
		System.out.printf("입력 받은 짝수는 %d 개입니다.",cnt);
	}
}
