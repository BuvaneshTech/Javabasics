package Assignment60_Interface;

public interface Interface_2 extends Interface_1 {
	
	void sub();
	
	

	void add();



	public static void main(String[] args) {
		Interface_2 a = new Interface_2() {
			
			
			@Override
			public void add() {
System.out.println("hello");				
			}
			
			@Override
			public void sub() {
System.out.println("World");				
			}
		};
	}
}
