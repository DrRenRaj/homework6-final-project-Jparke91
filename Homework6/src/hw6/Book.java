package hw6;

public class Book {

	String title;
	String author;
	String isbn;
	boolean isAvailable; 
	
	public Book(String t, String a, String i) {
		title = t; 
		author = a;
		isbn = i;
		isAvailable = true; 
	}
		
	public String toString() {
		return "Book; " + title + " By " + author + " (ISBN: " + isbn + ") "  + 
					(isAvailable ? "available" : "checked out");
	}	
}
