package Assignment_119;

// 119.WAP on using Access Specifiers withinthe Class by using  non static methods.

public class Assignment_119 {
	
	public void name() {
		System.out.println("Non static method 1");
		
	}
	public void name1() {
		System.out.println("Non static method 2");
		
	}

	public static void main(String[] args) {
		
		Assignment_119 a = new Assignment_119();
		a.name();
		a.name1();
		

	}

}
