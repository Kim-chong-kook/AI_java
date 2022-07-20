package kr.co.tj4;

/** 사본 게시판에서 if 등록하는 부분만 잘라내서 가져오기
 *  등록하는 부분만의 method Function 만들기
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BoardFucntion__껍질 {
	/**
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
	
	*/
	
	
	
	
	
	
	
	

}
