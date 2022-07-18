package kr.co.tj2;

import java.util.Scanner;

class DiceGame{ // 클래스는 대문자 시작
	private int diceFace; // 컴퓨터가 기억하는 주사위 값
	private int userGuess; // 사용자가 입력한 값 
	
	private void RollDice() { // ★ 메소드를 대문자로 쓰지 않아야 한다.
		diceFace = (int)(Math.random()*6)+1;
	}
	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	private void checkUserGuess() {
		if(diceFace == userGuess) {
			System.out.println("맞았습니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
	}
	public void startPlaying() {
		this.userGuess = getUserInput("예상값을 입력:"); // ★ ★ ★ this는 지역변수를 피함.
		RollDice();
		checkUserGuess();
	}
}

public class DiceGameTest {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.startPlaying();
		
	}
}
