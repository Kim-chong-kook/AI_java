package kr.co.tj;

public class TypeConversion {
	public static void main(String[] args) {
		
		double dNum =1.2;
		float fNum=0.9f;
		
		int iNum1 = (int)dNum + (int)fNum; // 강제적 형변환
		int iNum2 = (int)(dNum + fNum); // 강제적 형변환
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
	}
}
