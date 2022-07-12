package kr.co.tj;

import java.util.Scanner;

public class Testing14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=0,b=0,c=0,max=0;
		System.out.println("세가지 수를 입력하세요.");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		// 크게 a,b비교 / 세부적으로 a,c/b,c비교
		if(a>b) { // a가 클때 사용, b가 크면 else이하로 간다. c가 크면 할당.
		
			if(a>c) { // a가 클때 할당
				max = a;
			} 
			else { // c가 클때 할당
				max = c;
			}
		}else { //b가 클때 사용
			if (b>c) {
				max =b;
			}
			else {
				max=c;
			}
		}
		System.out.printf("입력받은 수중 가장 큰 수는 %d 입니다.\n",max);
		
	}

}
