package kr.co.tj;

public class DoubleTest2 {
	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i=0; i<10000000;i++) {
			dnum=dnum+0.1;
		}
		System.out.println(dnum); 
		// 지수와 가수로 나타내는 부동 소수점 방식에서는 지수부 가 0을 표현할 수 없기 때문에 약간의 오차가 발생할 수 있다.
		System.out.println(Math.pow(2, -10000));


	}
}
