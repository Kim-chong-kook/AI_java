package kr.co.tj;

import java.util.ArrayList; // 제네릭 용도. 

public class ArrayListTest_국가 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>(); // 제네릭
		
		array.add("한국");
		array.add("미국");
		array.add("중국");
		for(int i=0;i<array.size();i++) {
			System.out.print(array.get(i));
		}
		System.out.println();
		array.remove(0); // index로도 삭제가능
		for(String str: array) {
			System.out.print(str);
		}
		System.out.println();
		array.remove("미국"); // value로도 삭제가능
		for(String str:array) {
			System.out.print(str);
		}

	}

}
