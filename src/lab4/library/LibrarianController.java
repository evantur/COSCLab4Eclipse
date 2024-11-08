package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// DONE: implement functionality of Member class
	Library library = new Library();
	
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
	public void addBook(String bookTitle) {
		Book book = new Book(bookTitle);
		library.addBook(book);
	}
	public void registerMember(String name) {
		Member member = new Member(name);
		library.registerMember(member);
	}
	public void showCatalog() {
		library.showCatalog();
	}
	public void showAvailableBooks() {
		library.showAvailableBooks();
	}
	
	public void showMembers() {
		library.showMembers();
	}
}
