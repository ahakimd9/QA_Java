class Book extends LibraryItems {

	private long ISBN;
	private int pages;
	private String author;
	private String language;
	
	private boolean boot = true;

	Book (int ID, String title, int year, long ISBN, int pages, String author, String language) {
		super (ID, title, year);
		this.ISBN = ISBN;
		this.pages = pages;
		this.author = author;
		this.language = language;
	}
	
	 long getISBN () {
			return ISBN;
		}
	 
	 int getPages () {
		 return pages;
	 }
	 
	 String getAuthor () {
		 return author;
	 }
	 
	 String getLanguage () {
		 return language;
	 }

}