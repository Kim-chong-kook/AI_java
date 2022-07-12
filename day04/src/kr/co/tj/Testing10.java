package kr.co.tj;

import java.util.Scanner;

public class Testing10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0,b=0,c=0; //a와 b를 switching, c는 임시의 물동이
		System.out.println("수를 입력:");
		a=scan.nextInt();
		System.out.println("수를 입력:");
		b=scan.nextInt();
		if (a<b) { // a가 크다면 pass // b가 크다면 switching 
			c = b; // 물동이 이전 // c는 임시물동이, 반시계방향 회전/시계방향 회전.
			b = a;
			a = c;
		}
		System.out.printf("입력받은 수중 큰수는 %d이고\n",a);
		System.out.printf("작은 수는 %d입니다.\n",b);
		
	}

}
