package kr.co.tj;

import java.util.Scanner;

public class Testing12 {

	public static void main(String[] args) {
		int score =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수입력:");
		score = scan.nextInt();
		if(score>=90) {
			System.out.println("수");
			
		}else if(score>=80) {
			System.out.println("우");
			
		}else if(score>=70) {
			System.out.println("미");
		}else if(score>=60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
	}

}
