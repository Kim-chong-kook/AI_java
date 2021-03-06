package day03; // 대략적 달력 제작 연습

import java.util.Scanner;

public class Mak_moon_paper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력");
		int year = scan.nextInt();
		System.out.println("월을 입력");
		int month = scan.nextInt();
		boolean result = (year%4==0 && year%100 !=0 ||year%400==0);
		if (result) {
			System.out.println("윤년입니다. 2월달이 29일");
			System.out.println(year+"년도입니다.");
			if(month==1) {
			System.out.println("1월:31일");	
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==2) {
			System.out.println("2월:29일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29\n");
			}
			if(month==3) {
			System.out.println("3월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==4) {
			System.out.println("4월:30일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30\n");
			}
			if(month==5) {
			System.out.println("5월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==6) {
			System.out.println("6월:30일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30\n");
			}
			if(month==7) {
			System.out.println("7월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==8) {
			System.out.println("8월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==9) {
			System.out.println("9월:30일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30\n");
			}
			if(month==10) {
			System.out.println("10월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==11) {
			System.out.println("11월:30일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30\n");
			}
			if(month==12) {
			System.out.println("12월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
		}else {
			System.out.println("윤년이 아닙니다. 2월달이 28일");
			System.out.println(year+"년도입니다.");
			if(month==1) {
			System.out.println("1월:31일");	// printf는 제어문자를 사용해야함
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==2) {
			System.out.println("2월:28일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28\n");
			}
			if(month==3) {
			System.out.println("3월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==4) {
			System.out.println("4월:30일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30\n");
			}
			if(month==5) {
			System.out.println("5월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==6) {
			System.out.println("6월:30일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30\n");
			}
			if(month==7) {
			System.out.println("7월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==8) {
			System.out.println("8월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==9) {
			System.out.println("9월:30일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30\n");
			}
			if(month==10) {
			System.out.println("10월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
			if(month==11) {
			System.out.println("11월:30일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30\n");
			}
			if(month==12) {
			System.out.println("12월:31일");
			System.out.printf("1 2 3 4 5\n" 
					+ "6 7 8 9 10 11 12 13\n"
					+ "14 15 16 17 18 19\n"
					+ "20 21 22 23 24 25\n"
					+ "26 27 28 29 30 31\n");
			}
		}
		
	}

}
