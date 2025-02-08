package Assignment73_81;

import java.util.Arrays;

public class C_Check_two_string_are_anagram {

	public static void name() {

		String name = "ate";
		String name1 = "tea";
		if (name.length() != name1.length()) {
			System.out.println("It is not an angram");

		} else {
			char[] c1 = name.toCharArray();
			char[] c2 = name1.toCharArray();

			System.out.println("before sorting");

			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));

			System.out.println("After sorting");
			Arrays.sort(c1);
			Arrays.sort(c2);

			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));

			if (Arrays.equals(c1, c2)) {
				System.out.println("They are anagram");
			} 
			else {
				System.out.println("They are not anagram");
			}

		}

	}

	public static void main(String[] args) {
		name();

	}

}
