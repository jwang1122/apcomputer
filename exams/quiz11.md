# AP COMPUTER quiz11
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---
1. Assuming all other statements in the program are correct, each of the following statements will allow the program to compile **EXCEPT**

    ```java
    (A) System.out.print("Ilove Java"); 
    (B) System.out.print("Ilove" + "Java"); 
    (C) System.out.print(1 + "love" + Java"); 
    (D) System.out.print(1 + "love" + "Java"); 
    (E) System.out.print("I love" + " " + "Java"); 
    ```
2. Consider the following code segment: 

    ```java
    int a =10 ;
    double b = 10.7; 
    double c = a + b;
    int d =a + c; 
    System.out.println(c + " " + d);  
    ```
    What will be output as a result of executing the code segment? 

    ```
    (A) 20      20
    (B) 20.0    30
    (C) 20.7    31
    (D) 20.7    30.7
    (E) Nothing will be printed because of a compile-time error.
    ```    
3. Consider the following code segment: 
   
    ```java
    int a = 3; 
    int b = 6; 
    int c = 8; 
    int d = a/b; 
    c /= d;
    System.out.print(c)
    ```
    Which of the following will be output by the code segment? 
    ```
    (A) 4 
    (B) 8
    (C) 12 
    (D) 16 
    (E) There will be no output because of a run-time error.  
    ```
4. Consider the following code segment: 

	```java
	for (int i = 200 ; i > 0; i /= 3) {
		if (i % 2 == 0 ) 
			System.out.print(i +" ");
	}
	```
	What is the output as a result of executing the code segment? 
	```
	(A) 200 66 22 7 2 
	(B) 66 22 72 
	(C) 200 66 22 2 
	(D) 200 66 22 
	(E) 7 
	```
5. Determine the output of the following code.

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
	```
	(A) x = 0, y = 0
	(B) x = -5, y = 6
	(C) x = 10, y = 5
	(D) x = 3, y = 5
	(E) None of the above
	```
