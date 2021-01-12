# AP Computer Sicence Section I

1. Evaluate the following expression: 4 + 6 % 12/4?
```
(A) 1
(B) 2
(C) 4
(D) 4.5
(E) 5
```
2. Which of the following expressions does **not** evaluate to 0.2?
```java
(A) (1.0 * 2.0) / (1.0 * 10);
(B) 2.0 / 10;
(C) (double) 2 / 10;
(D) (double)(2 / 10);
(E) Math.sqrt(4) / Math.sqrt(100);
```
3. Choose the code used to print the following:
   
   "Friends"
```java
(A) System.out.println(""Friends"");
(B) System.out.println("//"Friends//"");
(C) System.out.println("/"Friends/"");
(D) System.out.println("\"Friends\"");
(E) System.out.println("\\"Friends\\"");
```
4. Determine output of the following code.
```java
	public static void swap(String s1, String s2) {
		String hold = s1;
		s1 = s2;
		s2 = hold;
	}
	
	public static void main(String[] args) {
		String animal1 = "elephant";
		String animal2 = "lion";
		swap(animal1, animal2);
		animal1.toUpperCase();
		animal2.toUpperCase();
		System.out.println(animal1 + " " + animal2);
	}
```

```
(A) elephant lion
(B) ELEPHANT LION
(C) lion elephant
(D) LION elephant
(E) LION ELEPHANT
```

Question 5-6 refer to the Constellation class below:
```java
public class Constellation {
	private String name;
	private String month;
	private int northernLatitude;
	private int southernLatitude;
	
	
	public Constellation(String name, String month) {
		super();
		this.name = name;
		this.month = month;
		northernLatitude = 0;
		southernLatitude = 0;
	}
	
	public Constellation(String name, String month, int northernLatitude, int southernLatitude) {
		super();
		this.name = name;
		this.month = month;
		this.northernLatitude = northernLatitude;
		this.southernLatitude = southernLatitude;
	}

	public void chgMonth(String m) {
		String month = m;
	}
}
```
5. Using Constellation class, which of the following will cause compiler error?
```
(A) Constellation c1 = new Constellation("Hercules", "July");
(B) Constellation c2 = new Constellation("Pisces", "Nov", 90, 65);
(C) Constellation c3 = new Constellation("Aquarius", "Oct", 65.0, 9.0);
(D) Constellation c4 = new Constellation("Leo", "4", 0, 0);
(E) Constellation c5 = new Constellation("Phoenix", "Nov", 32, 90);
```
6. A programmer has attempted to add three mutator methods to use Constellation class.
```java
I: 
```java
	public void chgLatitude(String direction, int latitude) {
		if(direction.toUpperCase().equals("N")) {
			this.northernLatitude = latitude;
		}else if(direction.toUpperCase().equals("S")) {
			this.southernLatitude = latitude;			
		}
	}

```
II:
```java
	public void chgLatitude(int northLatitude, int southLatitude) {
			this.northernLatitude = northLatitude;
			this.southernLatitude = southLatitude;			
	}
```
III.
```java
	public void chgLatitude(double northLatitude, double southLatitude) {
			this.northernLatitude = (int)northLatitude;
			this.southernLatitude = (int)southLatitude;			
	}
```
which of the three will compile without compiler error?
```
(A) I only
(B) II only
(C) III only
(D) I and II only
(E) I, II and III
```
7. Determine the output of the following code.
```java
	int x = 10;
	int y = 5;

	if (x == 10)
		if (y <= 5)
			y++;
		else if (y < 4)
			x = 3;
		else
			y += 6;
	if (y > 5)
	{
		if (x != 10) {
			x = 0;
			y = 0;
		} else
			x = -5;
	}
