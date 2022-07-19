package kr.co.tj;

import java.util.Scanner;

public class ArrayTest4 {
	public final static int STUDENTS =5;
	static {
		///////// 위의 final 초기화가 이런식이 원칙임.
	}
	public static void main(String[] args) { // static 메소드는 static 변수만 쓸 수 있다.
		// ★★★★★ 모든 디버깅은 클라이언트 시작진입점인 main에서 시작한다.
		int[] scores = new int[STUDENTS];
		getValues(scores);
		getAverage(scores);
	}
	private static void getAverage(int[] array) { // static 메소드는 static 변수만 쓸 수 있다.
		int total = 0;
		for(int i=0;i<array.length;i++) {
			total += array[i];
		}
		System.out.println("평균성적은 "+total/array.length+"입니다.");
	}
	private static void getValues(int[] array) { // static 메소드는 static 변수만 쓸 수 있다.
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.print("성적을 입력:");
			array[i] = scan.nextInt();
		}
		
	}

}
