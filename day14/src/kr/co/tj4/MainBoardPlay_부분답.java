package kr.co.tj4;

class Player{
	private PlayerLevel level;
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}
class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 고급자 레벨입니다. ******");
	}
}
abstract class PlayerLevel{
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	public final  void go(int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
	}	
}

class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");		
	}
	

	@Override
	public void jump() {
	     System.out.println("jump 못하지롱");			
	}

	@Override
	public void turn() {
		System.out.println("turn 못하지롱");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("초급자레벨입니다.");		
	}
	
}
class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("높이점프합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn못하지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("중급자레벨입니다.");
		
	}

}
//클라이언트 출발지=========================================
public class MainBoardPlay_부분답 {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
