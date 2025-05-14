package hw6;
import java.util.ArrayList;
public class Library {

	ArrayList<Book> books;
	public Library() {
		books = new ArrayList<Book>();
	}
	public void addBook(Book book) {
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			if (b.isbn.equals(book.isbn)) {
				System.out.println("This Book Already Exists.");
			}
		}
		books.add(book);
	}
	public void removeBook(String isbn) {
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			if (b.isbn.equals(isbn)) {
				System.out.println("Removed " + b.toString());
				books.remove(i);
				return;
			}
		}
		System.out.println("The Book Does Not Exist.");
	}
	public void displayAllBooks() {
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
	}
	public ArrayList<Book> SearchByTitle(String title) {
		
		ArrayList<Book> results = new ArrayList<Book>();
		
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			if (b.title.contains(title)) {
				results.add(b);	
			}
		}
		
		return results;
	}
	public ArrayList<Book> searchByAuthor(String author) {
		
		ArrayList<Book> results = new ArrayList<Book>();
		
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			if (b.author.equals(author)) {
				results.add(b);
			}
		}
		
		return results;
	}
	public void checkOutBook(String isbn) {
		
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			if (b.isbn.equals(isbn)) {
				
				if (b.isAvailable == false) {
					System.out.println("This Book is Unavailable.");
				} else {
					b.isAvailable = false;
					System.out.println("Checked out: " + b.toString());
				}
				
				return;
			}
		}
	}
	public void returnBook(String isbn) {
		
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			if (b.isbn.equals(isbn)) {
				if (b.isAvailable == true) {
					System.out.println("This Book Has Not Been Checked Out");
				} else {
					b.isAvailable = true; 
					System.out.println("Returned: " + b.toString());
				}
				
				return;
			}
		}
	}
}