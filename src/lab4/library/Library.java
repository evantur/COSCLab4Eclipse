package lab4.library;
import java.util.ArrayList;
import java.util.HashMap;
public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:	
	public ArrayList<Book> catalog = new ArrayList<>();
	public ArrayList<Member> registeredMembers = new ArrayList<>();	
	
	// Methods:
	// Adds a book to the library catalog
	public void addBook(String bookName) {
	    catalog.add(bookName);
	    System.out.println(bookName + " has been added to the catalog.");
	}
	
	// Adds a new member to the library (without a separate class)
	public void registerMember(String memberName) {
	    if (!registeredMembers.contains(memberName)) {
	    	
	    } else {
	    	
	    }
	}
	
	// Borrow a book from the library
	public void borrowBook(String bookName, String memberName) {
	    if (!registeredMembers.containsKey(memberName)) {
	        System.out.println("Member " + memberName + " not found.");
	        return;
	    }

	    if (catalog.contains(bookName)) {
	        catalog.remove(bookName);
	        registeredMembers.get(memberName).add(bookName);
	        System.out.println(memberName + " has successfully borrowed " + bookName);
	    } else {
	        System.out.println(bookName + " is either already borrowed or not available.");
	    }
	}
	// Return a book to the library
	public void returnBook(String bookName, String memberName) {
	    if (!registeredMembers.containsKey(memberName)) {
	        System.out.println("Member " + memberName + " not found.");
	        return;
	    }

	    if (registeredMembers.get(memberName).contains(bookName)) {
	        registeredMembers.get(memberName).remove(bookName);
	        catalog.add(bookName);
	        System.out.println(memberName + " has successfully returned " + bookName);
	    } else {
	        System.out.println(memberName + " didn't borrow " + bookName);
	    }
	}
	// Find member and if found print name
	public Member findMemberByName(String name) {
		if (registeredMembers.containsKey(name)) {
			return registeredMembers
		}
		else {
			System.out.println(name + " has not yet been registered.");
		}
	}
	
	//find book by title
	public void findBookByTitle(String title) {
		if(catalog.indexOf(title) == -1) {
			System.out.println("The book " + title + " is not available");
		}else {
			System.out.println("The book " + title + " is available");
		}
	}
	
	// Show the available books in the library
	public void showcatalog() {
	    System.out.println("Available Books:");
	    for (String book : catalog) {
	        System.out.println(book);
	    }
	}
	//Show members of in the library
	public void showMembers() {
	   System.out.println("Library members:");
	   for (String member : registeredMembers.keySet()) {
	       System.out.println(member);
	   }
	}
	// TODO: implement functionality of Member class

}
