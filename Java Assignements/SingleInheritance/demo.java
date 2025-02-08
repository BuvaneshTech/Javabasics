package SingleInheritance;

 class demo {

	demo() {
		System.out.println("I am first");
	}
}

class Second extends demo {

	Second() {
		System.out.println("i am second");
	}

	public static void main(String[] args) {

		new Second();

	}

}
