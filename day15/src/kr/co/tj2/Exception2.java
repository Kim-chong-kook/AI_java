package kr.co.tj2;

//예외처리는 IO / DB 처리에 공히 사용됨

public class Exception2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		try {
			int result = 10/num;
			System.out.println("result="+result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 개발자가 에러 인식위함.
			System.out.println("정수를 0으로 나누면 안돼요."); // 사용자용 완성된 프로그램.
		}
		System.out.println("프로그램 계속 실행됨"); // 프로그램이 다운되지 않고 주석문을 뿌려준다.
		

		
	}

}
