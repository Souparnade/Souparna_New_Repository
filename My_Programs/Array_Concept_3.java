package My_Programs;
import java.util.Scanner;
import java.util.Arrays;
public class Array_Concept_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*We can imagine 2D array as a matrix.
		       1 2 3
		       4 5 6
		       7 8 9
		 */
		
		/*defining 2D array
		int[][] arr = new int[3][3];//{row][column]
		Number of columns doesn't need to be specified.
		But no of rows must needs to be specified.*/
		
		/*Directly if we wants to store elements then,
		   int[][] arr = {
		        {1 3 5},
		        {2 3 4},
		        {6 7 8}
		   };
		 */
		
		/*In c,c++ 2D arrays also Continious memory allocation.*/
		
		
		/*STACK:									HEAP:
							
	arr(ref_var]  ------------------------  [ 
	                                          
//ref var pointing towards objs in           0_index is an array
  heap memory                                   itself 
 												[1,2,3],		
 Imagine this as an array of arrays.         1_index is an array 
                                                 itself
					                            [4,5,6],
				                			 2_index is an array 
				                			     itself
												[7,8,9]	
													    ]
		                                                   */
	/*Internally total we have total three internal arrays objs.
		[1,2,3] obj has in some other part of the heap
		[4,5,6] obj has in some other part of the heap
		[7,8,9] obj has in some other part of the heap
		
		we can acces these three arrays according to their
		ref var like arr[o](it means o_index_no. means 1st row)
		 means [1,2,3]    Now, arr[1] = [4,5,6]*/
		 
		/* if we say arr[1][0] 
		
		            arr[1][0] means the ist index of this array 
		   1 2 3      itself an arrsy i.e [4,5,6] and 0th index
		   4 5 6      means the 0_index no. element of [4,5,6] array
	       7 8 9      that is 4.
	              */
		
	/*Number of column doesn't need to be specified
	 Explanation:	Because every individual array obj in a 2d array
	 can have different no. of column.
	 ex:(1)
	 Below 2d array has total 3 individual arrays i.e. [1,2,3],
	 [4,5,6],[7,8,9].
	 [1,2,3] array has total 3 columns.
	 [4,5,6] array has total 3 column.
	 [7,8,9] array has total 3 column.
	 1 2 3
	 4 5 6
     7 8 9
     
     ex(2):
     1 2 3
     4 5
     6 7 8 9
     In this case we total 3 individual arrays, i.e. [1,2,3],[4,5].
     [6,7,8,9].
     [1,2,3] array has total 3 columns.
     [4,5] array has total 2 columns.
     [6,7,8,9] array has total 4 columns.
	 */
		
		int[][] arr_1 = {// no error
		        {1,2,3},//0th index
		        {4,5,6},//1st index
		        {7,8,9}//2nd index -> arr_1[2] = [7,8,9], 
		               //arr_1[2][0] = 7.
		   };
int[][] arr=new int[3][3];//no error with column and row mentioned.
int[][] arr_2 = new int[3][];//no error without column mentioned.
int[][] arr_3 = {// no error detected with different no. of columns
        {1,2,3},
        {4,5},
        {6,7,8,9}
   };
//so every individual array can have different size.

//Taking Input from user of 2D array
  /*we will run a for loop for every index.we will say 1st fill the
    1st particular array ,next 2nd row or 2nd array and so on.
    In 1d array we are doing this [for (int i=0;i<arr_3.length;i++)]
    for an entire array.
     Now we have to do this here for every individual array.*/

int[][] arr_2D = new int[3][2];
System.out.println(arr_2D.length);
System.out.println("Enter the elements of 2D array : ");
/*when we print System.out.println(arr_2D.length);then it gives the
no. of rows.*/

//Input
	for(int row=0; row<arr_2D.length; row++) {
		//for every row in each column we wants to take the input
		/*size of the column varying for every particular index of
		the array.Every array of that row is length of that array*/
		for(int col=0; col<arr_2D[row].length; col++) {
			arr_2D[row][col] = sc.nextInt();
		}
	}

//output method (1)
	for(int row=0; row<arr_2D.length; row++) {
		
		for(int col=0; col<arr_2D[row].length; col++) {
			System.out.print(arr_2D[row][col]+ " ");
		}
			System.out.println();
	}
	System.out.println();
	
/*output method (2) using toString()method via passing every 
	individual array.Instead of using entire internal for loop 
	we can use toString()method.*/
	for(int row=0; row<arr_2D.length; row++) {
		System.out.println(Arrays.toString(arr_2D[row]));
	}
	System.out.println();

//output method (3)	
/*Enhanched for loop method :
 In this case every element of arr_2D is an data type of array.Like
 [1,2]=array, [2,3]=array.so from this we can write,that's why after
 int [] is written.*/	

      for(int[] num : arr_2D) {
    	  System.out.println(Arrays.toString(num));
      }
      
      //iterating just for ,enhanched for loop
 /*String[] arr = new String[5];
    for(String num : arr){
      System.out.printin(num);
     }
  */
	}

}
