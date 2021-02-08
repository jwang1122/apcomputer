# AP COMPUTER quiz9
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---

1. Given nums—a rectangular, two-dimensional array of integers, choose the code to print the entire array.

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

    Questions 2-3 refer to the following classes. 

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
2. Which of the following declarations will not compile?

    ```java
    (A) Dog d1 = new SportingDog (30 , 74 , "Black"); 
    (B) Dog d2 = new Retriever("Labrador", "Yellow", 75) ; 
    (C) SportingDog d3 = new Retriever ("Golden", "Red", 70);
    (D) SportingDog d4 = new Dog (25, 80, "Bed");
    (E) Retriever d5 = new Retriever ("Golden", "Blonde", 60 ) ;
    ```
3. VVhat is the output after the execution of the following code in the client program: 

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
4. The following pow method was written to return b raised to the xth power where x > 0, but it does not work properly. Choose the changes to the method below to work properly.

    ```java
    1	public double pow (double b, int x) 
    2	{
    3		if (x==0) 
    4			return 0; 
    5		else
    6			return b * pow (b, x-1); 
    7	}
    ```
    ``` No answer is correct
    (A) Change lines 3 and 4 to: 
    3 	if (x==l) 
    4		return 1; 
    (B) Change lines 3 and 4 to: 
    3 	if (x==0) 
    4		return 1; 
    (C) Change line 6 to: 
    6 		return b + pow(b, x-1);
    (D) Both (A) and (C) 
    (E) Both (B) and (C) 
    ```
5. What is output given the following code excerpt? 

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
