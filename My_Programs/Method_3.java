package My_Programs;
import java.util.Scanner;
public class Method_3 {

	public static void main(String[] args) {
		swap();
	}
	//Swap two numbers
  static void swap() {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a ;");
	  int a = sc.nextInt();
	System.out.println("Enter the value of b :");
	  int b = sc.nextInt();
System.out.println("Before swapping value of a and b are :"+a+" "+b);  
	 
	 //Swap code
	  int temp =a;/*value of a now assign to temp.
	  so now a is not having any value*/
	  a = b;/*Now value of b is going to assign to a.
	  so Now b is not having any value.So now value of a is 20. */
	  b = temp;/*Now value of temp i.e 10 is now going to assign
	  over b.So now temp is not have any value and value of b is 10.
	  
	  so value of a and b is swapped.*/
	  
System.out.println("After swapping the value :"+a+" "+b);	  
  }
}
