package kr.co.tj;

public class testing1 {

	public static void main(String[] args) {
		char a = 0;
		for(char i='A';i<='Z';i++) { // i는 char/int 무관하다.
			if (i >= 'A') {
				System.out.print(i);
			//if (i == 'Z') {
			//	break;
			System.out.print(i); // for에서 컨트롤 된다.
			}
		}
		
		// 표준안
		char alpha = 'A'; //시작값
		while(alpha<='Z') {
			System.out.printf("%c",alpha);
			alpha++; // 증가값
		}
	}

}

