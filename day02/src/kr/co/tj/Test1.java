package kr.co.tj;

public class Test1 {
	public static void main(String[] args) {
		float silsu1 = 2.0f; // 실수형 F, 2.0 / 기본형 double로 받으니 F 표현.
		float silsu2 = 1.1f; // 실수형 F, 1.1 / 기본형 double로 받으니 F 표현.
		float result = silsu1 - silsu2;
		System.out.println("계산결과=" + result);
		double silsu3 = 2.0;
		double silsu4 = 1.1;
		double result1 = silsu3-silsu4;
		System.out.println("계산한결과="+result1); // float와 달리 double은 정확에 가까운 근사치를 찾는다 [실수는 비교할 수 없다].
		double result2 = ((int)silsu3*10 -(int)silsu4*5); // 딱 떨어지게 하기위해 반올림 또는 *10의 방식을 쓴다.
		System.out.println(result2);
		
		
		
		
	}
}

