
public class Competition {

	public static void main(String[] args) {
		checkPosition(56);
	}

	public static void checkPosition(int position) {

		for (int i = 1; i <= 100; i++) {

			if ((i < position && i > 0) || (i > position && i <= 100)) {

				if (i == 11 || i == 12 || i == 13) {
					System.out.println(i + "th");
				} else if (i % 10 == 1) {
					System.out.println(i + "st");
				} else if (i % 10 == 2) {
					System.out.println(i + "nd");
				} else if (i % 10 == 3) {
					System.out.println(i + "rd");
				} else
					System.out.println(i + "th");
			}
		}
	}
}
