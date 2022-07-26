package kr.co.tj2;

public class Exception3 {

	public static void main(String[] args) {
		
		// 처음엔 논리줄들 블럭잡고 surround with
		// 다음부턴 catch (각기 자동입력)
		// <<논리적인 에러>>
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result="+result);
		}catch (ArrayIndexOutOfBoundsException e1) { // 배열입력 길이 부족/넘칠때
//			e1.printStackTrace();
			System.out.println("배열방 인자를 하나 넣어주세요.");
		}catch (NumberFormatException e2) { // 숫자가 아닌 입력 에러
//			e2.printStackTrace();
			System.out.println("숫자를 넣어주세요.");
		}catch(ArithmeticException e3) { // 0으로 나눈 에러
//			e3.printStackTrace();
			System.out.println("정수를 0으로 나누면 안돼요.");
		}
		System.out.println("프로그램은 계속 실행...");

	}

}
