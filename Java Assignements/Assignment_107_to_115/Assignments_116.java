package Assignment_107_to_115;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


// WAP for HashMap to Map

public class Assignments_116 {
	
	public static void name() {
		
		
		HashMap<String, String> a = new HashMap<String, String>();
		
		a.put("name", "Buvan");
		a.put("name1", "Sireesha");
		a.put("name2", "Kishore");
		a.put("name3", "Rohith");
		System.out.println(a.size());
		System.out.println(a);
		
		
		Map b = new HashMap();
		
		System.out.println("Upcasting");
		System.out.println(b.isEmpty());
		b.put("Hello", "World");
		b.put("student", 1);
		b.put("Student2", 2);
		System.out.println(b);
		//b.putAll(a);
		System.out.println(b);
		
		for(  Object key: b.keySet()) {
			System.out.println(key);
			
		}
		for(Object value : b.values()) {
			System.out.println(value);
			
		}
		/*for(Object entry :b.entrySet()) {
			System.out.println(entry);
			
		}*/
		
		//Set accepts iterator
		
		Set<Entry<Object,Object>> c = b.entrySet();
		
		Iterator<Entry<Object, Object>> it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

		
		
		
		
		
	}

	public static void main(String[] args) {
name();
	}

}
