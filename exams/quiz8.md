# AP COMPUTER quiz8

Question 29-30 refer to the following code expcerpt.

	```JAVA
	2	ArrayList<Integer> alist5 = new ArrayList<Integer>();
	3	int[] a1 = { 21, 6, 2, 8, 1 };
	4	for (int a : a1) 
	5	{
	6		alist5.add(a);
	7	}
	8	for (int k = 0; k < alist5.size() - 1; k++) 
	9	{
	10		for (int i = 0; i < alist5.size() - 2; i++) 
	11	{
	12			if (alist5.get(i) > alist5.get(i + 1)) 
	13			{
	14				int hold = alist5.remove(i);
	15				alist5.add(i + 1, hold);
	16			}
	17		}
	18	}
	19	System.out.println(alist5);
	```
	
1. How many times will line 12 be executed? 

    ```
    (A) 6 times 
    (B) 12 times 
    (C) 15 times 
    (D) 16 times 
    (E) 20 times 
    ```
2. What will be the final output after the code executes? 

    ```
    (A) [21, 8, 6, 2, 1] 
    (B) [6, 21, 2, 8, 1] 
    (C) [6, 2, 8, 21, 1] 
    (D) [2, 6, 8, 21, 1] 
    (E) [1, 2, 6, 8, 21] 
    ```
3. Given nums—a rectangular, two-dimensional array of integers, choose the code to print the entire array.

	```java
		// I.
		for (int r = 0; r < nums.length; r++) {
			for (int c = 0; c < nums[0].length; c++) {
				System.out.print(nums[r][c] +" ");
			}
			System.out.print("\n") ;
		}

		System.out.println();
		// II.
		for (int[] row : nums) {
			for (int col: row) {
				System.out.print(col +" ");
			}
			System.out.print("") ;
		}
		System.out.println();
		
		// III.
		for (int r = 0; r < nums[0].length; r++) {
			for (int c = 0; c < nums.length; c++) {
				System.out.print(nums[r][c] +" ");
			}
			System.out.print("\n") ;
		}
	```
	```
	(A) I only 
	(B) I and II only
	(C) I and III only 
	(D)II and III only 
	(E) I, II, and III 
	```
	Questions 4-5 refer to the Percussion and Xylophone class below. 
	```java
	public class Percussion {
		private String name;
		private double weight;

		Percussion() {

		}

		Percussion(String n, double w) {
			name = n;
			weight = w;
		}

		public String getName() {
			return name;
		}

		public double getWeight() {
			return weight;
		}
	}

	public class Drums extends Percussion {

	}

	public class Xylophone extends Percussion{
		private int numberOfKeys; 
		Xylophone (String name, double weight, int numberOfKeys) {
			//<missing code>
		}
		
		public int getNumberOfKeys() {
			return numberOfKeys;
		}
	}
	```
4. Which of the following is the most appropriate replacement for <missing code> in the Xylophone constructor?

	```java
	(A) this.numberOfKeys = numberOfKeys;
		super (name, weight);
	(B) super (name, weight);
		this.numberOfKeys = numberOfKeys;
	(C) super (name, weight);
		numberOfKeys = this.numberOfKeys;
	(D) this.numberOfKeys = numberOfKeys;
	(E) numberOfKeys = this.numberOfKeys;
	```
5. Assuming the above classes compile correctly, which of the following will not compile within a client program?

	```java
	(A) Xylophone [] xylophones = new Xylophone [5]; 
	(B) Percussion [] xylophones = new Xylophone [5]; 
	(C) Xylophone x1 = new Xylophone ("xylophone", 65, 32) ; 
		System.out.println(x1.getNumKeys()); 
	(D) Xylophone x2 = new Xylophone ("xylophone", 65, 32); 
		System.out.println(x2.numberOfKeys); 
	(E) Drums[] drums;
	```
