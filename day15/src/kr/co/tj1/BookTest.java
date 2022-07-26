package kr.co.tj1;

class Book extends Object{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() { // 힙의 주소를 정확한 값으로 넣어준다.
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("데미안","헤르만 해세");
		System.out.println(book);
	}

}
