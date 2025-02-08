package Assignemnt_68_to_73;

import java.util.Arrays;
import java.util.Scanner;

public class E_Print_arrays_in_reverse_order {

	public static void name() {

		String name[] = new String[3];

		Scanner a = new Scanner(System.in);
		
		System.out.println("kindly enter the values");
		
		for(int i = 0; i<name.length;i++) {
			name[i]= a.next();
			
		}
		
		System.out.println(Arrays.toString(name));
		for(int  i = name.length-1;i>=0;i--) {
			
			System.out.println(name[i]);
			
		}
	

	}

	public static void main(String[] args) {
		
		name();

	}

}
