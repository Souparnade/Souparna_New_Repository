package My_Programs;

public class Method_4 {

	public static void main(String[] args) {
		String name = "Cristiano";
/*name and Cristiano both are in heap memory.
name is the ref var pointing to obj kunal.*/
		
		greet(name);
/*when name is passed through greet method the 
 value of name i.e cristiano is passed.Means a copy
 of the value of ref var is passed through another
 ref var naam.So now naam is going to point at 
 the same obj Cristiano.*/		
	}
	
	static void greet(String naam) {
		String siuu = "Always Cr7 "+naam;
		System.out.println(siuu);
	}

}
