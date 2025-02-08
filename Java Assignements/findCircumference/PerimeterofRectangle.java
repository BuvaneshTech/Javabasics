package findCircumference;

import java.util.Scanner;

public class PerimeterofRectangle {
	
	public static void perim_rec() {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the value of length");
	int length = s.nextInt();
	
	System.out.println("Enter the value of width");
	int width = s.nextInt();
	
	int c = length+width;
	
	
	double perimeter_of_Rectangle = 2*c;
	
	System.out.println("The perimeter_of_Rectangle is "+ perimeter_of_Rectangle);
	}
	

	public static void main(String[] args) {
		
		perim_rec();

	}

}
