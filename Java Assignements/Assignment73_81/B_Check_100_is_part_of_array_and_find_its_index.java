package Assignment73_81;

import java.util.Arrays;

public class B_Check_100_is_part_of_array_and_find_its_index {

	public static void Arr() {

		int no[] = new int[3];
		no[0] = 45;
		no[1] = 105;
		no[2] = 100;
		

		for (int i = 0; i < no.length; i++) {
			if (no[i] == 100) {

				System.out.println("100 is part of array");
				System.out.println("And its index is" + " "+i);

			}
			else {
				System.out.println("index"+" "+i+"  "+ "is not part of array ");
			}

		}

	}

	public static void main(String[] args) {
		Arr();

	}

}
