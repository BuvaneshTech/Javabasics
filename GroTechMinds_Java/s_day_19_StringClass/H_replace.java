package s_day_19_StringClass;

/*Replace is a function in java used to replace a word inside a literal*/

public class H_replace {
	
	public static void name() {
		
		String name  = "A_Hello";
		System.out.println(name.replace('H', 'L'));	// replace(oldchar, newchar)
		
		// replace(charseq target, //char sequence replacement)
		System.out.println(name.replace("A_Hello", "kishore"));
		
	}

	public static void main(String[] args) {
		name();

	}

}
