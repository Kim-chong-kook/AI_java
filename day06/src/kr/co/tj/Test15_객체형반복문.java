package kr.co.tj;

public class Test15_객체형반복문 {

	public static void main(String[] args) {
		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alpahbets.length; i++) {
			
			alpahbets[i] = ch++;
		}
		
		for(char alpha : alpahbets) { //객체형 반복문 : alpha로 넘겨받음(파이썬의 enumerate와 흡사합)
			System.out.println(alpha +","+ (int)alpha);
		}
		
	}

}
