package kr.co.tj;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input; 
		int sum = 0;
		do {
			System.out.println("더할 값을 넣으세요. 0을 넣으면 끝납니다.");
			input = scanner.nextInt();
			sum += input;
			
		}while(input != 0); // 0이 아니면, 더한다. 0이 입력되면 합계를 낸다.

			
		System.out.println(sum);


	}

}
