package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	Library library;
	Member member;
	
	public void borrowBook(String bookTitle) {
		member.borrowBook(bookTitle);
	}
	
	public void returnBook(String bookName, String memberName) {
		
	}

}
