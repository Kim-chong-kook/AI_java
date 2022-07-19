package kr.co.tj1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BoardExcuter_게시판 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 전역변수로 사용할 변수들. 대문자 참조자료형은 null 초기화.
		String titleContent =null; int indexI=0;String title=null;
		String content=null; String author=null; String nal=null;
		String readCount = null; String serchTitle = null; 
		ArrayList<HashMap<String,String>> boardList = new ArrayList<>();
		String deleteTitle = null;
		while(true) { //무한 반복문
		System.out.println("======================게시판 작성==================");
		System.out.println("R:등록 S:검색 D:삭제 U:수정 L:목록");
		
		String protocol = scan.next();
		if(protocol.equals("r") || protocol.equals("R")) { // 등록의 시작
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
		}// 등록의 끝
		
		else if(protocol.equals("s") || protocol.equals("S")) {//검색 시작
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
		}// 검색의 끝
		else if(protocol.equals("d") || protocol.equals("D")) { //삭제 시작
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
		}// 삭제의 끝
		else if(protocol.equals("u") || protocol.equals("U")) {//수정의 시작
			
		}// 수정의 끝
		else if(protocol.equals("l") || protocol.equals("L")) {
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
		}// 전체 출력의 끝
	  }// 무한반복 끝.
	}

}
