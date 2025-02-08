package s_day_19_StringClass;

/*trim is a function in astring used to remove additional spaces in front and back of a litertal 
it will not remove the space in between a literal
*/
public class F_trim {

	public static void tri() {

		String a = "        buvanesh";
		String b = "buvanesh            ";
		String name = "       Buvanesh Kishore           ";

		System.out.println("printing example of without using string function trim is below");
		System.out.println(a);
		System.out.println("printing example of without using string function trim is below ");
		System.out.println(b);

		System.out.println("Example of using trim function is below ");
		System.out.println(name.trim());
	}

	public static void main(String[] args) {
		tri();

	}

}
