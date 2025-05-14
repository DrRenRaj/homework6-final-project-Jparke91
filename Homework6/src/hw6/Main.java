package hw6;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Library library = new Library(); 
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------");
			System.out.println("1. Add Book\n"
					+ "2. Remove Book\n"
					+ "3. Display All Books\n"
					+ "4. Search by Title\n"
					+ "5. Search by Author\n"
					+ "6. Check Out Book\n"
					+ "7. Return Book\n"
					+ "8. Exit\n"
					+ "Select An Option: ");
			int selection = input.nextInt();
			input.nextLine(); 
			switch (selection) {
			case 1:
				System.out.println("Enter Title: ");
				String title = input.nextLine();
				System.out.println("Enter Author: ");
				String author = input.nextLine();
				System.out.println("Enter isbn: ");
				String isbn = input.nextLine();
				library.addBook(new Book(title, author, isbn));
				break;
			case 2:
				System.out.println("Enter isbn: ");
				isbn = input.nextLine();
				library.removeBook(isbn);
				break;
			case 3:
				System.out.println("Books in Library:");
				library.displayAllBooks();
				break;
			case 4:
				System.out.println("Enter Title: ");
				title = input.nextLine();
				ArrayList<Book> results = library.SearchByTitle(title);
				System.out.println("Search Results:");
				for (int i = 0; i < results.size(); i++) {
					Book b = results.get(i);
					System.out.println(b.toString());
				}
				break;
			case 5:
				System.out.println("Enter Author: ");
				author = input.nextLine();
				results = library.searchByAuthor(author);
				System.out.println("Search Results:");
				for (int i = 0; i < results.size(); i++) {
					Book b = results.get(i);
					System.out.println(b.toString());
				}
				break;
			case 6:
				System.out.println("Enter isbn: ");
				isbn = input.nextLine();
				library.checkOutBook(isbn);
				break;
			case 7:
				System.out.println("Enter isbn: ");
				isbn = input.nextLine();
				library.returnBook(isbn);
				break;
			case 8:
				System.out.println("Exiting The Program");
				return;
			default: 
				System.out.println("Invalid Input");
			}
		}
	}
}
