package knowledgebase;

import java.util.Arrays;

public class BubbleSort {
	static int bubbleSort(int[] arr) {
		int compares = 0;
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				compares++;
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		return compares;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 10, 1, 2, 6, 7, 3, 5 };

		System.out.println("Array Before Bubble Sort");
		System.out.println(Arrays.toString(arr));

		int totalCompares = bubbleSort(arr);// sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(totalCompares);

	}
}
