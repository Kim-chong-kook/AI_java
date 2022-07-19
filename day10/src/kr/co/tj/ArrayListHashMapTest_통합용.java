package kr.co.tj;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListHashMapTest_통합용 {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> boardList = new ArrayList<HashMap<String,String>>();
		// ArrayList속에 통합해서 HashMap(dict)을 넣었다.
		
		HashMap<String,String> boardHash = new HashMap<String,String>();
		boardHash.put("title","제목1");
		boardHash.put("content","내용1");
		boardList.add(boardHash);
		System.out.println("등록되었습니다...");
		for(int i=0;i<boardList.size();i++) {
			HashMap<String,String> boardHash1 = boardList.get(i); // 중복되지 않게 방1을 만들어 불러온다.
			System.out.println(boardHash1.get("title"));
			System.out.println(boardHash1.get("content"));
		}
	}

}
