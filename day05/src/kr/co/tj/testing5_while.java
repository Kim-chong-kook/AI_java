package kr.co.tj;

import java.util.Scanner;

public class testing5_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int su=0,sum=0,cnt=0,avg=0;
		System.out.println("숫자입력:");
		while(true) {
			su = scan.nextInt();
			if(su==0) break;
			if(su%2==0) continue; //홀짝구분. 짝수는 계산하지 않고 다시 올라감.
			sum+=su;
			cnt++;
		}
		avg = sum/cnt;
		System.out.printf("홀수의 합=%d\n",sum);
		System.out.printf("홀수의 평균=%d\n",avg);
	}

}
