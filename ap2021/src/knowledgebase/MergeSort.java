package knowledgebase;

import java.util.Arrays;

class MergeSort {
	public static void main(String args[]) {
		int a[]= {4, 10, 1, 2, 6, 7, 3, 5};
		System.out.println(Arrays.toString(a));
		int compares = mergeSort(a, a.length);
		System.out.println(Arrays.toString(a));
		System.out.println(compares);
	}

	public static int merge(int[] left_arr, int[] right_arr, int[] arr, int left_size, int right_size) {
		int compares = 0;
		int i = 0, l = 0, r = 0;
		// The while loops check the conditions for merging
		while (l < left_size && r < right_size) {
			compares++;
			if (left_arr[l] < right_arr[r]) {
				arr[i++] = left_arr[l++];
			} else {
				arr[i++] = right_arr[r++];
			}
		}
		while (l < left_size) {
			arr[i++] = left_arr[l++];
		}
		while (r < right_size) {
			arr[i++] = right_arr[r++];
		}
		return compares;
	}

	public static int mergeSort(int[] arr, int len) {
		int compares = 0;
		if (len < 2) {
			return compares;
		}

		int mid = len / 2;
		int[] left_arr = new int[mid];
		int[] right_arr = new int[len - mid];

		// Dividing array into two and copying into two separate arrays
		int k = 0;
		for (int i = 0; i < len; ++i) {
			if (i < mid) {
				left_arr[i] = arr[i];
			} else {
				right_arr[k] = arr[i];
				k = k + 1;
			}
		}
		// Recursively calling the function to divide the subarrays further
		compares += mergeSort(left_arr, mid);
		compares += mergeSort(right_arr, len - mid);
		// Calling the merge method on each subdivision
		compares += merge(left_arr, right_arr, arr, mid, len - mid);
		return compares;
	}

}