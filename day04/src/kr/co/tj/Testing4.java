package kr.co.tj;

import java.util.Scanner;

public class Testing4 {
	public static void main(String[] args) {
		int a=0, b=0, c=0;
		
		boolean result1=false,result2=false,result3=false,result4=false;
		Scanner scan = new Scanner(System.in);
		System.out.println("3개의 수를 넣으세요"); // 10 20 20
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		result1 = (a==b);
		result2 = (b==c);
		result3 = (a!=b);
		result4 = (b!=c);
		System.out.print(result1+":"+result2+":"+result3+":"+result4);
	}
}
