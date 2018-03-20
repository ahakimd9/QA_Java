
class Journal extends LibraryItems {

	private String publisher;

	Journal (int ID, String title, int year, String publisher) {
		super (ID, title, year);
		this.publisher = publisher;
	}
	
	 String getPublisher () {
			return publisher;
		}
}