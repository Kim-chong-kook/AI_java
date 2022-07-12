package kr.co.tj;

public class For_testing { // 조건식 생략

	public static void main(String[] args) {
		int i, sum=0;
		for(i = 0; ; i++) {
			sum += i;
			if(sum>200) break; // if {}실행문 생략함.
			// i++은 i=i+1, i+=1 같다.
		}
		System.out.println("i=" +i + ", sum=" + sum );
	}

}
