package continueKeyword;


// continue is a keyword used to skip a particular line while executinga program

public class Continue_assignment40 {
	
	
	public static void con() {
		for (int i =0;i<10;i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		
		con();

	}

}
