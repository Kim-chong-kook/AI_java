package kr.co.tj_1;

import java.util.Scanner;

public class Testing4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0, sum=0;
		System.out.println("더할 최대의 자연수를 입력하세요.");
		num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			sum += i;
			
		}
		System.out.println(sum);
		
	}

}
