package My_Programs;
import java.util.Scanner;
import java.util.Arrays;
public class Taking_Input_1D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Creating array and inputing the size of the array
		int size;
		System.out.println("Enter the array size :");
		size = sc.nextInt();
		int[] arr_1D = new int[size];
		
		//inputing elements
		System.out.println("Enter the elements of array : ");
		for(int i=0; i<arr_1D.length; i++) {
			 arr_1D[i] = sc.nextInt();
		}
		
		//Output or printing elements using for loop
		System.out.println("The elements of array are :");
		for(int i=0; i<arr_1D.length; i++) {
			 System.out.print(arr_1D[i] + " ");
		}
		//Output or printing elements using toString()method
		System.out.println(Arrays.toString(arr_1D));

	}

}
