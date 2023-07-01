package My_Programs;
import java.util.Scanner;
public class Method_2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Stricker name :");
String naam = sc.next();
String ans_2 = football(naam);
System.out.println(ans_2);

int ans = sum3(20,30);//arguments
System.out.println(ans);

String ans_1 = happy("Mia Khalifa");
System.out.println(ans_1);
	}
/*we don't wants to write scanner statement
again again.we wants to pass the value of 
num1 and num2 when we are calling the function.*/

/*pass the value of numbers(num1,num2)when you are
calling the method in main().we can do this via
parameters.*/
	static int sum3(int a,int b) {
/*According to order of passing value of a and b.
a will be replaced by 20 and b will be replaced 
by 20.*/
		int sum = a+b;
		return sum;
	}
	
	static String happy(String name) {
	String porn = "Jonny sins " + name;
	return porn;
	}
	
	static String football(String Stricker) {
		String goal = "1000 goals " + Stricker;
		return goal;
	}

}
