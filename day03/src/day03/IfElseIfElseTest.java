package day03;

import java.util.Scanner;

public class IfElseIfElseTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
	   	int charge=0;
	   	
	   	if(age < 8){ // 좌측이 작은 변수, 우측이 큰 수.
	   		charge = 1000; 
	   		System.out.println("미 취학 아동입니다.");
	   	}
	   	else if(age < 14){
	   		charge = 2000;
	   		System.out.println("초등학생 입니다.");
	   	}

	}
}
