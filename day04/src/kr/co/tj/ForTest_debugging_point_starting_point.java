package kr.co.tj;

public class ForTest_debugging_point_starting_point { // 1~10 숫자 더하기. 디버깅 시작 point....

	public static void main(String[] args) {
		int count=1;
		int sum=0;
		
		for(int i=0;i<10;i++,count++) { // 10번 / 디버그는 break point 설정점이 시작부분
			// for문의 초기화 값은 외부나 외부에서 설정가능하다. 가독성은 표준형이 좋다.
			// 초기화--> [조건문-->실행문-->증감문]...반복
			sum += count;
			//count++; // 위에 쓰든지 한번 사용한다.
		}
		System.out.println("for문 결과 = " + sum);
		
		//============================================
		int num=1;
		int total = 0;
		
		while(num<=10) {
			total +=num;
			num++;
			
		}
		System.out.println("while문 결과 = " + total);
			
				
	}

}