```
---
```
(A) x = 0, y = 0
(B) x = -5, y = 6
(C) x = 10, y = 5
(D) x = 3, y = 5
(E) None of the above
```
8. A programmer intend to write code to print three word in acending lexicographical order.  Follow the code and determin the printed output.
```java
	String word1 = "frog";
	String word2 = "dog";
	String word3 = "cat";

	if (word1.compareTo(word2) < 0)
		if (word2.compareTo(word3) < 0)
			System.out.println(word1 + " " + word2 + " " + word3);
		else
			System.out.println(word1 + " " + word3 + " " + word2);
	else if (word1.compareTo(word2) > 0)
		if (word2.compareTo(word3) < 0)
			System.out.println(word1 + " " + word2 + " " + word3);
		else
			System.out.println(word1 + " " + word3 + " " + word2);
	else if (word2.equals(word3))
		System.out.println("All the words are the same.");
	else
		System.out.println("Word1 and word2 are duplicated.");

```
```
(A) frog cat dog
(B) cat dog frog
(C) dog frog cat 
(D) frog dog cat
(E) dog cat frog 
```
9. Using following variable declarations, determine which one of the following evaluate to true.
```java
`int temp= 90;
boolean cloudy= false;
  
I. if (temp >= 90 && !cloudy)
II. if (!(temp > 90 || cloudy))
III. if (!(temp >= 90 && !cloudy))
```
```
(A) I only
(B) II only
(C) III only
(D) Two of the above will evaluate to true
(E) All the above will evaluate to true
```
10. Consider the following code
```java
	String dog1 = new String("Poodle");
	String dog2 = new String("Beagle");
	dog1 = dog2;
	String dog3 = new String("Beagle");
	
	if(dog1==dog2) // same box with different label
		System.out.println("dog1 and dog2 are one and the same dog.");
	else
		System.out.println("dog1 and dog2 are not the same dog.");
	
	if(dog1==dog3) // same content with different box and label
		System.out.println("dog1 and dog3 are one and the same dog.");
	else
		System.out.println("dog1 and dog3 are not the same dog.");
	
	if(dog1.equals(dog3)) // same content with different box and label
		System.out.println("dog1 and dog3 are the same breed.");
	else
		System.out.println("dog1 and dog3 are not the same breed.");

```
Which of the following representa the output that will be produced by the code?
```
(A) 
dog1 and dog2 are one and the same dog.
dog1 and dog3 are one and the same dog.
dog1 and dog3 are the same breed.
(B) 
dog1 and dog2 are one and the same dog.
dog1 and dog3 are one and the same dog.
dog1 and dog3 are not the same breed.
(C) 
dog1 and dog2 are one and the same dog.
dog1 and dog3 are not the same dog.
dog1 and dog3 are the same breed.
(D) 
dog1 and dog2 are one and the same dog.
dog1 and dog3 are not the same dog.
dog1 and dog3 are not the same breed.
(E) 
dog1 and dog2 are not the same dog
dog1 and dog3 are not the same dog.
dog1 and dog3 are the same breed.
```

11. Choose the correct option to complete lines 3 and 4 such that str2 will contain the letters of str1 in reverse order.
```java
	String str1 = "banana";
	String str2 = "";
	// 3. missing code
	// 4. missing code 
	{
		str2 += str1.substring(i, i + 1);
		i--;
	}
	System.out.println(str2);

```
```
(A) int i = 0;
	while(i<str1.length);
(B) int i = str1.length();
	while (i >=0);
(C) int i = str1.length() - 1;
	while (i >=0);
(D) int i = str1.length();
	while (i>0);
(E) int i = str1.length() - 1;
	while (i>0)
```
12. Consider the following code excerpt:
```java
		int n = // some integer greater than zero
		int count = 0;
		int p = 0;
		int q = 0;
		for (p=1; p<n; p++)
			for(q=1; q<=n; q++)
				count++;
		System.out.println(count);
```
(A) $n^n$ 

(B) $n^2-1$

(C) $(n-1)^2$

(D) $n(n-1)$

(E) $n^2$

