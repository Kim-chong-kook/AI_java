package kr.co.tj;

import java.util.Scanner;

public class Testing16_1 {

	public static void main(String[] args) {
		int score =0; int result=0;
		
		String result1="";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수입력");
		score = scan.nextInt();
		result = score/10;
				
		
		switch(result) {
		case 10: case 9: // 점수를 정수로 만들어 case에 넣는다.
			result1 = "수";
			break;
		case 8:
			result1 = "우";
			break;
		case 7:
			result1 = "미";
			break;
		case 6:
			result1 = "양";
			break;
		default:
			result1 = "가";
		}
		System.out.println(result1); // 반복을 줄이고 변수재활용.

	}

}
