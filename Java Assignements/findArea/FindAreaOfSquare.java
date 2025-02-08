package findArea;

import java.util.Scanner;

public class FindAreaOfSquare {
	
	 FindAreaOfSquare() {
		 
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the value of side");
		 
		 double Square = s.nextDouble();
		 
		 double area_of_Square = Square*Square;
		 
		 System.out.println("The area_of_Square is "+ area_of_Square);
	}

	public static void main(String[] args) {
		
		new FindAreaOfSquare();

	}

}
