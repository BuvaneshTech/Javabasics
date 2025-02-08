package Assignment_107_to_115;

import java.util.Hashtable;

/* 115.WAP to find out the Properties of HashTable and check whether it accepts indexing,duplicate keys, 
duplicate values, 

any number of nulls in Key and any number of nulls in Value*/

public class Assignments_115 {
	public static void name() {
		
		
		Hashtable a = new Hashtable();
		a.put("name", "Buvan");
		a.put("name1", "Buvan");
		a.put("name2", "Kishore");
		a.put("name3", "rohith");
		// checking indexing
		System.out.println(a);
		//checking duplicate keys
		a.put("name3", "Kishore");
		System.out.println(a);// it does not allow duplicate keys
		//checking duplicate values
		a.put("name4", "Buvan");
		System.out.println(a); // // it allows duplicate values
		
		// checking it accepts null in keys
		/*
		 * a.put(null, "Buvan"); System.out.println(a);
		 */// it does not allow null in keys 
		
		/*
		 * // checking it accepts null in values a.put("name5", null);
		 * System.out.println(a);
		 */// checking it accepts null in values
		
		
	}

	public static void main(String[] args) {
		name();

	}

}
