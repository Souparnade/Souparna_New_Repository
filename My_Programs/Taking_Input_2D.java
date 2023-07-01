//program for matrix or taking input from user in 2D array
package My_Programs;
import java.util.Scanner;
import java.util.Arrays;
public class Taking_Input_2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*we know that in 2D array we have 2 ref var i.e row,col.so we 
 have to take very 2 input for row and column.*/
		System.out.println("Enter the row size of array :");
		int row = sc.nextInt();
		System.out.println("Enter the coloumn size of array :");
		int col = sc.nextInt();
		//Now we have to make a 2D array
  int[][] arr_2D = new int[row][col];//now we made an empty array
		//Now for input in array we are going to use for loop
  System.out.println("Enter the elements of the array :" );
  for(int i=0; i<arr_2D.length; i++) {
	  
	  for(int j=0; j<arr_2D[i].length; j++) {
		   arr_2D[i][j] = sc.nextInt();
	  	  }
       }
  System.out.println("The 2D array is :");
  for(int i=0; i<arr_2D.length; i++) {
	  
	  for(int j=0; j<arr_2D[i].length; j++) {
		  	System.out.print(arr_2D[i][j] +" ");
	  		}
	  System.out.println();
        }
  
	}

}
