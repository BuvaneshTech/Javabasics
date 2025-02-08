package Assignment73_81;

public class E_check_no_of_spaces_in_a_string {

	public static void name() {

		String name = "Kis shore kumar";

		int spaces = 0;

		char[] a = name.toCharArray();

		for (int i = 0; i < a.length; i++) {

			boolean f = Character.isWhitespace(a[i]);

			if (f == true) {

				spaces++;

			}

		}
		System.out.println("The number of spaecs in a string is" + " " + spaces);


	}

	public static void main(String[] args) {
		name();

	}

}
