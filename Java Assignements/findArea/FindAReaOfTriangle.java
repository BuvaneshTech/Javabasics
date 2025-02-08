package findArea;

import java.util.Scanner;

public class FindAReaOfTriangle {
	
	void tri() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values of breadth");
		int breadth = s.nextInt();
		System.out.println("Enter the value of height");
		int height = s.nextInt();
		
	
	float Area_Of_triangle_Formula = 0.5f*breadth*height;


	System.out.println("The area of triangle is " + Area_Of_triangle_Formula);
	
	}
	

	public static void main(String[] args) {
		
		FindAReaOfTriangle a = new FindAReaOfTriangle();
		a.tri();

	}

}
