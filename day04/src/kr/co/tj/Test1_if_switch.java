package kr.co.tj;

import java.util.Scanner;

public class Test1_if_switch {

	public static void main(String[] args) {
		String select="no";
		int menu =0;
		Scanner scan =new Scanner(System.in);
		System.out.println("주문하세요 yes/no");
		select=scan.next();
		
		
		if(select.equals("yes") || select.equals("YES") ) { // switch 복잡성 탈피위해 if else사용
			System.out.println("메뉴선택 1.자장면, 2. 짬뽕.");
			menu = scan.nextInt();
			switch(menu) { // switch의 시작.=======
				case 1:
					System.out.println("자장면선택");
					break;
				case 2:
					System.out.println("짬뽕선택");
					break;
			} // switch의 끝========================
		
		}
		else {
			System.out.println("주문취소");
		}

		
	}
}
