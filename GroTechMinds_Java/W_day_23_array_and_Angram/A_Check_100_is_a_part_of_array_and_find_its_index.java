package W_day_23_array_and_Angram;

public class A_Check_100_is_a_part_of_array_and_find_its_index {

	public static void name() {

		int no[] = new int[3];
		no[0] = 45;
		no[1] = 85;
		no[2] = 100;
		boolean found = false;

		int notocheck = 100;

		for (int i = 0; i < no.length; i++) {

			if (notocheck == no[i]) {
				System.out.println("Yes 100 is part of array");

				System.out.println("Its index is" + " " + i);
			}

		}

	}

	public static void main(String[] args) {
		name();
	}

}
