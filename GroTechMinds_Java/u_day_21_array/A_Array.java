package u_day_21_array;

import java.lang.reflect.Array;
import java.util.Arrays;

// arrays are fixed in size
// Theya re homogeneous values

public class A_Array {

	public static void name() {
		int salary[] = new int[5];

		salary[0] = 45000;
		salary[1] = 50000;
		salary[2] = 55000;
		salary[3] = 60000;
		salary[4] = 65000;

		int salary1[] = new int[5];

		salary1[0] = 45000;
		salary1[1] = 50000;
		salary1[2] = 55000;
		salary1[3] = 60000;
		salary1[4] = 65000;

		System.out.println(Arrays.toString(salary));
		System.out.println(Arrays.equals(salary, salary1));
	}

	public static void main(String[] args) {
		name();

	}

}
