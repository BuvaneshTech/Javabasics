package Assignment_107_to_115;

import java.util.HashMap;

/*114.WAP  to findout the Prpoerties of HashMap  and check whether 
it accepts indexing,duplicate keys, 
duplicate values, any number of nulls in Key and any number of nulls in Value*/

public class Assignments_114 {

	public static void name() {

		HashMap a = new HashMap();
		a.put("name", "Buvanesh");
		a.put("name1", "Sireesha");
		a.put("name2", "Kishore");
		a.put("name3","kannam");
		a.put("name4","kannam");
		
		// checking nulls in keys
		a.put(null, "rohith");
		a.put(null, "rohit");

		// checking null in values
		a.put("stu", null);
		a.put("stu1", null);
		a.put("stu2", null);
		
		System.out.println("hash map will not allow Indexing"+" "+a); 
		System.out.println("hashmap does not allow duplicate keys"+" "+ a);
		System.out.println(a);
		System.out.println("hashmap allow duplicate values");
		System.out.println("hashmap will allow only one null in key"+" "+ a);
		System.out.println("hashmapo will allow multiple null values"+" "+ a);
		
		
		
		
	}
	public static void main(String[] args) {
		name();
		
	}

}
