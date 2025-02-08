package t_day_20_StringClass;

public class D_equals_IgnoreC_ase {
	
	public void comp() {
		
		String name = "Kishore";
		String name1 = "KISHORE";
		
		if(name.equalsIgnoreCase(name1)) {
			System.out.println("Both are equal");
			
		}
		else {
			System.out.println("Both are not equal");
		}
		
		
	}

	public static void main(String[] args) {
		
		D_equals_IgnoreC_ase a = new D_equals_IgnoreC_ase();
		a.comp();

	}

}
