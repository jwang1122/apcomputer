package knowledgebase;

import java.util.Arrays;

public class BinarySearch {

	public static void search(int[] nums, int target) { // binary search, the array must to be ordered
		int front= 0, back = nums.length - 1, middle = 0;
		boolean isFound= false;
		while ( (front <=back) && ( !isFound))
		{
		    middle = (front + back) / 2;
		    if (nums[middle] < target) 
		    {
		        front = middle + 1; 
		    }
		    else if (nums [middle] >target) 
		    {
		        back = middle-1; 
		    }
		    else 
		    {
		        isFound= true; 
		    }
		}  		
	    if (isFound) 
	    {
	        System.out.println( "Found at "+ middle);
	    }
	    else 
	    {
	        System.out.println ("Target Not Found"); 
	    }
	}
	public static void main(String[] args) {
		int[] nums = {2,4,45,6,3,61,75,56,21,32};
		Arrays.sort(nums);
		search(nums, 61);
		System.out.println(Arrays.toString(nums));

	}

}
