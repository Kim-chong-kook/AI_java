package kr.co.tj;

import java.util.Scanner;

public class while_ever_Rounding { // 무한반복 진행

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		while(true) { // 무한반복.
			System.out.println("주문하하시겠어요? yes/no");
			String select = scan.next();
			if(select.equals("yes") || select.equals("YES")) {
				System.out.println("주문선택");
				System.out.println("메뉴1.자장면 2.짬뽕.3.탕수육");
				menu = scan.nextInt();
				if(menu==1) {
					System.out.println("자장면");
					
				}else if (menu==2) {
					System.out.println("짬뽕");
					
				}else if (menu==3) {
					System.out.println("탕수육");
					
				}else {
					System.out.println("찾는 메뉴없음...");
				}
			}else {
				System.out.println("주문취소");
				break;
			}
		}
	}

}