13. Given the following code excerpt, determine the output:
```java
	int x = 0;
	for (int j = 1; j < 4; j++) {
		if (x != 0 && j / x > 0)
			System.out.print(j / x + " ");
		else
			System.out.print(j * x + " ");
	}
```
```
(A) 0 0 0
(B) 0 0 0 0
(C) 1 2 3
(D) 1 0 2 0 3 0
(E) ArithmeticException: Divide by zero
```
14. Consider the following code:
```java
	String space = " ";
	String symbol = "*";
	int num = 5;
	for (int i = 1; i <= num; i++) {
		System.out.print(symbol);
	}
	System.out.println();
	for (int i = 1; i <= num; i++) {
		for (int j = num - i; j > 0; j--) {
			System.out.print(space);
		}
		System.out.println(symbol);
	}
	for (int i = 1; i <= num; i++) {
		System.out.print(symbol);
	}
```
```
(A) *****
	****
	***
	**
	*
	*****
(B) *****
	 ****
	  ***
	   **
	    *
	*****
(C) *****
	    *
	   *
	  *
	*
	*****
(D) *****
	*
	 *
	  *
	   *
	*****
(E) *****
	*
	**
	***
	****
	*****
```
15. What will be printed as a result of the following code excerpt?
```java
	int sum = 0;
	for (int i=1; i<2; i++)
		for(int j=1; j<=3; j++)
			for(int k=1; k<4; k++)
				sum += (i*j*k);
	System.out.println(sum);
```
```
(A) 18
(B) 36
(C) 45
(D) 60
(E) 108
```
16. Consider the following code:
```java
	int j = 0;
	String s = "map";
	while (j < s.length()) {
		int k = s.length();
		while (k > j) {
			System.out.println(s.substring(j, k));
			k--;
		}
		j++;
	}
```
```
(A) map
	ma
	m
	ap
	a
(B) map
	ma
	m
	ap
	a
	p
(C) map
	ap
	p
	ap
	p
	p
(D) m
	ma
	map
	a
	ap
	p
(E) p
	ap
	p
	map
	ma
	m
```
17. A factorial is shown by an exclamation point(!) following a number. The factorial of 5 or 5! is calculated by (5)(4)(3)(2)(1)=120.

Assuming n is an integer greater than 1. Choose the method that will return n!
```java
I. 	public static int f(int n) {
		int factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial *= n;
		}
		return factorial;
	}

II.	public static int f(int n) {
		int factorial = 1;
		int j = 1;
		while (j <= n) {
			factorial *= j;
			j++;
		}
		return factorial;
	}

III.public static int f(int n) {
		if (n == 1)
			return n;
		return n * f(n - 1);
	}
```
```
(A) I only
(B) II only
(C) II only
(D) II and III only
(E) I, II and III
```
18. Given the following code excerpt for the Tile Class:
```java
public class Tile {
	private int styleNumber;
	private String color;
	private double width;
	private double height;
	private String material;
	private double price;
	
	Tile(int style, String col){
		styleNumber = style;
		color = col;
	}
	
	Tile(int style, String col, double w, double h, String mat, double price){
		styleNumber = style;
		color = col;
		width = w;
		height = h;
		material = mat;
		price =price;
	}
	
	Tile(int style, String col, String mat, double price){
		styleNumber = style;
		color = col;
		material = mat;
		price =price;		
	}
	
	public void chgMaterial(String mat) {
		String material = mat;
	}
	
	public String toString() {
		return (styleNumber + " " + color + " " + width + " " + height + " " + material + " " + price);
	}
```
What is the output after the following client code is executed?
```java
	Tile t1 = new Tile(785, "grey", "ceramic", 6.95);
	t1.chgMaterial("marble");
	System.out.println(t1.toString());
```
```
(A) Tile@5ccd43c2
(B) 785 grey 0.0 0.0 marble 0.0
(C) 785 grey 0.0 0.0 ceramic 0.0
(D) 785 grey 0.0 0.0 ceramic 6.95
(E) 785 grey 0.0 0.0 marble 6.95
```
19. What is the output after the followingclient code is executed?
```java
	Tile t2 = new Tile(101, "blue");
	System.out.print(t2);
```
```
(A) Tile@5ccd43c2
(B) 785 blue 0.0 0.0 null 0.0
(C) Type mismatch error
(D) NullPointerException
(E) There will be no output; the program will not compile
```
20. The Tile Class is going to be used for an application built for a small independent tile store. The owner wants the programmer to add a field for the number of unopened boxes of tile he has for each style of tile he has in stock and a method to change the value. What would be the proper declaration for this field?

