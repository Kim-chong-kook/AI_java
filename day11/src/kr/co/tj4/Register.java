package kr.co.tj4;

/** 매소드 외의 변수는 캡슐화를 위해 private로 전환한다.
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register {
	private String titleContent;
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<HashMap<String,String>> boardList = new ArrayList<HashMap<String,String>>();
	private int indexI;
	private String title;
	private String content;
	private String author;
	private String nal;
	private String readCount;
	
	public Register() {
	}
	public void registerTitleContente() {
		System.out.println("제목|내용 입력:");
		titleContent = Register.scan.next();
	}
	public void registerTitleContenteProcess() {
		indexI = titleContent.indexOf("|"); // |의 index 위치를 가져옴.
		title=titleContent.substring(0,indexI);
		content=titleContent.substring(indexI+1);
	}
	public void registerAuthor() {
		System.out.println("작성자 입력:");
		author = Register.scan.next();
	}
	public void registerNal() {
		System.out.println("날짜 입력:");
		nal = Register.scan.next();
	}
	public void registerReadCount() {
		System.out.println("조회수 입력:");
		readCount = Register.scan.next();
	}
	public void registerProcess() {
		// HashMap은 멤버변수로 놓을 수 없어서, 여기서 선언한다.
		HashMap<String,String> boardHash = new HashMap<String,String>();
		boardHash.put("title", title);
		boardHash.put("content", content);
		boardHash.put("author", author);
		boardHash.put("nal", nal);
		boardHash.put("readCount", readCount);
		boardList.add(boardHash);
		System.out.println("게시글이 등록되었습니다.");
	}

}

/* 참조할 메소드를 복사해와서 클래스로 이전 : 변수를 하나씩 이전
public void register() {
// 등록 부분 카피해옴.
	HashMap<String,String> boardHash = new HashMap<String,String>();
	
	//System.out.println("제목:"+title);
	//System.out.println("내용:"+content);
	
	
	
	
	System.out.println("게시글이 등록되었습니다.");
}
*/