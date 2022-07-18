package kr.co.tj2;

public class RnadomTest {
	public static void main(String[] args) {
		/**
		double d = Math.random() * 6; // 1이하의 실수가 ==> 6이하에서 제어된다.
		System.out.println(d);
		*/
		int i = (int)(Math.random() * 6) +1; // 0~5값을 +1 해서 1~6의 주사위로 만든다.
		System.out.println(i);
		
		
		
	}
}
