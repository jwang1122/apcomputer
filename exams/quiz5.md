# AP COMPUTER quiz5
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---

1. Which of the following statements would best describe an efficient design to represent a pair of sunglasses? (page 160)

	```
	(A) Three classes: UnfoldGlasses, CleanGlasses, and WearGlasses 
	(B) An UnfoldGlasses class with methods CleanGlasses and WearGlasses 
	(C) A PairOfSunglasses class with boolean variables unfolded, cleaned, and worn 
	(D) A PairOfSunglasses class with methods that unfold, clean, and wear the objects in the class 
	(E) A UseSunglasses class with statements that unfold, clean, and wear the sunglasses 
	```
2. Given the following code excerpt: (page 23)

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
3. Evaluate the following expression: 4 + 6 % 12/4? (page 12)

	```
	(A) 1
	(B) 2
	(C) 4
	(D) 4.5
	(E) 5
	```
4. Which of the following expressions does **not** evaluate to 0.2? (page 12)

	```java
	(A) (1.0 * 2.0) / (1.0 * 10);
	(B) 2.0 / 10;
	(C) (double) 2 / 10;
	(D) (double)(2 / 10);
	(E) Math.sqrt(4) / Math.sqrt(100);
	```
5. Choose the code used to print the following: (page 12)
   
   "Friends"

	```java
	(A) System.out.println(""Friends"");
	(B) System.out.println("//"Friends//"");
	(C) System.out.println("/"Friends/"");
	(D) System.out.println("\"Friends\"");
	(E) System.out.println("\\"Friends\\"");
	```