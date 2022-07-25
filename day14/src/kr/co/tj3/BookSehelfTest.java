package kr.co.tj3;

import java.util.ArrayList;

class Shelf{
	protected ArrayList<String> shelf; // = new 방식은 C방식
	public Shelf() {
		shelf = new ArrayList<String>(); // java방식
	}
	public ArrayList<String> getShelf(){
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
	
	
}
interface Queue{
	void enQueue(String title);
	String deQueue();
	int getSize();
	
}

class BookShelf extends Shelf implements Queue{ // ★★ Queue 몸체 구현
	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return shelf.remove(0); // ★★ 이전것 지우고 다시 넣어서 나오게 하는 리턴
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}
}

public class BookSehelfTest {

	// ★★★★★난이도 있는 문제★★★★
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue bookQueue = new BookShelf(); // ★★업캐스팅
		bookQueue.enQueue("태백산맥1"); // ★★스택 먼저들어간것이 먼저 먼저 나온다.
		bookQueue.enQueue("태백산맥2");
		bookQueue.enQueue("태백산맥3");
		
		System.out.println(bookQueue.deQueue()); // ★★ 이전것 지우고, 스택 먼저들어간것이 먼저 먼저 나온다.
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}


