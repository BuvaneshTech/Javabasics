package Assignment_123;

// WAP for try and catch for Arthimetic Exception

public class Try_Catch {

	public static void name() {
		try {
			int a = 1 / 0;
		} catch (ArithmeticException a) {

			System.out.println("try catch working as expected");
		}
		finally {
			System.out.println("Hi");
		}

	}

	public static void main(String[] args) {

		name();

	}

}
