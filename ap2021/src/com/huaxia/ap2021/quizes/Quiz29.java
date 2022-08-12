package com.huaxia.ap2021.quizes;

import java.util.Arrays;

public class Quiz29 {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
	}

	private static void question1() {
		int a = 10;
		double b = 10.7;
//		int d = a + b; // double cannot assign to int

	}

	private static void question2() {
		int a[]= {4, 10, 1, 2, 6, 7, 3, 5};
		System.out.println(Arrays.toString(a));
		selectionSortl(a);

	}

	private static void question3() {
		// TODO Auto-generated method stub

	}

	private static void question4() {
		// TODO Auto-generated method stub

	}

	private static void question5() {
		// TODO Auto-generated method stub

	}
	
	//precondition: numbers is an array of ints 
	//postcondition: numbers is sorted in ascending order
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
