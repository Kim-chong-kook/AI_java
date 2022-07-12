package day03;

public class LogicalTest {

	public static void main(String[] args) {
		int num1 =10;
		int num2 = 20;
		
		boolean flag =(num1>0) && (num2>0); // &는 bit로 기계어, &&는 사람의 논리곱 판단.
		System.out.println(flag);
		
		flag = (num1<0) && (num2>0);
		System.out.println(flag);
		
		flag = (num1 > 0) || (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		flag = !(num1 > 0); // true의 not은 false.
		System.out.println(flag);

	}

}
