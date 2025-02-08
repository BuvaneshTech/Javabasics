package t_day_20_StringClass;

/*matches is used in java in diff 
ways for ex we can check the starting and ending of a char is equals in a string*/

public class F_matches {

	public void mat() {

		String name = "Kishore";
		boolean out = name.matches(".......");// regix function

		System.out.println("To check the no of index matches using regix" + " " + out);

		// to check string ends with e ((.*)e)

		boolean a = name.matches("(.*)e");

		System.out.println(a);

		// to check string starts with k

		boolean b = name.matches("k(.*)");
		System.out.println(b);

	}

	public static void main(String[] args) {

		F_matches a = new F_matches();
		a.mat();

	}

}
