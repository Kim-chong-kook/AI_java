package kr.co.tj2;
// 예외처리
public class ExceptionTest_예외처리 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); ////// run config에 args 인자값, 0입력.
		int result = 10/num; ////////////////////// 실행시 에러난다.
		System.out.println("result"+result);

	}

}
