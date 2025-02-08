package SuperCallingStatement;


/*super calling statement is defaultly present whenever we create a constructor
Two types of super calling statement are there
parameterized super calling statement 
Non parameterized super calling statement*/



/*super calling statement is using java to 
call the parent class constructor from child class constructor*/

class Second  {
	 
	  Second() {
		  System.out.println("i am second"); 
	  } 

}


 public class Super_key extends Second{
	
	
	Super_key(){
		System.out.println("I am first");
	}
	
public static void main(String[] args) {
		
		new Super_key();
}

 }
	
 

 