```java
(A) public static int inventory;
(B) private static double inventory;
(C) final int inventory;
(D) private int inventory;
(E) private int [] inventory;
```
21. Given the following code excerpt:
```java
	int[] nums = {11, 22, 33, 44, 55, 66};
	for (int i=0; i<nums.length; i++)
		nums[nums[i]/11] = nums[i];

```
```
(A) 1, 2, 3, 4, 5
(B) 11, 11, 33, 33, 55, 55
(C) 11, 11, 22, 33, 44, 55
(D) 11, 22, 22, 33, 33, 55
(E) 11, 22, 33, 44, 55, 66
```
22. Given the following code excerpt:
```java
	int[] arr1 = {1, 2, 3, 4, 5, 6};
	int[] arr2 = arr1;
	int last = arr1.length - 1;
	
	for(int i=0; i<arr1.length; i++)
		arr2[i] = arr1[last-i];
	
	for(int i=0; i<arr1.length; i++)
		System.out.print(arr1[i] + " ");
	
	System.out.println(" ");
	
	for (int i=0; i<arr2.length; i++)
		System.out.print(arr2[i] + " ");
```
```
(A) 1, 2, 3, 4, 5, 6
	1, 2, 3, 4, 5, 6
(B) 1, 2, 3, 4, 5, 6
	6, 5, 4, 4, 5, 6
(C) 6, 5, 4, 3, 2, 1
	6, 5, 4, 4, 5, 6
(D) 6, 5, 4, 4, 5, 6
	1, 2, 3, 4, 5, 6
(E) 6, 5, 4, 4, 5, 6
	6, 5, 4, 4, 5, 6
```
23. Given the following code excerpt:
```java
	int[] arr3 = {1, 2, 3, 4, 5, 6};
	
	for (int element : arr3) {
		element *=2;
		System.out.print(element + " ");
	}
	System.out.println("");
	
	for(int element: arr3)
		System.out.print(element + " ");
}
```
```
(A) 1, 2, 3, 4, 5, 6
	1, 2, 3, 4, 5, 6
(B) 2, 4, 6, 8, 10, 12
	1, 2, 3, 4, 5, 6
(C) 2, 4, 6, 8, 10, 12
	2, 4, 6, 8, 10, 12
(D) A compiler error will occur;
(E) A run-time exception will occur;
```
24. Given an array numbers containing a variety of integers and the following code excerpt:
```java
	int holdSmallest = Integer.MAX_VALUE;
	int holdLargest = 0;
	int a = 0;
	int b = 0;
	for(int i=0; i<numbers.length; i++) {
		if (numbers[i] <= holdSmallest) {
			holdSmallest = numbers[i];
			a = i;
		}
		if(numbers[i] >= holdLargest) {
			holdLargest = numbers[i];
			b = i;
		}
	}
	System.out.println(a + " " + b);
```
Determine the statement below that reflects the most successful outcome.

(A) The code will print the smallest and largest values in the numbers array.

(B) The code will print the locations of the smallest and largest values in the numbers array.

(C) The code will print the locations of the smallest and largest non-negative values in the numbers array.

(D) The code will print the location of the smallest value in the numbers array and the largest non-negative value in the numbers array.

(E) The code will print the location of the smallest non-negative value in the numbers array and the largest value in the numbers array. 

25. Choose the missing code below that will accurately find the average of the values in the sales array.
```java
	double avg = 0;
	int i = 0;
	int sum = 0;
	for (int element: sales) 
	// Missing code
```

```java
(A) {
		sum += element;
	}
	avg = (double) sum / sales.length;
(B) {
		sum += sales[i];
	}
	avg = (double) sum / sales.length
(C) {
		sum += sales;
	}
	avg = (double) sum / sales.length
(D) {
		sum += sales[element];
	}
	avg = (double) sum / sales.length
(E) {
		sum += element[sales];
	}
	avg = (double) sum / sales.length
```
26. A programmer has written two different methods for a client program to swap the elements of one array with those of another array.
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

