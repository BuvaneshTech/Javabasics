package e_day_7_conditional_Statement_operator;

public class B_if_elseIF {
	
	public void con() {
		
		String name = "hello";
		String nam = "Buvan";
		
		if(name.equals("HELLO")) {
			System.out.println("Executing conditon 1");

			System.out.println("Both are not same");
			
		}
		else if(name.equals(nam)) {
			System.out.println("Executing conditon 2");

			System.out.println("name and nam are equal");
			
		}
		else if(name.equals("hello")&& nam.equals("Buvan")) {
			System.out.println("Executing conditon 3");
			System.out.println("Both are same");
		}
		else {
			System.out.println("Failed");
			
		}
	}

	public static void main(String[] args) {
		
		B_if_elseIF a = new B_if_elseIF();
		a.con();

	}

}
