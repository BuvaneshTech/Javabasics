package Assignment73_81;

import java.util.Arrays;

public class D_Check_no_of_alphabets_in_a_String {

	public static void name() {

		String name = "Buvanesh kishore @ 21";

		int alphabetic = 0;

		char[] a = name.toCharArray();
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {

			boolean b = Character.isAlphabetic(a[i]);
			
			if(b== true){
				alphabetic++;
			}
		}
		System.out.println("The number of alphabets in a string are --->"+ alphabetic);

	}

	public static void main(String[] args) {
		name();

	}

}
