package String_Functions;

public class F_trim {
	
	
	public void name() {
		
		String a = "Sireesha          ";
		String b = "            kannam";
		String c = "            Sireehsa  kannam           ";
		
		System.out.println(a.trim());
		System.out.println(b.trim());
		System.out.println(c.trim());
		
	}

	public static void main(String[] args) {
		F_trim a = new F_trim();
		a.name();

	}

}
