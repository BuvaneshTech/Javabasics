package Assignment73_81;

public class F_check_no_of_numbers_in_a_string {

	public static void name() {

		String name = "Buvanesh Kishore @21";

		int num = 0;

		char[] b = name.toCharArray();

		for (int i = 0; i < b.length; i++) {

			boolean d = Character.isDigit(b[i]);

			if (d == true) {
				num++;
			}
		}
		System.out.println("The number of digits in a string is " + " " + num);
	}

	public static void main(String[] args) {
		name();

	}

}
