package day02_test;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=0;
		double b=0.0; 
		double plus=0,minus=0,div=0.0,rest=0.0,cross=0.0;
		//int rest=0;
		System.out.println("두개의 수를 입력하시오.");
		a = scan.nextInt();
		b = scan.nextDouble();
		
		plus = a + b;
		minus = a - b;
		cross = a * b;
		div = a / b;
		rest = a % b;
		System.out.printf("%d + %f = %f \n",a,b,plus);
		System.out.printf("%d + %f = %f \n",a,b,minus);
		System.out.printf("%d * %.1f = %.2f \n",a,b,cross);
		System.out.printf("%d / %.1f = %.2f \n",a,b,div);
		System.out.printf("%d %% %.1f = %.2f \n",a,b,rest); // %는 두번표기가 한번출력.
		// ++, -- : 단항연산자
		// +=, -=, *=, /=, %= : 복합대입연산자
		// <= : 이항연산자
		// ?; 삼항연산자
		
		scan.close();
	}

}
