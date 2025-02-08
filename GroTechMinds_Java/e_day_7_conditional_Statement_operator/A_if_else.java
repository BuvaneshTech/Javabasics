package e_day_7_conditional_Statement_operator;


// if else is a conditional statement used in java and other programming olanguages as well

public class A_if_else {
	
	public static void add() {
		String name = "Buvanesh";
		
		if(name.equals("Buvanesh")) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
	}
	

	public static void main(String[] args) {
		A_if_else a = new A_if_else();
		a.add();

	}

}
