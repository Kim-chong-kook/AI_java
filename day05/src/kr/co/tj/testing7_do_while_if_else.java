package kr.co.tj;

import java.util.Scanner;

public class testing7_do_while_if_else {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0;
		do {
			System.out.println("1.입력하기\n"); // 무한반복
			System.out.println("2.출력하기\n");
			System.out.println("3.삭제하기\n");
			System.out.println("4.끝내기\n");
			System.out.println("작업할 번호를 선택하세요..");
			num = scan.nextInt(); // 입력받기위해 키보드에서 멈춘다.
			
			if(num==1) {
				System.out.println("입력하기 선택했습니다.");
			}else if(num==2){
				System.out.println("출력하기 선택했습니다.");
			}else if(num==3){
				System.out.println("삭제하기 선택했습니다.");
			}else if(num==4){
				System.out.println("끝내기 선택했습니다.");
			}else{
				System.out.println("선택한 번호가 없습니다.");
			}
			
			/**
			switch(num) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				System.out.println("삭제하기를 선택했습니다.");
				break;
			case 4:
				System.out.println("끝내기를 선택했습니다.");
				break;
			default:
				System.out.println("올바로 선택한 번호가 없습니다.");
			} */
		}while(num!=4); // 4가 아니면 반복, 4면 종료.
	}

}

// 약속 = 프로토콜 세운다.(개발자와 사용자간)