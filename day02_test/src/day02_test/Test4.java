package day02_test;

public class Test4 {
	public static void main(String[] args) {
		double a = 5*2*3.14000;
		double b = 5*5*3.14000;
		System.out.printf("원주 = 5*2*3.140000 = %f %n",a);
		System.out.printf("원주 = 5*5*3.140000 = %f %n",b);
		
		// 표준진행.
		int r =5;
		double pi = 3.14;
		System.out.printf("원주 = %d * 2 * %f = %f \n", r,pi,r*2*pi);
		System.out.printf("넓이 = %d * %d * %f = %f \n", r,r,pi,r*r*pi);
	}
}
