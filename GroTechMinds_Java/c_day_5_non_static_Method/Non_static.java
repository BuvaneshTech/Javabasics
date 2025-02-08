package c_day_5_non_static_Method;

/*if there is no statiuc keyword in a method name then 
it is considered as a non static method*/

// we have to create a object to call non static in main method with ref variable and method name

public class Non_static {

	public void nonstatic() {

		String name = "Kishore";
		System.out.println(name);

	}

	public static void main(String[] args) {

		Non_static a = new Non_static();
		a.nonstatic();

	}

}
