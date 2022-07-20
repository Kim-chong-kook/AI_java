package kr.co.tj4;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;

import java.util.HashMap; // ★★★java 최종점이 class 만들기다.

public class Search {
	private String serachTitle;
	public boolean result;
	public Search() {
		
	}
	public void searchTitle() {
		
		System.out.println("찾을게시글제목입력:");
		serachTitle = Register.scan.next();
	}
	public void searchDisplay() {
		System.out.println("제목\t내용\n");
	}
	public void searchProcess() {
		HashMap<String,String> boardHash = null;
		for(int i=0;i<Register.boardList.size();i++) {
			boardHash = new HashMap<String,String>(); // 객체생성
			boardHash = Register.boardList.get(i);
			if(boardHash.get("title").equals(serachTitle)) {
				System.out.print(boardHash.get("title")+"\t");
				System.out.print(boardHash.get("content")+"\n");
				result=true;
			}
		}
	}
	public void searchResult() {
		if(result==true) {
			System.out.println("찾는게시글이 검색되었습니다.");
		}else {
			System.out.println("찾는게시글이 없습니다.");
		}
	}
}

/*
//검색
	public void search() {
	
		boolean result=false;
		
		
		
		
		
	}
	*/