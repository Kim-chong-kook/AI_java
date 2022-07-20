package kr.co.tj4;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;

import java.util.HashMap;

public class Update {
	private String updateTitle;
	private String titleContent;
	public int indexI;
	private String title;
	private String content;
	public boolean result;// = false;
	private String select;//=null;
	
	public void Update() {
	}
	public void updateTitle() {
		System.out.println("수정할 게시글제목 입력:");
		updateTitle = Register.scan.next();
	}
	public void updateBeforeTitle() {
		System.out.println("수정하기전 내용입니다.");
		System.out.println("제목\t내용\t\n");
		select = Register.scan.next();
	}
	public void updateProcess() {
		HashMap<String,String> boardHash;
		for(int i=0;i<Register.boardList.size();i++) {
			boardHash = new HashMap<String,String>();
			boardHash = Register.boardList.get(i);
			if(boardHash.get("title").equals(updateTitle)) {
				System.out.println(boardHash.get("title")+"\t");
				System.out.println(boardHash.get("content")+"\t");
				System.out.println("수정하실래요 yes/no");
				System.out.println("");
				select = Register.scan.next();
				if(select.equals("yes")||select.equals("YES")) {
					updateTitleContent();
					indexI = titleContent.indexOf("|");
					title = titleContent.substring(0,indexI); // (시작Index,끝Index)
					content = titleContent.substring(indexI+1); // (시작Index)
					boardHash.put("title", title);
					boardHash.put("content", content);
					// boardList.add(i,boardHash); // 추가하기
					Register.boardList.set(i,boardHash); // 덮어쓰기
					result = true;
				}
			}
		}
	}
	public void resultDisplay() {
		if(result==true) {
			System.out.println("게시글이 수정되었습니다.");
		}else {
			System.out.println("수정할 게시글이 없습니다.");
		}
	}
	public void updateTitleContent() {
		System.out.println("제목|내용 입력:");
		titleContent = Register.scan.next();
	}
}




/**업데이트
	public void update(String updateTitle, String titleContent, int indexI, String title, String content,Scanner scan, ArrayList<HashMap<String,String>>boardList) {
	
	}
*/