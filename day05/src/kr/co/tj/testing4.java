package kr.co.tj;

import java.util.Scanner;

public class testing4 {

	public static void main(String[] args) {
		int su=0, sum = 0,cnt=0;
		double avg = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");

		while(true) {
			su = scan.nextInt();
			if(su==0) break;
			sum += su;
			cnt++;
			
		}
		avg =(double)sum/cnt;
		System.out.printf("입력된 자료의 개수=%d \n",cnt);
		System.out.printf("입력된 자료의 개수=%d \n",sum);
		System.out.printf("입력된 자료의 개수=%.2f \n",avg);
		
		
		
		
	}

}
