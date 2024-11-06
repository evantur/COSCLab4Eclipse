package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	Library library;
	
	public void borrowBook(String bookTitle, String memberName) {
		Member member = library.findMemberByName(memberName);
		Book book = library.findBookByTitle(bookTitle);
		member.borrowBook(book);
	}
	
	public void returnBook(String bookTitle, String memberName) {
		Member member = library.findMemberByName(memberName);
		Book book = library.findBookByTitle(bookTitle);
		member.returnBook(book);
	}

}
