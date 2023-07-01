package My_Programs;

import java.util.Arrays;

public class Passing_in_Functions {

	public static void main(String[] args) {
		System.out.println("The elements of array are :");
		int[] nums = {1,2,3,4} ;
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));
	}
	static void change(int[] arr) {
		arr[1]= 99;
	}
}
//Remember in java we only have call by value.
/*nums is basically a ref var i.e pointing the array type of objs.
 objs are {1,2,3,4}.Now the copy of ref var nums i.e arr is passed through
 the change function.ref var name in function is arr but it poiinting to 
 the same obj
 we are changing the value of arr[1].so we can see here the original ref var arr[1] 
 value is also changed.Because both ref var pointing to same obj.
  This is we called as mutability or mutable behaviour.
		so strings are immutable in java
		arrays are mutable in java
		mutable means in simple terms we can change the obj.*/
