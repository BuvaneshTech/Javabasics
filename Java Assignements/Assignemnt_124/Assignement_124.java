package Assignemnt_124;

public class Assignement_124 {

	public static void name() {
		
		try {

		int a[] = new int[3];
		a[0] = 45;
		a[1] = 45;
		a[2] = 45;
		a[3] = 45;
		a[4] = 45;
		}
		
		catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("out of bond exception catched");
		}

	}

	public static void main(String[] args) {

		name();

	}

}
