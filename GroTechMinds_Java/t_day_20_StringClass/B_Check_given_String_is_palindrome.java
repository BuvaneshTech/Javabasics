package t_day_20_StringClass;

public class B_Check_given_String_is_palindrome {
	
	
	public void name() {
		
		String a= "MOM";
		String b= "";
		
		for(int i = a.length()-1;i>=0;i--) {
			
			char c = a.charAt(i);
			b = b+c;
			System.out.println(b);
			
		}
		// System.out.println(b);
		if(b.equals(a)) {
			System.out.println("yes it is palindorme");
		}
		else {
			System.out.println("it is not palindrome");
		}
		
				
		
	}
public static void main(String[] args) {
	B_Check_given_String_is_palindrome a = new B_Check_given_String_is_palindrome();
	a.name();
}
}
