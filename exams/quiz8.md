# AP COMPUTER quiz8
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---

Question 1-2 refer to the following code expcerpt.

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
	Questions 3-5 refer to the Percussion and Xylophone class below. 
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
		
		public int getNumKeys() {
			return numberOfKeys;
		}
	}
	```
3. Which of the following is the most appropriate replacement for <missing code> in the Xylophone constructor?

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
4. Assuming the above classes compile correctly, which of the following will not compile within a client program?

	```java
	(A) Xylophone [] xylophones = new Xylophone [5]; 
	(B) Percussion [] xylophones = new Xylophone [5]; 
	(C) Xylophone x1 = new Xylophone ("xylophone", 65, 32) ; 
		System.out.println(x1.getNumKeys()); 
	(D) Xylophone x2 = new Xylophone ("xylophone", 65, 32); 
		System.out.println(x2.numberOfKeys); 
	(E) Drums[] drums;
	```
5. A client program wishes to compare the two xylophone objects as follows: 

    ```java
    Xylophone x2 = new Xylophone ("xylophone", 80, 32) ; 
    Xylophone x3 = new Xylophone ("xylophone", 65,	32);
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
    (D) if (x2.weight.equals(x3.weight))
            System.out.println ("equally heavy") ; 
        else
            System.out.println ("not equally heavy");
    ```
    (E) The weight of each object cannot be compared.
