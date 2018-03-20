
class Map extends LibraryItems {

	private String cartographer;
	
	private boolean boot = true;

	Map (int ID, String title, int year, String cartographer) {
		super (ID, title, year);
		this.cartographer = cartographer;
	}
	
	 String getCartographer () {
			return cartographer;
		}
}