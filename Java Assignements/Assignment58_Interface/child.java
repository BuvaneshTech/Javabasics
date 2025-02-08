package Assignment58_Interface;

public class child implements Parent{

	@Override
	public void ford() {
		
		System.out.println("i am ford");
		
		
	}

	@Override
	public void mahindra() {
		System.out.println("i am mahindra");
		
	}

	@Override
	public void hero() {
		
		System.out.println("I am hero");
		
		
	}
	
	public static void main(String[] args) {
		child a = new child();
		a.ford();a.mahindra();a.hero();
	}

}
