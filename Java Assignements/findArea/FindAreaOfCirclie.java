package findArea;

import java.util.Scanner;

public class FindAreaOfCirclie {
	
	void cir() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		
		int radius = s.nextInt();
		
		 double pi= Math.PI;
		
		System.out.println("The value of pi is " + pi);
		
		
		double formula = pi*radius*radius;
		
		System.out.println("The area of circle is "+ formula);
	}

	public static void main(String[] args) {
		FindAreaOfCirclie a = new FindAreaOfCirclie();
		a.cir();

	}

}