27. Which code has declared and properly populated the given ArrayList?
```java
I. 	ArrayList<String> alist1 = new ArrayList<String>();
	alist1.add("4.5");
II. ArrayList<Integer> alist2 = new ArrayList<Integer>();
	alist1.add((int)4.5); 
III.ArrayList<Double> alist3;
	alist3 = new ArrayList<Double>();
	alist3.add(4.5); 
```
```
(A) I only
(B) I and II
(C) I and III
(D) II and III
(E) I, II and III
```
28. Given the following code excerpt:
```java
	ArrayList<Integer> alist1 = new ArrayList<Integer>();
	int[] a1 = { 2, 4, 6, 7, 8, 10, 11 };
	for (int a : a1) {
		alist1.add(a);
	}
	for (int i = 0; i < alist1.size(); i++) {
		if (alist1.get(i) % 2 == 0) {
			alist1.remove(i); // dangerous
		}
	}
	System.out.println(alist1);
```
```java
(A) [4, 7, 10, 11]
(B) [2, 4, 7, 10, 11]
(C) [2, 7, 10, 11]
(D) [7, 11]
(E) An IndenxOutOfBoundsException will occur
```
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
29. How many times will line 12 be executed? 

```
(A) 6 times 
(B) 12 times 
(C) 15 times 
(D) 16 times 
(E) 20 times 
```
30. What will be the final output after the code executes? 
```
(A) [21, 8, 6, 2, 1] 
(B) [6, 21, 2, 8, 1] 
(C) [6, 2, 8, 21, 1] 
(D) [2, 6, 8, 21, 1] 
(E) [1, 2, 6, 8, 21] 
```
31. Given nums—a rectanglular, but not necessarily square, two-dimensional array of integers, choose the code to correctly print the array:

```java
	int[][] arr2d = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
	String s = "";
	for (int a = 0; a < arr2d[0].length; a++) {
		for (int b = 0; b < arr2d.length; b++) {
			s += arr2d[b][a] + " ";
		}
		s += "\n";
	}
	System.out.print(s);
```
Determine the resulting output. 
```
(A) 1  2 3 4 
	5 6 7 8  
(B) 1 5 2 6
	3 7 4 8
(C) 1 2
	3 4
	5 6
	7 8
(D) 1 5
	2 6
	3 7
	4 8
(E) 1
	2
	3
	4
	5
	6
	7
	8
```
32. Given nums—a rectangular, two-dimensional array of integers, choose the code to print the entire array.
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
Questions 33-34 refer to the Percussion and Xylophone class below. 
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
33. Which of the following is the most appropriate replacement for <missing code> in the Xylophone constructor?
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
34. Assuming the above classes compile correctly, which of the following will not compile within a client program?
```java
(A) Xylophone [] xylophones = new Xylophone [5]; 
(B) Percussion [] xylophones = new Xylophone [5]; 
(C) Xylophone x1 = new Xylophone ("xylophone", 65, 32) ; 
	System.out.println(x1.getNumKeys()); 
(D) Xylophone x2 = new Xylophone ("xylophone", 65, 32); 
	System.out.println(x2.numberOfKeys); 
(E) Drums[] drums;
```
35. A client program wishes to compare the two xylophone objects as follows: 
```java
Xylophone x2 = new Xylophone ("xylophone", 80, 32) ; 
Xylophone X3 = new Xylophone ("xylophone", 65,	32);
```
The two objects should be considered “equally heavy’' if and only if they have the same weight. Which of the following code excerpts accomplishes that task? 
```java
(A) if (x2.weight==x3.weight)
		System.out.println ("equally heavy") ; 
	else
		System.out.println ("not equally heavy");
(B) if (x2.weight()==x3.weight())
		System.out.println ("equally heavy") ; 
	else
		System.out.println ("not equally heavy");
(C) if (x2.getWeight()==x3.getWeight())
		System.out.println ("equally heavy") ; 
	else
		System.out.println ("not equally heavy");
(D) if (x2.weight.equals(x3.weight)
		System.out.println ("equally heavy") ; 
	else
		System.out.println ("not equally heavy");
```
(E) The weight of each object cannot be compared.

