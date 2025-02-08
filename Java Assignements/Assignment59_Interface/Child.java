package Assignment59_Interface;

 public abstract class Child implements Parent {
	
	public abstract void add();
	
	public abstract void sub();
	

}

 
 class Child2 extends Child{

	@Override
	public void add() {
		
		System.out.println("Addition");
		
	}

	@Override
	public void sub() {
		System.out.println("Subtraction");
		
		
	}
	
	
	 
 }