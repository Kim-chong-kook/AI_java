package kr.co.tj;

public class Test_arry_Object_for___Good { // 객체형 반복문

	public static void main(String[] args) {
		int[] numArray = {1,2,3,4,5};
		
		// 용법에 따라 1,2를 선택한다.	
		
		// 1.일반형
		for(int i=0;i<numArray.length;i++) {
			int x = numArray[i];
			System.out.print(x);
		}
		
		System.out.println();
		
		// 2.객체형 반복문 // 내부적으로 주소를 가져오는 작업을 해준다.
		for(int x : numArray) { // 객체형반복문(읽기용) : ★★★ 파이썬의 enumerate()와 흡사함.
			System.out.print(x);
		}
	}

}
