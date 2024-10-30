package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	Library library;
	
	public void borrowBook(String bookName, String memberName) {
		library.borrowBook(bookName, memberName);
	}
	
	public void returnBook(String bookName, String memberName) {
		
	}

}
