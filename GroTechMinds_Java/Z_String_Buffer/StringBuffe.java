package Z_String_Buffer;

public class StringBuffe {

	
	  StringBuffe() {	
		StringBuffer c = new StringBuffer("Buvanesh ");
		//c.append("is learning java");
		System.out.println(c);
		
		// character at index 
		
		System.out.println("Character at index  "+" "+c.charAt(0));	
		System.out.println("String at index"+" "+c.indexOf("B"));
		System.out.println("Lenght of string "+" "+c.length());
		System.out.println("Reverse a StringBuffer"+" "+c.reverse());
		System.out.println(c.reverse());
		System.out.println(c.substring(5));
		System.out.println(c);
		//System.out.println(c.delete(3, 8));
		System.out.println("To get its class "+" "+c.getClass());
		System.out.println(c);
		System.out.println(c.substring(2, 8));
		System.out.println(c.append("Kishore"));
		System.out.println(c.insert(9, " "));

	}   
		public static void main(String[] args) {	
			new StringBuffe();
			
		}
		
	
}