package day03;

import java.util.Scanner;

public class Test9_messord_str_equals_charAt {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int age = 12; // 숫자로 입력할때
		int charge = 0;
		char menu = 'n';
		char select1='n';
		char select3='n';
		
		String select2=null;
		
		System.out.println("메뉴선택 a.중식.b.기타");
		select1 = scan.next().charAt(0); // 문자하나 받을때

		if(select1=='A' ||select1=='a'){
			System.out.println("중식선택");
			System.out.println("추가 주문을 하세요.(yes) --짜장곱배기 보통.두그릇");
			select2 = scan.next(); // 단어를 받을때.
			if(select2.equals("YES")||select2.equals("yes")){ // 단어받을때
				System.out.println("곱배기신청");
				System.out.println("추가인원y/n");
				select3 = scan.next().charAt(0); // 한글자를 받을때.
				if(select3=='Y'|| select3=='y') {
					System.out.println("추가인원 신청했습니다.");
				}
			} // 곱배기 끝
		} // 중식신청 끝
		
		else if(select1=='B' || select1=='b') {
			System.out.println("기타선택");
			System.out.println("추가 주문을 하세요. --한식yes, 양식");
			select2 = scan.next(); // 단어를 받을때.
			if(select2.equals("YES")||select2.equals("yes")){ // 단어받을때
				System.out.println("곱배기신청");
				System.out.println("추가인원y/n");
				select3 = scan.next().charAt(0); // 한글자를 받을때.
				if(select3=='Y'|| select3=='y') {
					System.out.println("추가인원 신청했습니다.");
				}
			}
		}
		
		
	}
}
