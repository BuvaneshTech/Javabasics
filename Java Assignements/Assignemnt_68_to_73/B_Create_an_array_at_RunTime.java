package Assignemnt_68_to_73;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;

public class B_Create_an_array_at_RunTime {
	
	public static void GetRunTimeArray() {
		
		String name[] = new String[4];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i<name.length; i++) {
			System.out.println("Enter the name ");
			
			name[i] = s.next();
		}
		System.out.println(Arrays.toString(name));
		
	}
		
	public static void main(String[] args) {
		
		GetRunTimeArray();

	}

}
