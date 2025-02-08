package Assignment59_Interface;

public interface Parent {
	
	void add();
	void sub();
	
	public static void main(String[] args) {
		Child2 a = new Child2();
		a.add();a.sub();
	}

}
