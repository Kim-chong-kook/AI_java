package kr.co.tj3;

/** 사본 게시판에서 if 등록하는 부분만 잘라내서 가져오기
 *  등록하는 부분만의 method Function 만들기
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BoardFucntion {
	
	// 등록 / static을 빼면 class소속이 아닌, 일반 메소드(인스턴스로 바뀐다.)
	public void register(String titleContent,Scanner scan,int indexI,String title,String content,String author, String nal, String readCount, ArrayList<HashMap<String,String>> boardList) {
		// 등록 부분 카피해옴.
		HashMap<String,String> boardHash = new HashMap<String,String>();
		System.out.println("제목|내용 입력:");
		titleContent = scan.next();
		indexI = titleContent.indexOf("|"); // |의 index 위치를 가져옴.
		title=titleContent.substring(0,indexI);
		content=titleContent.substring(indexI+1);
		//System.out.println("제목:"+title);
		//System.out.println("내용:"+content);
		
		System.out.println("작성자 입력:");
		author = scan.next();
		System.out.println("날짜 입력:");
		nal = scan.next();
		System.out.println("조회수 입력:");
		readCount = scan.next();
		boardHash.put("title", title);
		boardHash.put("content", content);
		boardHash.put("author", author);
		boardHash.put("nal", nal);
		boardHash.put("readCount", readCount);
		boardList.add(boardHash);
		System.out.println("게시글이 등록되었습니다.");
	}
	
	// 검색
	public void search(String serchTitle, Scanner scan, ArrayList<HashMap<String,String>>boardList) {
		boolean result=false;
		System.out.println("제목\t내용\n");
		HashMap<String,String> boardHash = null;
		System.out.println("찾을게시글제목입력:");
		serchTitle = scan.next();
		for(int i=0;i<boardList.size();i++) {
			boardHash = new HashMap<String,String>(); // 객체생성
			boardHash = boardList.get(i);
			if(boardHash.get("title").equals(serchTitle)) {
				System.out.print(boardHash.get("title")+"\t");
				System.out.print(boardHash.get("content")+"\n");
				result=true;
			}
		}
		if(result==true) {
			System.out.println("찾는게시글이 검색되었습니다.");
		}else {
			System.out.println("찾는게시글이 없습니다.");
		}
	}
	
	// 삭제
	public void delete(String deleteTitle, Scanner scan, ArrayList<HashMap<String,String>>boardList) {
		boolean result=false;
		HashMap<String,String> boardHash = null;
		System.out.println("삭제할게시글제목입력:");
		deleteTitle = scan.next();
		for(int i=0;i<boardList.size();i++) {
			boardHash = new HashMap<String,String>(); // 주소다른 객체생성인데, 결국은 같은 value값을 컨트롤 하는 것
			boardHash = boardList.get(i);
			if(boardHash.get("title").equals(deleteTitle)){
				boardList.remove(i);
				result = true;
			}
		}
		if(result==true) {
			System.out.println("게시글이 삭제되었습니다.");
		}else {
			System.out.println("게시글이 없습니다.");
		}
	}
	
	// 업데이트
	public void update(String updateTitle, String titleContent, int indexI, String title, String content,Scanner scan, ArrayList<HashMap<String,String>>boardList) {
		HashMap<String,String> boardHash;
		String select=null;
		boolean result = false;
		System.out.println("수정할 게시글제목 입력:");
		updateTitle = scan.next();
		System.out.println("수정하기전 내용입니다.");
		System.out.println("제목\t내용\t\n");
		for(int i=0;i<boardList.size();i++) {
			boardHash = new HashMap<String,String>();
			boardHash = boardList.get(i);
			if(boardHash.get("title").equals(updateTitle)) {
				System.out.println(boardHash.get("title")+"\t");
				System.out.println(boardHash.get("content")+"\t");
				System.out.println("수정하실래요 yes/no");
				System.out.println("");
				select = scan.next();
				if(select.equals("yes")||select.equals("YES")) {
					System.out.println("제목|내용 입력:");
					titleContent = scan.next();
					indexI = titleContent.indexOf("|");
					title = titleContent.substring(0,indexI); // (시작Index,끝Index)
					content = titleContent.substring(indexI+1); // (시작Index)
					boardHash.put("title", title);
					boardHash.put("content", content);
					
					// boardList.add(i,boardHash); // 추가하기
					boardList.set(i,boardHash); // 덮어쓰기
					result = true;
				}
			}
		}
		if(result==true) {
			System.out.println("게시글이 수정되었습니다.");
		}else {
			System.out.println("수정할 게시글이 없습니다.");
		}
	}
	
	public void list(ArrayList<HashMap<String,String>>boardList) {
		System.out.println("======================전체출력====================");
		System.out.println("제목\t내용\t작성자\t날짜\t\t조회수\n");
		HashMap<String,String> boardHash=null; // 선언하기
		for(int i=0;i<boardList.size();i++) {
			boardHash = new HashMap<String,String>(); //공간만들기, 키가 중복되지 않도록 new로 계속 생성
			boardHash = boardList.get(i);
			System.out.print(boardHash.get("title")+"\t");
			System.out.print(boardHash.get("content")+"\t");
			System.out.print(boardHash.get("author")+"\t");
			System.out.print(boardHash.get("nal")+"\t");
			System.out.print(boardHash.get("readCount")+"\n");
		}
	}
	
	
	

}
