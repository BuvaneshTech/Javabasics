package t_day_20_StringClass;

/*contains is a method in function in a java string used to check a 
character sequense is in a string and its returntype is boolean */

public class E_Contains {

	public void name() {

		String name = "Buvanesh Kishore";

		boolean output = name.contains("Kishore");
		
		System.out.println(output);

	}

	public static void main(String[] args) {
		
		E_Contains a = new E_Contains();
		a.name();

	}

}
