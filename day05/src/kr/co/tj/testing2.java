package kr.co.tj;

public class testing2 {

	public static void main(String[] args) {
		int sum=0;
		int num=1;
		while( num <=10 ) {
			sum +=num;
			num++;
		}
		System.out.print("1부터 10까지의 합 = " + sum);
		System.out.println();
		System.out.println("while문이 끝난 후의 num의 값 = " + num);
		
		System.out.printf("1부터 10까지의 합 = %d\n",sum);
		System.out.printf("while문이 끝난 후의 num의 값 = %d\n", num);
		//=====================================
		// for로
		int summ=0;
		num=1;
		for (int i=1;i<=10;i++) {
			summ +=i;
			num++;
		}
			System.out.printf("1부터 10까지의 합 = %d\n",summ);
			System.out.printf("while문이 끝난 후의 num의 값 = %d", num);
		// ★ i가 지역변수라 for 밖에서 사용불가능 하다.
	
	
	
	
	
	}
	

}
