package knowledgebase;

import java.util.Arrays;

/**'
 * one of the three search algorithm need to know in AP Exam.
 * it is a search-and-swap algorithm.
 * 
 * {8, 6, 10, 2, 4}
 * 
 * 1. i=position: start from begining
 * 2. compare current value with all others to find minimun
 * 3. swap the min to current.
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {4, 10, 1, 2, 6, 7, 3, 5};
		System.out.println(Arrays.toString(a));
		selectionSortl(a);
	}
	
	public static void selectionSortl (int[] numbers) 
	{
		int compairs = 0;
		for (int i = 0; i< numbers.length - 1; i++ ) {
			int position =i; 
			for (int k = i + 1; k < numbers.length; k++) {
				compairs++;
				if (numbers [k] < numbers [position] ) {  // independent from original status
					position = k; 
				}
			}
			int temp = numbers [i] ;   // swap
			numbers[i] =numbers[position] ; 
			numbers [position] = temp; 
			System.out.println(Arrays.toString(numbers));
		}
		System.out.println(compairs);
	}

}
