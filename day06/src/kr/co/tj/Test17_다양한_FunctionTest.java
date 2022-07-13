package kr.co.tj;

public class Test17_다양한_FunctionTest { 
	
	public static int addNum(int num1,int num2) { //-- @선언부
		int result=0; // 초기화.                   //--@구현부
		result = num1 + num2;
		return result;
	}
	
	public static void test() { // 단순한 함수구현@@@@@@@@@@
		System.out.println("함수를 수행했다."); // 리턴이 없는 함수 void
	}
	
	
	public static void sayHello(String greeting) { // 매개변수 1개 선언.
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum=0;
		int i;
		for(i=0;i<=100;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) { //--리턴없는 출력 문 //

		test(); // 위의 함수들 중에서 static이 붙은 것은 바로 call이 된다.
		calcSum();
		int result = addNum(2,5);
		System.out.println("아규먼트를 주고 " + result);
		
		//----------------------
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1,n2);
		System.out.println("변수를 선언해주고 " + total);
		
		sayHello("안녕하세요? 1~100까지 합계를 구해볼까요?");

		int num = calcSum();
		total = calcSum(); // 변수 재활용.
		
		System.out.println(num);
		System.out.println(total);
		
		// 변수명 : 小문자 시작의 명사.
		// 메서드명 : 동사+명사+명사
		// 메서드명 : 小문자 시작의 액션(동사)+명사(大시작)+명사(大시작).

		
	}
}
