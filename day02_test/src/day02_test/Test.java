package day02_test;

public class Test {
	public static void main(String[] args) {
		System.out.printf("연습출력=%d %n",10);
		int a = 0; char b = 'n'; //''은 공백아니어서 에러, 초기화 : 'n'이 옳다
		//int a = 10; char b = 'A';
		a = 10;
		b = 'A';
		System.out.printf("a = %d \n", a); // \n, %n
		System.out.printf("b = %c", b); // %c, %s
	}
}
