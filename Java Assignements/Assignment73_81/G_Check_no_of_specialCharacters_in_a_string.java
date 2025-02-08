package Assignment73_81;

public class G_Check_no_of_specialCharacters_in_a_string {

	public static void name() {

		String a = "Buvanesh Kishore @$%^& 21";
		int alphabets = 0;
		int spaces = 0;
		int numbers = 0;
		int specialCharacters = 0;

		char[] b = a.toCharArray();

		for (int i = 0; i < b.length; i++) {

			if (Character.isAlphabetic(b[i])) {
				alphabets++;
			} else if (Character.isWhitespace(b[i])) {
				spaces++;

			} else if (Character.isDigit(b[i])) {
				numbers++;

			} else {
				specialCharacters++;
			}
		}

		System.out.println("The nu of alpabets " + " " + alphabets);
		System.out.println("The nu of spaces " + " " + spaces);
		System.out.println("The nu of digits " + " " + numbers);

		System.out.println("The number of special charactesrs are" + " " + specialCharacters);

	}

	public static void main(String[] args) {
		name();

	}

}
