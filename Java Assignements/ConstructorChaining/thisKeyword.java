package ConstructorChaining;


/*This is a keyword used in JAVA especially ioin constructor chaining process
parameterized this
Non parameterized this*/

public class thisKeyword {
	
	
	public thisKeyword(int a) {
		this("Kishore", "Buvan");
		System.out.println(a);
	}
	
	public thisKeyword(String a, String b) {
		this(55.55, "Love");
		System.out.println(a);
		System.out.println(b);
		
	}
	public thisKeyword(float a, String b) {
		this(88.556, "Heart");
		System.out.println(a);
		System.out.println(b);
		
	}
	public thisKeyword(double a, String b) {
		
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		
		new thisKeyword(5);

	}

}
