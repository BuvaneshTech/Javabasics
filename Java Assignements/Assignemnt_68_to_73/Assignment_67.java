package Assignemnt_68_to_73;

public class Assignment_67 {

	public static void main(String[] args) {
		
		
		String name ="Rama";
		System.out.println(name.matches("...."));
		String name1 = "Buvanesh Kishore";
		System.out.println(name1.matches("Buvanesh(.*)"));
		System.out.println(name1.matches("(.*)Kishore"));
		
		String SH = "Spider man Bat man";
		System.out.println(SH.matches("(.*)man(.*)"));


	}

}
