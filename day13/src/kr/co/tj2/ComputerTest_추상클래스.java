package kr.co.tj2;

/** 추상 클래스
 * 
 * @author TJ
 *
 */
abstract class Computer { // 추상 클래스 속에 추상메소드가 없다. ==> 상속의 용도로만 사용함
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("전원켠다.");
	}
	public void turnOff() {
		System.out.println("전원끈다.");
	}
}

class DeskTop extends Computer{ // 맨앞에 public을 지우면 에러 사라진다.

	@Override
	void display() {
		System.out.println("DeskTop display");
		
	}

	@Override
	void typing() {
		System.out.println("DeskTop typing");
		
	}
	@Override
	public void turnOn() {
		System.out.println("Desktop turnon");
	}
	@Override
	public void turnOff() {
		System.out.println("Desktop turnoff");
	}
}

abstract class NoteBook extends Computer{
	
	@Override
	public void typing() {
		System.out.println("NoteBook typing");		
	}
}
	
class MyNoteBook extends NoteBook{

	@Override
	void display() {
		System.out.println("MyNoteBook display");		
	}
}
	
//================================================
public class ComputerTest_추상클래스 {
	public static void main(String[] args) {
		Computer computer = new DeskTop();
		computer.typing();
		computer.display();
		computer.turnOff();
		computer.turnOn();
		
		
		NoteBook myNote = new MyNoteBook();
	}
}

