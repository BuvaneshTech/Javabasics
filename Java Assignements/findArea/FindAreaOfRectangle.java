package findArea;

import java.util.Scanner;

public class FindAreaOfRectangle {
	
	void rec() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of length");
		int length = s.nextInt();
		
		System.out.println("Enter the value of Width");
		int width = s.nextInt();
		
		double AreaOfRectangle = length*width;
		
		System.out.println("The are aof rectangle is "+ AreaOfRectangle);
		
	}

	public static void main(String[] args) {
		
		FindAreaOfRectangle a = new FindAreaOfRectangle();
		a.rec();

	}

}
