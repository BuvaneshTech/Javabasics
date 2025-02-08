package ZA_EXception_handling;

public class A_ExceptionsHandling {
	
	public static void name() {
		
		
		try {
			int b = 1/0;
	    System.out.println(b);
		}
		catch(ArithmeticException a) {
			System.out.println("Hello");
			
			
		}
	
	
	
	
	}
	

	public static void main(String[] args) {
		
		name();

	}

}
