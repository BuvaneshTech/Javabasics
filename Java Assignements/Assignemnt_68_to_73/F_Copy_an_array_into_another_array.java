package Assignemnt_68_to_73;

import java.util.Arrays;

public class F_Copy_an_array_into_another_array {

	public static void name() {

		int nam[] = new int[3];
		nam[0] = 45;
		nam[1] = 35;
		nam[2] = 25;

		int name1[] = new int[nam.length];

		for (int i = 0; i < nam.length; i++) {

			name1[i] = nam[i];

		}
		System.out.println(Arrays.toString(nam));
		System.out.println(Arrays.toString(name1));

	}

	public static void main(String[] args) {
		name();

	}

}
