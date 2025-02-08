package MethodOverriding;

public class ChildClass extends parent_class {
	
	
	public void add() {
		
		super.add();
		System.out.println("I am from child class");
	}

	public static void main(String[] args) {
		
		ChildClass a = new ChildClass();
		a.add();

	}

}
