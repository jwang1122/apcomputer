1. Which of the following statements would best describe an efficient design to represent a pair of sunglasses? 

	```
	(A) Three classes: UnfoldGasses, CleanGlasses, and WearGlasses 
	(B) An UnfoldGlasses class with methods CleanGlasses and WearGlasses 
	(C) A PairOfSunglasses class with boolean variables unfolded, cleaned, and worn 
	(D) A PairOfSunglasses class with methods that unfold, clean, and wear the objects in the class 
	(E) A UseSunglasses class with statements that unfold, clean, and wear the sunglasses 
	```
1. Given the following code excerpt:

	```java
		int[] nums = { 11, 22, 33, 44, 55, 66 };
		for (int i = 0; i < nums.length; i++) {
			nums[nums[i] / 11] = nums[i];
		}
		int i = 0;
		while (i < nums.length) {
			System.out.print(nums[i++]);
			if (i != 0 && i<nums.length)
				System.out.print(", ");
		}
		System.out.println();
	```
	```
	(A) 1, 2, 3, 4, 5
	(B) 11, 11, 33, 33, 55, 55
	(C) 11, 11, 22, 33, 44, 55
	(D) 11, 22, 22, 33, 33, 55
	(E) 11, 22, 33, 44, 55, 66
	```
