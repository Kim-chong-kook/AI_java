package kr.co.tj;

import java.math.BigInteger;

public class BinaryTest {
	public static void main(String[] args) {
		int num  = 10;
		int bNum = 0B1010;
		int oNum = 012;
		int xNum = 0XA;
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
		
		//byte b = 128; // 127까지만, 해결책은 범위맞게 넣는다.
		byte b1 = -128; // 1byte의 범위인 -128~127의 범위를 넘으면 에러상태. 
		long l1 = 1_000_000_000_000_000L; // 숫자는 기본 int로 21억 이내로 받으므로 에러(long 최대 1천조는 범위 오버이므로 l을 붙여준다.)
		//long l2 = 1_000000000000_000_000_000_000L; // l을 써줘도 천조를 넘어 오버에러.
		BigInteger l3 = new BigInteger("10000000000000000000000000000");
		//float f = 3.141592; // 4byte 유형이 맞지 않는다.
		float f1 = 3.141592F; // 4byte, F를 써준다.
		double d = 3.141592; // 실수기본형 : 8byte, 64bit
		// ■ ■ ■ 이러한 문제의 근본은 변수의 기본형이 존재해 pc가 그냥 기본형으로 받아들이기 때문에 굳이 memory를 절약하려면, 뒤에 l과 f를 써줘야 한다. 
		// 따라서, 메모리 절약위해 long, float를 쓰려면, L, F를 붙여준다.
		
		int num1  = 10; // 10진수
		int bNum1 = 0B1010; // 2진수 0을 진법변환하면 
		int oNum1 = 012; //  1   2  : 8진수
						//001 010  : 
						//222 222의 윗 지수 :  10진수로 돌림.
		int xNum1 = 0XA; // 16진수
		//short num2 = 32767; // 2byte, 64000의 절반
		//short num3 = num2 +1 // 범위 오버로 에러
		// System.out.println(num2 +1); // ■ 에러나기전에 바로 찍으면 자동 casting 형변환
		//System.out.println(result);
		
		Integer num2 = new Integer(0);
		// short num11 = num2.MAX_VALUE; // int의 최대값을 short에 넣을 수 없다.
		int result = num2.MAX_VALUE; // 그렇다면, int로 변경해준다.
		System.out.println(result); // int의 최대값 21억을 찍는다.
		result = result+1; // 21억 한도의 1초과 : 4byte, 32bit. 
		// 21억 +1은 부호가 바뀐다. 01111111 + 1 = 1000000로 음수의 최대값이 출력된다.
		System.out.println(result); // 숫자의 범위를 넘어섰기에 처음부터 시작하는 숫자는 (-)값.[ 돌고 돈다 ]
	
	}

}
