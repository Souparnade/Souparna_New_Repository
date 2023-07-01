package My_Programs;
import java.util.Arrays;
import java.util.Scanner;

public class Array_concept {  //It is the main class

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Q: store a roll number :
		int a = 19;
		
		//Q: store a person's name :
		String name = "Souparna Dey";
		
		//Q: store 5 roll numbers :
		int rno_1 = 29;
		int rno_2 = 34;
		int rno_3 = 89;
		int rno_4 = 23;
		int rno_5 = 67;
		
		/*syntax for java array declaration.
		 datatype[] ref_var name/var name;
		 int [] rnos; 
		 Here basically rnos is getting defined in the stack.So it basically 
		 pointing to a obj.
	     it happens at Compile time.*/
		
		/*syntax for java array initialization.
	rnos = new int [];
	Actually memory creation is happening here.rnos i.e an array type obj 
	is being created in the heap memory using new keyword.
	It happens at run time or execution time.This is called as 
	Dynamic memory allocation(At run time memory is allocated).*/
		
		/*Combining together both line
	datatype[] ref_var name/var name = new datatype[size];
	int[] rnos = new int [5];//rnos is pointing to a array obj that 
	contains type int elements.
	// or directly
	int [] rnos_1 = {23,22,24,26,25};
	There is a big difference between java and c++ array declaration syntax
	int dost[5];[c++ array declaration].*/
		 
	/*In C,C++ array is like a continuous memory allocation(Like the element 
	 address will be (100,104,108,112,116 etc.) 
	Continious means blocks are allocated one by one,not like something is 
	missing in between objs.
	In java memory location of array is depend upon JVM, means if the array is 
	continious or not.
JLS(Java Language specification)mentioned that heap objs are not continious.*/
		 
	/*Continious or not depends upon JVM.Heap memory is in JVM
	Array objects are in heap 
	heap is related to DMA.
	heap objs are not continious.
	hence array objs in java may or may not be continious.*/
		
		int[] rnos = new int[5];
		System.out.println("starting value printing");
		System.out.println(rnos[2]);
		//For an integer array it is going to print zero elements by default.
		
		String[] arr_1 = new String[5];
	/*String is an non-primitive data type.Here it is an object type.
	 so string will be having a obj on heap memory.Primitive data types stored 
	 in the stack memory.
	 In arr_1 we have total 5 elements.Each elements are itself is an objects. 
	 Each objects will be stored in differents parts of the memory.
	The ref variable of those five objs will bearr_1[0],arr_1[1],arr_1[2]....etc.
	These ref var will be having by default zero as value.*/
		
		System.out.println(arr_1[0]);
	//Null means it has no data type.We can compare it with python's none.
	/*it is like a special literal(value) means we can assign it to a 
	  non primitive 
	data type but we can't assign to a primitive data type.
	String str = null;(RIGHT)
	int a = null; (WRONG)
	Any reference variable is have by default null type value. */
		
	/*Primitive data types can't be broken down but non-primitive data types 
	 can be broken down ex: 
	string can be broken down into characters*/
		
	/*args is string array that's why it is written as String[] args*/
		
	    //Normally input taken
		//Array of Primitives
		int[] arr_2 = new int[5];
		arr_2[0] = 1;
		arr_2[1] = 2;
		arr_2[2] = 3;
		arr_2[3] = 4;
		arr_2[4] = 6;
		System.out.println(arr_2[4]);
		
		//Input taken using for loops
		
		int size;
		System.out.println("Enter the size of the array :");
		size = sc.nextInt();
		//the size of the array i.e given by user stored in a var called size.
		int [] arr_3 = new int [size];
		//Creating a object type of array of inputed size.
		
		/*Now we need to read input elements of array that is inputed by user.
		 That's why we used for loop, for reading inputed elements.*/
		System.out.println("Enter the elements of arr_3 :" );
		for (int i=0;i<arr_3.length;i++) {
		/*Length is an int var i.e public in the array class.
		 It basically represents the length of 
		  the array*/
			arr_3[i] = sc.nextInt();
		/*So whenever we are going to take a int value as input and it is going 
		 to be stored at i.
		 Initially the value of i will be 0.After that according to given 
		 value of i the output will be print.*/
		}
		
		//(Method_1)for output or printing the elements.
	/*Now for printing every element in the array we have to run another loop.
	  According to the loop the values will be print. 
	  when i = length-1 then the last value will be printed
		 and loop is going to be end.*/
		System.out.println("Printing the elements of the array : ");
		for (int i=0;i<arr_3.length;i++) {
			System.out.println( arr_3[i]);
		}
		/*Here using loop we are printing elements of array by accesing 
		 the index no. of the array.
		 But we can directly get the item as well using an enhanched for loop.*/
		
		//(Method_2)output or printing elements using For each loop	
		for(int num : arr_3) {
			System.out.println(num + " ");
			
		/*for(data_type ref_var :array name){	
		 * for every element in array,print the element
			System.out.println(ref_var);	 
		 *here ref_var represents elements of the array
		}*/
		}
		/*if the index no. value is greater than or equal to length of the 
		 array it represents index_out_of_bound error.*/
		
		//(Method_3)output or printing elements using toString()method
	   //Another way to print the elements of array using toString()method.
			System.out.println(Arrays.toString(arr_3));
		/*Arrays class has a method called as toString().
		 When we give an array to toString() method it basically converts 
		 the array into a string and prints that string.*/
		    
	   }
}