Questions 36-37 refer to the following classes. 

```java
public class Dog {
	private int height; 
	private String size; 
	private String color; 
	Dog (int iheight, int iweight, String icolor) {
		height = iheight; 
		color = icolor;
		if (iweight >= 65)
			size = "large" ; 
		else 
			size = "medium" ;
	}
	public int getHeight() { return height; } 
	public String getSize() { return size;}
	public String getColor() {return color; } 
	public String toString () {return "        color is: "+ color;}
}

public class SportingDog extends Dog {
	private String purpose; 
	SportingDog (int h, int w, String c) {
		super (h, w, c);
		purpose = "hunting";
	}
	public String getPurpose() {
		return purpose;
	}
	
}

public class Retriever extends SportingDog {
	private String type;
	Retriever (String itype, String icolor, int iweight) {
		super(24, iweight, icolor); 
		type = itype; 
	}
	public String toString () {return "type: " + type + super.toString(); }
}
```
36. Which of the following declarations will not compile?
```java
(A) Dog d1 = new SportingDog (30 , 74 , "Black"); 
(B) Dog d2 = new Retriever("Labrador", "Yellow", 75) ; 
(C) SportingDog d3 = new Retriever ("Golden", "Red", 70);
(D) SportingDog d4 = new Dog (25, 80, "Bed");
(E) Retriever d5 = new Retriever ("Golden", "Blonde", 60 ) ;
```
37. VVhat is the output after the execution of the following code in the client program: 
```java
	Dog mason = new Retriever ("Labrador", "chocolate", 85);
	System.out.println (mason.toString());
```
```
(A) type: Labrador 
(B) type: Labrador	color is: chocolate   purpose: hunting
(C) color is: chocolate  type: Labrador 
(D) type: Labrador purpose: hunting color is: chocolate 
(E) type: Labrador 	color is: chocolate 
```
38. The following pow method was written to return b raised to the xth power where x > 0, but it does not work properly. Choose the changes to the method below to work properly.
```java
1	public double pow (double b, int x) 
2	{
3		if (x==0) 
4			return 0; 
5		else
6			return b + pow (b, x-1); 
7	}
```
``` No answer is correct
(A) Change lines 3 and 4 to: 
3 	if (x=-l) 
4		return 1; 
(B) Change lines 3 and 4 to: 
3 	if (x=-l) 
4		return b; 
(C) Change line 6 to: 
6 		return b * mystery(b, x-1);
(D) Both (A) and (C) 
(E) Both (B) and (C) 
```
39. What is output given the following code excerpt? 
```java
	public static int f (int n) {
		if (n==0)
			return 0;
		else 
			return f(n/10)+ n % 10; 
			
	}
	System.out.println(f(8765));
```
```
(A) 5678 
(B) 8765 
(C) 58 
(D) 26 
(E) A run-time error 
```
40. Choose the best solution to complete the missing code such that the code will implement a binary search to find the variable number in arr.
```java
	int number = <some number in arr>;
	System.out.println (search (arr, 0, arr.length-1, number)) ;

	public int search(int [] a,int first, int last, int sought){
		int mid = (first +  last)/2 ;
		if (<missing code>) {
			last = mid - 1;
			return search(a, first,last, sought) ;
		}
		else if(<missingcode>){
			first = mid + 1;
			return search (a, first, last, sought); 
		}
		return mid;
	}
```
```
(A) a[mid] > sought  		a[mid] < sought
(B) a[mid] + 1 > sought  	a[mid] < sought 
(C) a[mid] > sought			a[mid] -1 < sought
(D) a[mid] + 1 > sought 	a[mid] -1 < sought
(E) a[mid] = sought  		a[mid] = sought
```  

