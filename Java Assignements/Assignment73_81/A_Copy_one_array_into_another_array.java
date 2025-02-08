package Assignment73_81;

import java.util.Arrays;

public class A_Copy_one_array_into_another_array {

	public static void name() {

		String name[] = new String[3];
		name[0] = "Kishore";
		name[1] = "Buvanesh";
		name[2] = "Akila";
		
		String name1[] = new String[name.length];
		for(int i = 0;i<name.length;i++) {
			
			 name1[i] = name[i];
			
		}
		System.out.println(Arrays.toString(name1));
	}

	public static void main(String[] args) {
		name();

	}

}
