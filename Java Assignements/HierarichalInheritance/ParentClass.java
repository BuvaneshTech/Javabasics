package HierarichalInheritance;


/*Hierarrichal inheritance means 
multiple childs using propert of parent class*/

public class ParentClass {
	
	public static  void cars() {
		System.out.println("Welcome to showroom"
				+ ""
				+ "  which car youi would like to buy");
		
	}
	
	public static void ford() {
		String name  = "Ford Figo";
		int price  = 450000;
		
		System.out.println("The car name is "+ name);
		System.out.println("The car price is "+ price);
	
	}
	
	
	public static void hyndai() {
		
		String name  = "Hyndai amze";
		int price  = 40000;
		
		System.out.println("The car name is "+ name);
		System.out.println("The car price is "+ price);
		
	}
	
	public static void honda() {
		
		String name  = "Honda city";
		int price  = 50000;
		
		System.out.println("The car name is "+ name);
		System.out.println("The car price is "+ price);
		
	}

}
