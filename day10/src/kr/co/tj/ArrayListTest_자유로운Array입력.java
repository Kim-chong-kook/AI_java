package kr.co.tj;

import java.util.ArrayList; // 컨트롤 쉬프트 O

public class ArrayListTest_자유로운Array입력 {

	public static void main(String[] args) {
		
		//ArrayList array1 = new ArrayList(); // 타입 미설정
		ArrayList<String> array1 = new ArrayList<String>(); // 타입 설정
		
		array1.add("A");
		array1.add("B");
		array1.add("C");
		array1.add("D");
		array1.add("E");
		array1.remove(2); // 지우고 나면 자동으로 한칸씩 앞당겨 진다. 끝에는 null이 채워진다.
		
		System.out.print(array1.get(0)); // 0번지
		System.out.print(array1.get(1)); // 1번지
		System.out.print(array1.get(2)); // 2번지
		System.out.println();
		
		array1.add(2,"C");
		System.out.print(array1.get(2)); // 2번지
		array1.add(2,"G");
		System.out.print(array1.get(2)); // 2번지
		System.out.println(array1.size()); // 2번지
		
		for(int i=0;i<array1.size();i++) {
			System.out.print(array1.get(i));
		}
		System.out.println();
		//ArrayList<String> array1 = new ArrayList<String>(); // 향상된 for문을 위해 객체 복사하는 방식.
		for(String str:array1) {
			System.out.print(str);
		}
		
		//=============================================================
		// 타입 미설정하면, 자유로운 배열입력 ------매우 좋은 기능.
		ArrayList array2 = new ArrayList(); 
		array2.add("A"); // 자유로운 입력
		array2.add(1.5);
		array2.add(1);
		array2.add(true);
		
		// 제네릭(generic) : 자료의 단일성을 위해서 배열 type을 미리 정함.
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("A");
		array3.add(1.5); // 문자열 외에는 에러
		array3.add(1); // 문자열 외에는 에러
		array3.add(true); // 문자열 외에는 에러
		
		
		
		
		
		
		
		
		
		
		
	}

}
