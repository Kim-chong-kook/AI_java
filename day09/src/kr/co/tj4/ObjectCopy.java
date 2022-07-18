package kr.co.tj4;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5]; // 메모리 공간만 할당함.
		
		library[0] = new Book("태백산맥1","조정래");// 객체를 넣음
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5); 
		// ★★★★★★ 5개 깊은 복사해도 메모리 같아서 얕은 복사됨.....
		// 원인은 같은 객체 생성방식을 통했기 때문임.
		
		System.out.println("========copy library========");
		for(Book book:copyLibrary) {
			book.showBookInfo();
		}
		library[2].setTitle("나목");
		library[2].setAuthor("박완서");
		System.out.println("==========변경내용============");
		for(Book book:copyLibrary) {
			book.showBookInfo();
		}
		System.out.println("==========원본내용============");
		for(Book book:library) {
			book.showBookInfo();
		}
		
		// 같은 객체생성방식을 했다면, 깊은 복사를 하려면,..
		
		copyLibrary[0] = new Book(); // 별도의 공간을 새로 선언해서 채운다.
		copyLibrary[1] = new Book();		
		copyLibrary[2] = new Book();		
		copyLibrary[3] = new Book();		
		copyLibrary[4] = new Book();	
		
		copyLibrary[0] = new Book("나목1","박완서");// 객체를 별도로 넣음
		copyLibrary[1] = new Book("나목2","박완서");
		copyLibrary[2] = new Book("나목3","박완서");
		copyLibrary[3] = new Book("나목4","박완서");
		copyLibrary[4] = new Book("나목5","박완서");
			
		

	}

}
