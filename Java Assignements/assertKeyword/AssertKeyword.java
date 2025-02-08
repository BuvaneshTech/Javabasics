package assertKeyword;

/*Assert is a keyword used to compare  two things ,
if both are not same the program will get terminated 


assert will not be enable in eclipse we need to enable it manually

in run configurations click on arguments and in VM arguments enter -ea and click on run
*/


public class AssertKeyword {
	
	public static void comp() {
		int a = 44;
		int b = 43;
		
			assert a==b;
			System.out.println("A is  b");
	
	}

	public static void main(String[] args) {
		
		comp();

	}

}
