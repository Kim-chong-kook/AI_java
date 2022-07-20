package kr.co.tj2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 주석달기 해보자
 * @author TJ
 *
 */
public class BoardExcuter_게시판 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 전역변수로 사용할 변수들. 대문자 참조자료형은 null 초기화.===========================
		String titleContent =null; int indexI=0;String title=null;
		String content=null; String author=null; String nal=null;
		String readCount = null; String serchTitle = null; 
		ArrayList<HashMap<String,String>> boardList = new ArrayList<>();
		String deleteTitle = null;String updateTitle = null;
		
		
		
		while(true) { //무한 반복문
		System.out.println("======================게시판 작성==================");
		System.out.println("R:등록 S:검색 D:삭제 U:수정 L:목록");
		
		String protocol = scan.next();
		if(protocol.equals("r") || protocol.equals("R")) { // 등록의 시작===============================
			BoardFucntion.register(titleContent, scan, indexI, updateTitle, content, author, nal, readCount, boardList);
		}// 등록의 끝
		
		else if(protocol.equals("s") || protocol.equals("S")) { //검색 시작==========================
			BoardFucntion.search(serchTitle, scan, boardList);
		}// 검색의 끝
		else if(protocol.equals("d") || protocol.equals("D")) { //삭제 시작===========================
			BoardFucntion.delete(deleteTitle, scan, boardList);
		}// 삭제의 끝
		else if(protocol.equals("u") || protocol.equals("U")) {//수정의 시작==========================
			BoardFucntion.update(updateTitle, titleContent, indexI, updateTitle, content, scan, boardList);		
		}// 수정의 끝
		else if(protocol.equals("l") || protocol.equals("L")) { // 출력시작===========================
			BoardFucntion.list(boardList);
		}// 전체 출력의 끝
	  }// 무한반복 끝.
	}

}
