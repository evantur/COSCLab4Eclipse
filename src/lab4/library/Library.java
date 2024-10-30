package lab4.library;
import java.util.ArrayList;
public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:	
	private ArrayList<String> availableBooks = new ArrayList<>();
	
	
	// Methods: 
	// Adds a book to the library catalog
	public void addBook(String bookName) {
	    availableBooks.add(bookName);
	    System.out.println(bookName + " has been added to the catalog.");
	}
	// TODO: implement functionality of Member class

}
