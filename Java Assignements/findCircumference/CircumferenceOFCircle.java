package findCircumference;

import java.util.Scanner;

public class CircumferenceOFCircle {
	
	void cc() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		
		int radius = s.nextInt();
		
		double pi = Math.PI;
		
		System.out.println("The value of pi is "+ pi);
		
		double Circumference_of_Circle = 2*pi*radius;
		
		System.out.println("The CircumferenceOfCircle is "+ Circumference_of_Circle);
	}

	public static void main(String[] args) {
		
		CircumferenceOFCircle a = new  CircumferenceOFCircle();
		a.cc();

	}

}
