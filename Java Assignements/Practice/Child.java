package Practice;

public class Child extends Parent{

	public static void main(String[] args) {
		Child a = new Child();
		/*
		 * a.login(); a.logoff(); a.amazon();
		 */
		a.add();
	}

	@Override
	void logoff() {
System.out.println("Logoff");		
	}

	@Override
	void login() {
		System.out.println("Logoin");		
		
	}

	@Override
	void amazon() {
		System.out.println("Amazon");		
		
	}
	@Override
	void add() {
		super.add();
	}
}
