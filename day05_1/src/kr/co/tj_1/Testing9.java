package kr.co.tj_1;

import java.util.Scanner;

public class Testing9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("줄수입력:");
		int i=0,j=0,n=0;
		n=scan.nextInt();
		
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=n-i;j++) {
				System.out.printf(" "); // i증가마다 4개에서 공백량 감소 찍기
			}
			for(j=1;j<=i;j++) {
				System.out.printf("*"); // i 증가마다 1개에서 *표 증가 찍기
			}
			System.out.printf("\n"); // 줄바꿈.
		}
	}

}
