package String_Functions;

public class E_replace {
	
	public static void name() {
		
		String n = "Kishore";
		// with replace(char old char,char new char)
		System.out.println(n.replace('K', 'I'));
		
		String a = "Sireesha kannam";
		
		// with replace(char sequence target, char sequence replacement )
		System.out.println(a.replace("Sireesha", "Priya"));
		
	}

	public static void main(String[] args) {
		name();

	}

}
