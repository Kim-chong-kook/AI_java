package kr.co.tj4;


class Book{
	private String title;
	private String author;
	public Book() {
		//this(null,null);
		this("no","no");
	}
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
	}
	
	
	
	//get/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("책제목:"+title+"저자:"+author); // 프라이빗의 내용을 함수로 내보내준다.
	}

}


//===================
public class BookArrayTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		library[0] = new Book("태백산맥1","조정래"); // 참조 객체이기 때문에 / 배열이 주소값을 나타냄
		library[1] = new Book("태백산맥2","조정래"); // 참조 객체이기 때문에 / 배열이 주소값을 나타냄
		library[2] = new Book("태백산맥3","조정래"); // 참조 객체이기 때문에 / 배열이 주소값을 나타냄
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]); // 주소값만.
			library[i].showBookInfo(); // 내부정보를 뿌려주는 별도의 함수 만들어 사용함.
		}

	}
	

}
