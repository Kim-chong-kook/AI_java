package kr.co.tj;

public class ConstantTest {
	public static void main(String[] args) {
		final int MAX_NUM = 100; // 상수는 all 대문자로 표현,
		final int MIN_NUM; // 클래스, 메소드에도 final이 붙는다.
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM); // 대문자 = 상수, 의미있는 명칭
		System.out.println(MIN_NUM); // 대문자 = 상수, 의미있는 명칭
		
		//MAX_NUM = 1000;
		
		final double PI = 3.14; // ■ ■ ■ 상수는 대문자로만 명명
		//PI = 5.55; // final 상수처리되어 변경불가. 리터럴 = 실제값
		double result = PI*3*5;
		System.out.println(result);
		// 변수란 선언한 (원하는) 부분만 유지보수가 편하게 하도록 하는 변하는 수.
		// 상수란 변하지 못하게 하는 수.
		
	}
}
