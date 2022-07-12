package day02_test;

import java.util.Scanner; // input 입력절차가 좀 까다롭다.

public class Test6 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int age=0;
		System.out.print("당신의 나이는 몇살입니까?"); // 줄바꿈 해제.
		age = sc.nextInt();
		System.out.printf("당신의 나이는 %d살이군요. \n",age);
		
		sc.close(); // 입력받은 다음 종료를 해주어야 한다... 에이구 이거 귀찮네...한번받아 썼으면 되었지 뭘 또 닫냐? 
		
	}
}
