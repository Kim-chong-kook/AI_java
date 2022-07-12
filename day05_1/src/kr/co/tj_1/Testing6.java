package kr.co.tj_1;

import java.util.Scanner;

public class Testing6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력:");
		int sum=0,score=0; double avg=0.0;
		for(int i=1;i<=5;i++) {
			
			score = scan.nextInt();
		sum+=score;
		}
		avg =(double)sum/5;
		System.out.printf("총점:%d\n",sum);
		System.out.printf("평균:%.1f\n",avg);
	}

}
