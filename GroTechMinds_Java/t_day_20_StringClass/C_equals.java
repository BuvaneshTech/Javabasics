package t_day_20_StringClass;

public class C_equals {

	public void method1() {

		String name = "BUVANESH";

		String name1 = "buvanesh";
		System.out.println("In method 1 we will get both are not equal becuase String name is "
				+ "in capital letter and streaing name1 is small letter");

		if (name.equals(name1)) {

			System.out.println("bot are equal");
		} else {
			System.out.println("both are not equal");
		}

	}

	public void method2() {
		String name = "kishore";
		String name1 = "kishore";
		System.out.println("In method 2 we will get both are equal becuase String name is "
				+ "in small letter and string name1 is also in small letter");

		{
			if (name.equals(name1)) {

				System.out.println("bot are equal");
			} else {
				System.out.println("both are not equal");
			}

		}

	}

	public static void main(String[] args) {

		C_equals a = new C_equals();
		a.method1();
		a.method2();

	}

}
