package kr.co.tj;

public class CastingTest {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; // (int)bNum; 컴파일러가 자동수행
		System.out.println(bNum);
		System.out.println(iNum);
		int iNum1 = 20;
		float fnum = iNum1; // 컴파일러의 묵시적 형변환.
		System.out.println(iNum1);
		System.out.println(fnum);
		
		double dNum = 3.14;
		int iNum2 = (int)dNum; // 실수->정수 : 강제적 명시적 형변환. 소수부분 소실됨.
		System.out.println(iNum2);
	}
}
