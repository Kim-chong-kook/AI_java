package day03;

public class Test1_single {

	public static void main(String[] args) {
		int num=5;
		int result = ++num; // num = num+1 // 선증가 후 대입
		System.out.println(result);
		System.out.println(num);
		
		int num1=5;
		int result1 = num1++; // 선대입 후 증가
		System.out.println(result1);
		System.out.println(num1);
		
		int num2=5;
		int result2 = --num2; // num = num+1 // 선증가 후 대입
		System.out.printf("선감소 후 대입 ", result2);
		System.out.println(num2);
		
		int num3=5;
		int result3 = num3--; // 선대입 후 증가
		System.out.printf("선대입 후 감소 ", result3);
		System.out.println(num3);
	}

}
