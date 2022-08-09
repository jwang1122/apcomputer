package com.huaxia.ap2021.quizes;

import java.util.Arrays;

public class Quiz24 {

	public static void main(String[] args) {
		problem1();
		problem2();
		problem3();
		problem4();
		problem5();

	}

	private static void problem1() {
		// All (A)-(D) are possible true depends on target position, so none of them are
		// true.
		// answer is (E)

	}

	private static void problem2() {
		Quiz24 quiz = new Quiz24();
		int[] a = { 2, 3, 4, 6, 21, 32, 45, 56, 61, 75 };
		System.out.println(quiz.findTargetII(a, 21));
		System.out.println(quiz.findTargetIII(a, 21));

	}

	private static void problem3() {
		int[][] num = new int[4][4];
		for (int i = 0; i < num.length; i++) {
			for (int k = 0; k < num.length; k++) {
				num[i][k] = i * k;
			}
			System.out.println(Arrays.toString(num[i]));
		}
	}

	private static void problem4() {
		// TODO Auto-generated method stub

	}

	private static void problem5() {
		// TODO Auto-generated method stub

	}

//	public int findTargetI(int[] a, int target) {
//		for (int x = 0; x < a.length; x++)
//			if (a[x] == target)
//				return x;
//	}

	public int findTargetII(int[] a, int target) { // linear search
		for (int x : a)
			if (a[x] == target)
				return x;
		return -1;
	}

	public int findTargetIII(int[] a, int target) { // binary search
		int f = 0, h = a.length, g = 0;
		for (int i = 0; i < h; i++) {
			g = (f + h) / 2;
			if (a[g] < target)
				f = g + 1;
			else if (a[g] > target)
				h = g - 1;
		}
		if (a[g] == target)
			return g;
		return -1;
	}

}

class School {
	String city;
	double tuition;
//	School(){}
}

class College extends School {
	// private data fields not shown
	public College() {
	}

	// the only constructor in this class
	public College(String town, double tuition) {
		// code not shown
	}
	// other methods not shown
}

class LayAcademyI extends College {
	LayAcademyI(String twn, double tuit) {
//	    super.College(twn, tuit) ; //The method College(String, double) is undefined for the type College
	}
}

class LayAcademyII extends College {
	LayAcademyII(String twn, double tuit) {
	    super(twn, tuit) ; 
	}
}

class LayAcademyIII extends College {
	LayAcademyIII(String twn, double tuit, String st) {
	    super(st, tuit) ; 
	}
}
