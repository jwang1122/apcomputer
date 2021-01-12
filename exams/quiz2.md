1. A programmer has written two different methods for a client program to swap the elements of one array with those of another array.

	```java
		public static void swap1(int[] a1, int[] a2) {
			for (int i=0; i< a1.length; i++) {
				int arrhold = a1[i];
				a1[i] = a2[i];
				a2[i] = arrhold;
			}
		}
		
		public static void swap2(int[] a1, int[] a2) {
			int[] arrhold = a1;
			a1 = a2;
			a2 = arrhold;
		}
	```
	Which of the following statements best reflects the outcome of the two methods?

	(A) Both methods will swap the contents of the two arrays correctly in all cases.

	(B) swap1 will swap the contens of the two arrays correctly only if both arrays have the same munber of elements whereas swap2 will work correctly for all cases.

	(C) swap1 will only swap the contents of the two arrays correctly if both arrays have the same number of elements, whereas swap2 will never work correctly.

	(D) swap1 will only swap the contents of the two arrays correctly if both arrays have the same number of elements or a2 has more elements, whereas swap2 will work correctly for all cases.
	
	(E) Neither method will swap the contents of the two arrays correctly under any condition.
