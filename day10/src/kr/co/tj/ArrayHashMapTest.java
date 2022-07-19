package kr.co.tj;

import java.util.HashMap;

public class ArrayHashMapTest { // 게시판 만들때 사용함.

	public static void main(String[] args) {
		// 해쉬 타입은 참조형 자료로써 [첫글자가 대문자]인 클래스형 타입으로 설정
		HashMap<String,String> hashTest = new HashMap<String, String>(); //(괄호)는 객체의미.
		hashTest.put("id", "tj"); // dict 타입 해쉬는 add 대신 put. // index가 없다.
		hashTest.put("pw", "1111"); // key,value // key는 중복 불가.
		hashTest.put("pw", "2222"); // key,value // key는 중복 불가. // 덮어써 버렸다.
		System.out.println(hashTest.get("id"));
		System.out.println(hashTest.get("pw")); 

	}

}
