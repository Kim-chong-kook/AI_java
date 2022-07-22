package kr.co.tj2;

class Define { // 동일파일이므로 public 뺌

	public static final int MIN = 1; // final은 문자열 상수로 취급되며, 대문자로 기록함.
	public static final int MAX = 999999;
	public static final double PI = 3.14;
	public static final String GREETING = "Good Morning!";
	public static final int MATH_CODE = 1001;
	public static final int CHEMISTRY_CODE = 1002;
}



//==================================================
public class UsingDefine {

	public static void main(String[] args) {

		System.out.println(Define.GREETING);
		System.out.println(Define.MIN);
		System.out.println(Define.MAX);
		System.out.println(Define.MATH_CODE);
		System.out.println(Define.CHEMISTRY_CODE);
		System.out.println("원주률은" + Define.PI + "입니다.");
	}
}

