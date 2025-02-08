package continueKeyword;

/*
Write a program to print 1 to 31 numbers and skip 
the given numbers are 4,17,28 by using continue keyword */

public class assignment41 {
	
	public static void con() {
	
	for (int i=0;i<=30;i++) {
		if(i==4 || i==17 || i==28) {
			continue;
		}
		System.out.println(i);
		
	}
	}
	public static void main(String[] args) {
		con();

	}

}
