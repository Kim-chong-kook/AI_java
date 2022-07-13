package kr.co.tj;

public class Test14_배열_알파벳 {

	public static void main(String[] args) {
		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alpahbets.length; i++) {
			
			alpahbets[i] = ch++;
		}
		
		for(int i = 0; i<alpahbets.length; i++) {
			System.out.println(alpahbets[i] +","+ (int)alpahbets[i]);
		}

	}

}
