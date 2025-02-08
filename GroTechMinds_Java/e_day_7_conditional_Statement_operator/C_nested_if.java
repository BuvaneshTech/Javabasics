package e_day_7_conditional_Statement_operator;

public class C_nested_if {
	
	
	public void krish() {
		
		
		int maths = 45;
		int physics = 88;
		int eng = 90;
		int tam = 66;
		
		if(maths== 45) {
			System.out.println("maths mark is "+" "+maths);
			if(physics == 88) {
				System.out.println("physics mark is "+" "+physics);
				if(eng == 90) {
					System.out.println("English mark is "+" "+eng);
				}
				if(tam == 66) {
					System.out.println("tamil mark is "+" "+tam);
					
				}
				
			}
		}
		else {
			System.out.println(false);
		}
		
	}

	public static void main(String[] args) {

		C_nested_if a = new C_nested_if();
		a.krish();
	}

}
