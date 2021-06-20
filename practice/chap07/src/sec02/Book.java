package sec02;

public class Book implements Comparable<Book> {
	int price;
	
	public Book(int price) {
		this.price = price;
	}
	
	public void sortOff() {
		System.out.println("Book [price= "+ price+"]");
	}
	
	@Override
	public int compareTo(Book book) {
		return this.price - book.price;
	}
}
