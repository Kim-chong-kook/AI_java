package kr.co.tj;

import java.util.Scanner;

public class Testing2 {

	public static void main(String[] args) {
		int a=0; int b=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자2개 입력:");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.printf("최초값 a=%d, b=%d\n",a,b);
		System.out.printf("a++=%d, ++b=%d\n", a++,++b);
		System.out.printf("실행후 a=%d,b=%d\n",a,b);
		
		System.out.printf("a--=%d, --b=%d\n", a--,--b);
		System.out.printf("실행후 a=%d,b=%d\n",a,b);
	}

}
