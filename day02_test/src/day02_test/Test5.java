package day02_test;

public class Test5 {
	public static void main(String[] args) {
		double x = 1.2340;
		double y = 10.3459;
		System.out.printf("전체 7자리로 맞추고 소수 4자리까지 출력 \n");
		System.out.printf("x = %7.4f \n",x); // 가수와 지수 분리표현.
		System.out.printf("y = %7.4f \n",y);
		System.out.printf("\n");
		System.out.printf("소수 2자리까지 출력(반올림) \n");
		System.out.printf("x = %.2f %n",x);
		System.out.printf("y = %.2f %n",y); // \n과 %n의 차이가 없는듯.
		
		
	}
}

