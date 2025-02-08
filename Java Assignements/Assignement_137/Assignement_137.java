package Assignement_137;

/*// WAP to identify the order of execution for
SIB
IIB
Main method
Constractor*/

public class Assignement_137 {
	
	static {
		System.out.println("I am static block");
	}
	
	// Non static block
	{
		System.out.println("I am non static block");
	}
	// constructor
	Assignement_137()
	{
		System.out.println("I am constructor");
	}
	
// main method
	public static void main(String[] args) {
		System.out.println("I am main method");
		new Assignement_137();
		

	}

}
