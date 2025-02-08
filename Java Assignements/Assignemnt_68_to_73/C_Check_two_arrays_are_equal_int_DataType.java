package Assignemnt_68_to_73;

import java.util.Arrays;
import java.util.Scanner;

public class C_Check_two_arrays_are_equal_int_DataType {

	public static void name() {

		int mark[] = new int[3];
		int mark1[] = new int[3];

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values");
		for (int i = 0; i <= 2; i++) {
			mark[i] = s.nextInt();
			mark1[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(mark));
		System.out.println(Arrays.toString(mark1));

		if (mark.equals(mark1)) {
			System.out.println("Both are equal");

		} else {
			System.out.println("Both are not equal");
		}

	}

	public static void main(String[] args) {
		name();
	}
}
