package kr.co.tj;

import java.util.Scanner;

public class Testing11 {

	public static void main(String[] args) {
		int score =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		score = scan.nextInt();
		if(score >= 80) {
			System.out.printf("축하합니다. 합격입니다.\n");
		
		}
		else {
			System.out.println("죄송합니다. 불합격입니다.\n");
		}
		
	}

}
