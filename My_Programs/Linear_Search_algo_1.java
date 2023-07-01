/*Some definition and points to remember :
  Linear search is one of the techniques for searching some element
  like in a collection of data.Linear search says that start looking
  for your element from first element untill you find the required
  element.So we can search the required element using i.
  
  Time Complexity : Best: Bigo of(1)[o(1)] //const.
  					worst: Bigo of(N)[o(N)]//N= size of array.
  Time Complexity means how your time is going to grow as the input
  will grow.
  Best case for an unsorted array is that the element you are
  searching for is at the 1st index.In that case we don't have to
  search for further that is basically is an ideal case.
  
  Space Complexity :
  Space Complexity basically means are you taking any extra 
  space.Space Complexity is also const.If you wants to search
  through the array are you making another array or are you
  making another copy of that array.This is known as Auxilary space,
  means extra space is being taken.*/

/*Best case :
  i.How many check will the loop make in best case i.e element found 
  at 0th index ?
  arr = [8,9,12,18,.........200 elements]
  target=8
  Ans : it will make only one check or only one comparison for 
  best case. 
  ii. The array is having size of 1 lakh.
    arr = [18,12,9,7,........1lakh items].
    Target = 18
    Here also only one comparison made in best case.
  //So for best case the size of array doesn't matter.That's why time
   Complexity is const here. 
  iii.If we draw a graph where size is in the x axis and Time(ms)
    in the y axis then for 100 elements array the loop will check only
    one comparison and time taken for that only 1ms.for 200 elements
    array the loop will check only one comparison and time taken
    for that only 1ms.So here size of array doesn't matter.The loop
    will check only const amount of time.This is called as Const time
    Complexity.
   
    Worst case :
    i. you do not find the item after checking the entire array.Going
    through every item and at the end it will say that I didn't find
    the item.
    ii. If the size of the array is 100 then it will make 100 
    comparisons.Means the loop will run 100 times and after that it
    will say that the item doesn't exist.
    iii. For 100 comparisons it can make 100 milisec, for 1Lakh
    comparisons it will make 1Lakh milisec.
    iv. If we draw a graph where size is in the x axis and Time(ms)
    in the y axis.Then for worst case we can see the graph forms a
    linear graph,means a single line. 
    from this as an ex we can say that for 500 elements the loop
    will make 500 comparisons in 500ms.
    This is called as Linear Time Complexity.As the size of input
    is growing how my time is growing that is called time complexity.
    v. o(N) means o(N) is the upper bound of the complexity.
    It will never going to go worse that o(N).o(N) means it will
    never go worse than linear.*/

//arr = [18,12,9,14,77,50].
//Q : Find weather 14 exists in the array or not.

//Thinking :
/*we know that we can access any element in the array using index no.
 size=6, so index no. will be starts from 0 and ends at 5.we can use 
 here normal for loop for accessing index no or can use for each 
 loop.
 */

//Logic or algo :
/*when i=0 then we have 18.so is 18=14, no it's not.so move ahead
  now when i=1 then we have 12.so is 12=14, no it's not.so move 
  ahead.now when i=2 then we have 9.so is 9=14, no it's not.
  so move ahead.when i=3 then we have 14.so is 14=14, yes it is.
  so now i will return the index value(Like 14 exists at index no
  3).
  If we don't find the required value then after reaching the end
  of the index.So in that case (no index is avaliable that contains
  the required value).If no value found in that case return -1.
  Because -1 doesn't exists, so when -1 value is returned it means
  the value is not found ,value doesn't exists.*/

package My_Programs;

public class Linear_Search_algo_1 {

	public static void main(String[] args) {
		
		int[] nums = {23,45,1,2,8,19,-3,-10};
		int target = 8;
		int ans = linearSearch(nums,target);
		System.out.println(ans);
	}
	//search in the array : return the index if item found.
	//otherwise if item not found return -1.
	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}//Means the element doen't exist
		
	 //Run a for loop
		for(index=0; index<arr.length; index++) {
		//check for element at every index if it is = target
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
//this line will execute if none of the return statements above have executed
//Hence the target not found.		
		return -1;
	}	
	
}
