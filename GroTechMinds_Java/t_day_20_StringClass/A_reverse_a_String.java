package t_day_20_StringClass;

public class A_reverse_a_String {

	public void rev() {

		String name = "Buvanesh";
		String name1 = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			char a = name.charAt(i);

			name1 = name1 + a;
			System.out.println(name1);

		}
		System.out.println(name1);

	}

	public static void main(String[] args) {
		A_reverse_a_String a = new A_reverse_a_String();
		a.rev();
	}

}
