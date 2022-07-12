package kr.co.tj;

public class WhileTest_Debugging_Mode {

	public static void main(String[] args) {
		int num = 1; // 0으로 초기화 하면, 아래의 후증가문을 위로 1줄 올려야 한다.
		int sum = 0;
		
		while(num <=10 ) {
			sum += num;  // sum = sum + num // 변수를 누적
			num++; // num = num +1, 후증가를 뒤에서 수행하게 했다. 뭔가 어색함.
		}
		System.out.println("1부터 10까지의 합=" + sum);
		System.out.println(num);
		
// debug configuration 실행하면, 양쪽에 디버그창이 열린다. 
// >>> 우측에 변수가 변하는 상황. F6는 진행, F5,F7은 함수로 들어가기 나오기 키
	}

}
