package W_day_23_array_and_Angram;

import java.util.Arrays;

public class E_Anagram {

	public static void name() {

		String s = "manish";
		String s1 = "ate";
		if (s.length() != s1.length()) {
			System.out.println("It is not an anagram");

		}

		else {

			char[] c = s.toCharArray();
			char[] c1 = s1.toCharArray();
			System.out.println("before sorting");
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(c1));
			Arrays.sort(c);
			Arrays.sort(c1);
			System.out.println("After sorting");
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(c1));

			if (Arrays.equals(c, c1)) {
				System.out.println("They are anagram");
			} else {
				System.out.println("They are not anagram");
			}

		}

	}

	public static void main(String[] args) {
		name();

	}

}
