package sec02;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		Book[] books = new Book[] {new Book(15000), new Book(50000), new Book(20000)};
		
		System.out.println("정렬 전");
		for (Book b1 : books) {
			b1.sortOff();
		}
		
		Arrays.sort(books);
		
		System.out.println("정렬 후");
		for (Book b2 : books) {
			b2.sortOff();
		}
		

	}

}
