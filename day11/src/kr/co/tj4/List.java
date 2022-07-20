package kr.co.tj4;

import java.util.ArrayList;
import java.util.HashMap;

public class List {
	public void List() {
	}
	public void listDisplay() {
		System.out.println("======================전체출력====================");
		System.out.println("제목\t내용\t작성자\t날짜\t\t조회수\n");
	}
	public void listProcess() {
		HashMap<String,String> boardHash=null; // 선언하기
		for(int i=0;i<Register.boardList.size();i++) {
			boardHash = new HashMap<String,String>(); //공간만들기, 키가 중복되지 않도록 new로 계속 생성
			boardHash = Register.boardList.get(i);
			System.out.print(boardHash.get("title")+"\t");
			System.out.print(boardHash.get("content")+"\t");
			System.out.print(boardHash.get("author")+"\t");
			System.out.print(boardHash.get("nal")+"\t");
			System.out.print(boardHash.get("readCount")+"\n");
		}
	}
}


/**public void list(ArrayList<HashMap<String,String>>boardList) {
}
*/