package day03;

import java.util.Scanner;

public class ConditionTest {
	public static void main(String[] args) {
		int max;
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n ");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력1:");
		int x = scanner.nextInt();
		System.out.println("입력2:");
		int y = scanner.nextInt();
		
		//max = (x > y)? x : y;
		max = (x>y)?x:y; // 삼항연산자 : 조건?true실행:false실행;
		System.out.println(max);
		
		scanner.close();

	}
}
