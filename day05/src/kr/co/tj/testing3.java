package kr.co.tj;

import java.util.Scanner;

public class testing3 {

	public static void main(String[] args) {
		int score = 0;
		boolean result = false;
		Scanner scan = new Scanner(System.in);
	
		
		while (score>=0 && score<=100) {
			System.out.println("점수를 입력하세요.");
			score = scan.nextInt();	// 하부에서 입력받음(if필요), 상부에서 입력받음(하부가 지저분) 
			
			if(score>100 || score<0){ 
				break;	
			}
			if (score >=80) {
				System.out.println("축하합니다. 합격입니다.");
			}else {
				System.out.println("죄송합니다. 불합격입니다.");
			}
		}
		System.out.println("0부터 100사이의 숫자가 아닙니다.");
		
	}

}
