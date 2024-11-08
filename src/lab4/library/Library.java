package lab4.library;
import java.util.ArrayList;
public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:	
	public ArrayList<Book> catalog = new ArrayList<>();
	public ArrayList<Member> registeredMembers = new ArrayList<>();	
	
	// Methods:
	// Adds a book to the library catalog
	public void addBook(Book book) {
	    catalog.add(book);
	    System.out.println(book.getTitle() + " has been added to the catalog.");
	}
	
	// Adds a new member to the library (without a separate class)
	public void registerMember(Member m) {
	    for (Member member : registeredMembers) {
	    	if (member.getName() == m.getName()) {
	    		System.out.println("Member already exists.");
	    		return;
	    	}
	    }
	    registeredMembers.add(m);
	    System.out.println("Member " + m.getName() + " added.");
	}
	
	// Find member and if found print name
	public Member findMemberByName(String name) {
		try {
			for (Member member : registeredMembers) {
				if (member.getName() == name) {
					return member;
				}
			}
			return null;
		}catch(Exception e) {
			System.out.println("Member does not exist");
		}
	}
	
	//find book by title
	public Book findBookByTitle(String title) {
		try{
			for (Book book : catalog) {
				if (book.getTitle() == title) {
					return book;
				}
			}
		
		
			return null;
		}catch(Exception e) {
			System.out.println("Book does not exist in catalog");
		}
	}
	
	// Show the all books in the library
	public void showCatalog() {
	    System.out.println("Books:");
	    for (Book book : catalog) {
	        System.out.println(book.getTitle());
	    }
	}
	
	// Show the all books in the library
		public void showAvailableBooks() {
		    System.out.println("Available Books:");
		    for (Book book : catalog) {
		    	if(book.getAvailability()) {
			        System.out.println(book.getTitle());
		    	}
		    }
		}
	//Show members of in the library
	public void showMembers() {
	   System.out.println("Library members:");
	   for (Member member : registeredMembers) {
	       System.out.println(member.getName());
	   }
	}
	// DONE: implement functionality of Member class

}
