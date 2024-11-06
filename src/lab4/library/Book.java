package lab4.library;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private boolean isAvailable; 
	
	// TODO: implement Book functionality 
	public Book(String title) {
		this.title = title;
		this.isAvailable = true;
	}
	
	// getters
	public String getTitle() {
		return this.title;
	}
	
	public boolean getAvailability() {
		return this.isAvailable;
	}
	
	// setters
	public void setTitle(String name) {
		this.title = name;
	}
	
	public void setAvailability(Boolean available) {
		this.isAvailable = available;
	}
}
