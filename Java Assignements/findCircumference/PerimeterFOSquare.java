package findCircumference;

import java.util.Scanner;

public class PerimeterFOSquare {
	
	public static void squ() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of length");
		double length = s.nextDouble();
		
		System.out.println("The perimeter of square is "+ 4*length);
	}

	public static void main(String[] args) {
             squ();
	}

}
