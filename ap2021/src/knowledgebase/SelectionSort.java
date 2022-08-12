package knowledgebase;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {4, 10, 1, 2, 6, 7, 3, 5};
		System.out.println(Arrays.toString(a));
		selectionSortl(a);
	}
	
	public static void selectionSortl (int[] numbers) 
	{
		for (int i = 0; i< numbers.length - 1; i++ ) {
			int position =i; 
			for (int k = i + 1; k < numbers.length; k++) {
				if (numbers [k] < numbers [position] ) {
					position = k; 
				}
			}
			int temp = numbers [i] ; 
			numbers[i] =numbers[position] ; 
			numbers [position] = temp; 
			System.out.println(Arrays.toString(numbers));
		}
	}

}
