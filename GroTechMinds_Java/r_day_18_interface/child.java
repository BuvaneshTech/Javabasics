package r_day_18_interface;

public class child implements parent_1,Parent_2 {

	@Override
	public void mob() {
		System.out.println("A_Hello i am mobile");
		
	}

	@Override
	public void login() {
		System.out.println("hello click me to login");
		
	}
	
	public static void main(String[] args) {
		child a = new child();
		a.mob();
		a.login();
	}

}
