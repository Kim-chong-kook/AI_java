package kr.co.tj;

import java.util.Scanner;

public class Testing16 {

	public static void main(String[] args) {
		int score =0, result=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수입력");
		score = scan.nextInt();
		result = score/10;
				
		
		switch(result) {
		case 10: case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		
		default:
			System.out.println("가");
		}
	}

}
