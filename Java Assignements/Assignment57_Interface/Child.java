package Assignment57_Interface;

public class Child implements ParentClass_1, ParentClass_2 {

	@Override
	public void sub() {
		System.out.println("Subtraction");
	}

	@Override
	public void add() {
		System.out.println("Addition");
	}
	
	
	
	public static void main(String[] args) {
		Child a  = new Child();
		a.add();a.sub();
	}

}
