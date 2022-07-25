package kr.co.tj3;

class PlayerLevel{
	public void run() {
		
	}
	public void run(String string) {
		// TODO Auto-generated method stub
		System.out.println(string + "달립니다.");
	}
	public void jump() {
		System.out.println("jump");
	}
	public void turn() {
		System.out.println("turn");
	}

	public void showLevelMessage() {
		
	}
	public void showLevelMessage(String string) {
		// TODO Auto-generated method stub
		System.out.println(".");
	}
	public void go() {
		// TODO Auto-generated method stub
	}
	public void go(int count) {
		System.out.println(count+"번째 시작");
	}
	
	
}

class Player extends PlayerLevel{ // 포함관계???
	
	int count;
	public Player(int count) {
		this.count = count;
	}
	public void getLevel() {
		
	}
	public void upgradeLevel() {
		
	}
	public void play() {
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		super.jump();
	}
	@Override
	public void turn() {
		// TODO Auto-generated method stub
		super.turn();
	}
	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		super.showLevelMessage("");
	}
	@Override
	public void go() {
		// TODO Auto-generated method stub
		super.go(count);
	}
	
}



class BeginnerLevel extends PlayerLevel {

	@Override
	public void run(String s) {
		// TODO Auto-generated method stub
		super.run(s);
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		super.jump();
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		super.turn();
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		super.showLevelMessage("초급자"+this.run());
	}
	
}

class AdvandedLevel extends PlayerLevel {

	@Override
	public void run(String string) {
		// TODO Auto-generated method stub
		super.run(string);
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		super.jump();
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		super.turn();
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		super.showLevelMessage("중급자 레벨입니다.");
	}
	@Override
	public void showLevelMessage(String str) {
		// TODO Auto-generated method stub
		this.run("중급자");
		super.showLevelMessage("중급자 레벨입니다.");
	}	
}

class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		super.jump();
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		super.turn();
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		super.showLevelMessage("고급자 레벨입니다.");
	}
	
}
public class MainBoardPlay_자체구현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
