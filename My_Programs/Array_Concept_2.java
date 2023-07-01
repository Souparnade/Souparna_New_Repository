package My_Programs;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Concept_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Array of objs
		String[] str = new String[4];
		/*str created in stack.
		 By default str array contains actually 4 ref variables of 4 diff objects.
		 Those objs can stored anywhere in the heap*/
		System.out.println("Enter the four elements :");
		for(int i=0; i<str.length; i++) {
			str[i] = sc.next();
		   }
		System.out.println("The printed four elements are :");
		System.out.println(Arrays.toString(str));
		
		//modify after printing elements
		str[2] = "Rup";
		System.out.println(Arrays.toString(str));	
   }

}
