package Assignemnt_68_to_73;

import java.util.Arrays;
import java.util.Scanner;

public class D_check_two_string_are_equal_ {
	
	public void name() {
		
	
	String name[] = new String[3];
	String name1[] = new String[3];
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the names");
	for(int i = 0; i<=2;i++) {
		name[i] = s.next();
		name1[i] = s.next();
		
	}
	System.out.println(Arrays.toString(name));
	System.out.println(Arrays.toString(name1));
	
	if(name.equals(name1)) {
		System.out.println("Both are equal");
		
	}
	else {
		System.out.println("Both are not equal");
	}
	
	
	}
	public static void main(String[] args) {
		
		
		D_check_two_string_are_equal_ a = new D_check_two_string_are_equal_();
		a.name();

	}

}
