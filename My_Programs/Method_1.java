/*In java we call functions as methods.Because if
 we have a function in a class we call that a 
 method.*/
package My_Programs;
import java.util.Scanner;
public class Method_1 {

	public static void main(String[] args) {
	/*	
 //Q :Take a input of 2 no.s and print the sum.
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter the 1st no. :");
  int num1 = sc.nextInt();
  System.out.println("Enter 2nd no. :");
  int num2 = sc.nextInt();
  
  int sum = num1+num2;
  System.out.println("The sum of 2 no.s are :" + sum);
	*/
		sum();//function calling
/*Write the name of function and after that we can
call it via brackets.*/
		greeting();
		int ans = sum2();/*Hence sum2 method is
returning a int value of variable sum.sowe can 
store that value in another int type var 
i.e. ans.*/
	System.out.println(ans);
	String greet = display();
	System.out.println(greet);
	}		
/*After displaying the sum if the user want 
 10 times or 100 times wants to input no and 
 wants to check the result of sum.
 Now if we copy paste the above code 10 times 
 or 100 times or 1000 times that will be very 
 inefficient for our code.In that case we can use 
 functions.We can run that function as many times as we want.
 In that case our code will be efficient.*/
/*So function is basically a piece of code that we
can use again and again as per our requirements.*/

	/*Syntax of method :
	 
	 Access modifier return_type name(){
	 	//body
	 	 return statement;
	 }
	 
	 //Simple function :
	   return_type name(){
	    //body
	     return statement;
	   }
	 */
/*If we don't use static function here then 
at the time of calling sum function in main
method it will show error.Because main method
is an static method and if we wants to use 
a method or var which is outside of main method.
But we wants to use it inside of main,in that case
it needs to be static.*/
 static void sum() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 1st no. :");
	int num1 = sc.nextInt();
	System.out.println("Enter 2nd no. :");
	int num2 = sc.nextInt();
		  
	int sum = num1+num2;
	System.out.println("The sum of 2 no.s are :" + sum);
	}
 /*1st main method will run and after that the
 control will go over to sum method and sum will
 run*/
 /*Return type basically means when we call a 
  function then after function's execution the 
  function is going to have some value.
  The value will be something that we written 
  in the function
  so the data type of value is return type and 
  the value which is returned to main method
  is called as returned value.*/
 static void greeting() {
	 System.out.println("Hello world");
 }
 /*Here basically the greeting function will be 
   called but no values will be return at main
   function.*/
 
 //return the int value
 static int sum2() {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st no. :");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd no. :");
		int num2 = sc.nextInt();
			  
		int sum = num1+num2;
		return sum;
		
/*System.out.println("This line will never going
to execute");It means if we put outside something
after return statement in a method that is never
going to execute.It will give error.Because after
returning the value the work of function is over.
That's why this line will never going to execute.*/
 }		
/*Here instead of printing or displaying the sum 
we are going to return the sum.Sum is of type int.
Hence the return type as type integer.*/
		
 //return the String value
	static String display() {
		String people = "Everyone have Hearts";
		return people;
	}
		
 }

