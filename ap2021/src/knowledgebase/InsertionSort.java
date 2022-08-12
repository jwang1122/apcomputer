package knowledgebase;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int a[]= {4, 10, 1, 2, 6, 7, 3, 5};
		System.out.println(Arrays.toString(a));
		insertionSort(a);
	}

	//precondition: x is an array of integers;x.length	>=0
	//postcondition: x is sorted from least to greatest 
	public static void insertionSort (int [] x) {
		for (int i = 1; i < x.length; i++) {
			int temp = x [ i ] ;
			int j = i - 1;
			while( j>=0 && x[j] >temp) {
				x[j+1] = x[j];
				j--;
			}
			x[j+1] = temp;
			System.out.println(Arrays.toString(x));
		}
	}
}
