package W_day_23_array_and_Angram;

import java.util.Arrays;

public class D_find_no_of_alphabets_and_Digits_spaces_in_a_string {

	public static void name() {

		int NoOfAlphabets = 0;
		int NoOfSpaces = 0;
		int NoofDigits = 0;

		String name = "Buvanesh @ 2195";

		char[] d = name.toCharArray();
		System.out.println(Arrays.toString(d));

		for (int i = 0; i < d.length; i++) {

			boolean a = Character.isAlphabetic(d[i]);

			if (a == true) {
				NoOfAlphabets++;

			}
			boolean b = Character.isWhitespace(d[i]);
			if (b == true) {
				NoOfSpaces++;
			}
			boolean c = Character.isDigit(d[i]);
			if (c == true) {
				NoofDigits++;

			}
			
		}

		System.out.println("The numebr of Alphabets in a string are " + " " + NoOfAlphabets);
		System.out.println("The numebr of spaces in a string are " + " " + NoOfSpaces);
		System.out.println("The numebr of digits in a string are " + " " + NoofDigits);

	}

	public static void main(String[] args) {
		name();

	}

}
