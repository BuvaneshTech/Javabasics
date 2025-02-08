package findCircumference;

import java.util.Scanner;

public class CircumferenceOfTriangle {
	
	void tri() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int firstSide = s.nextInt(); 
		
		System.out.println(" Enter the value of b");
		
		int SecondSide = s.nextInt();
		System.out.println(" Enter the value of c");
		int ThridSide = s.nextInt();
		
		
		double CircumferenceOfTriangle = firstSide+SecondSide+ThridSide;
		
		System.out.println("The circumferenceOfTriangle is "+ CircumferenceOfTriangle);
	}

	public static void main(String[] args) {
		
		CircumferenceOfTriangle a = new CircumferenceOfTriangle();
		a.tri();

	}

}
