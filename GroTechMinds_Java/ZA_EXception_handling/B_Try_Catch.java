package ZA_EXception_handling;

public class B_Try_Catch {
	
	public static void name() {
		try{
		int a = 1/0;
		System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println("1");
		}
		finally {
			System.out.println("Catch got executed");
		}
	}
	
public static void main(String[] args) {
		name();
		

	}

}
