package kr.co.tj4;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;

import java.util.HashMap;

public class Delete {
	private String deleteTitle;
	public boolean result; // 자동초기화됨 =false;
	
	public Delete() {
	}
	public void deleteTitle() {
		System.out.println("삭제할게시글제목입력:");
		deleteTitle = Register.scan.next();
	}
	public void deletePorocess() {
		HashMap<String,String> boardHash = null;
		for(int i=0;i<Register.boardList.size();i++) {
			boardHash = new HashMap<String,String>(); // 주소다른 객체생성인데, 결국은 같은 value값을 컨트롤 하는 것
			boardHash = Register.boardList.get(i);
			if(boardHash.get("title").equals(deleteTitle)){
				Register.boardList.remove(i);
				result = true;
			}
		}
	}
	
	public void deleteResult() {
		if(result==true) {
			System.out.println("게시글이 삭제되었습니다.");
		}else {
			System.out.println("게시글이 없습니다.");
		}
	}
}

/*
 * // 삭제
	public void delete() {
		
		
		
		
		
	}
	*/
