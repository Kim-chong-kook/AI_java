package day03;

public class BitTest { // ◆ ◆ ◆ 대충생략하고 넘어갔다. 논리합과 곱은 중요한디....

	public static void main(String[] args) {
		int num1 = 5;  	// 00000101 2비트로
		int num2 = 10; 	// 00001010 2비트로
				
		System.out.println(num1 | num2); // 비트 논리합
		System.out.println(num1 & num2); // 비트 논리곱 : 모두 만족하는 것.
		System.out.println(num1 ^ num2); // XOR : 두수의 자리수가 다른 경우 1로 변환.
		System.out.println(~num1); // NOT, ~틸드, 보수값 상태(절대값은 다름) +1 = 절대값 동일
		// 보수의 개념에서. +0/-0이 있다면 순서가 짝을 이루는데, -0을 없애니까? -쪽 값들이 한칸 상승한다.
		// 그래서 +의 ~틸드값은 -가 하나 더 큰수다. 절대값이 같으려면, ~틸드후에 +1을 해줘야 한다.
		// 2진수 도표참조.
		System.out.println(num1 << 2); 
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		System.out.println(num1);

	}

}
