# AP COMPUTER quiz6
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---

Question 1-2 refer to the Constellation class below:
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
1. Using Constellation class, which of the following will cause compiler error?
    ```java
    (A) Constellation c1 = new Constellation("Hercules", "July");
    (B) Constellation c2 = new Constellation("Pisces", "Nov", 90, 65);
    (C) Constellation c3 = new Constellation("Aquarius", "Oct", 65.0, 9.0);
    (D) Constellation c4 = new Constellation("Leo", "4", 0, 0);
    (E) Constellation c5 = new Constellation("Phoenix", "Nov", 32, 90);
    ```
2. A programmer has attempted to add three mutator methods to use Constellation class.

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
3. Given the following code excerpt:

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
4. Given the following code excerpt:

    ```java
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        
        for (int element : arr3) {
            element *=2;
            System.out.print(element + " ");
        }
        System.out.println("");
        
        for(int element: arr3)
            System.out.print(element + " ");
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
5. Given an array numbers containing a variety of integers and the following code excerpt:

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

