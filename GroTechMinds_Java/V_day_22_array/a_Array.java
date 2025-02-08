package V_day_22_array;

import java.util.Arrays;
import java.util.Scanner;

public class a_Array {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int roll[]=new int[3];
		for(int i=0;i<roll.length;i++)
		{
			System.out.println("Please enter the value at index-> "+i);
				roll[i]		=s1.nextInt();

		}
		System.out.print("The new Array at run time is-> ");
		System.out.println(Arrays.toString(roll));
		
		
	}

}
