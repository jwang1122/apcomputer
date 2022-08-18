1. A children’s club classifies members based on age according to the table below: 


Years               | Classification
|---                |---            |
Under 3             | Infant
3 to 7 inclusive    | Pee-Wee
8 to 13 inclusive   | Cub
Over 14             | Leader

Which of the following methods will correctly take the integer parameter age and return the String Classification? 

```java
(A) public String classification (int age) 
    {
        String temp; 
        if (age< 3) 
            temp = "Infant";
        if (age<= 7) 
            temp = "pee-wee"; 
        if (age <= 13) 
            temp = "Cub"; 
        if (age >= 14)
            temp = "Leade";
        return temp;
    }
(B) public String classification (int age) 
    {
        String temp; 
        if (age< 3) 
            temp = "Infant";
        if (3<=age<= 7) 
            temp = "pee-wee"; 
        if (8<=age <= 13) 
            temp = "Cub"; 
        if (age >= 14)
            temp = "Leade";
        return temp;
    }
(C) public String classification (int age) 
    {
        String temp; 
        if (age< 3) 
            temp = "Infant";
        else if (age<= 7) 
            temp = "pee-wee"; 
        else if (age <= 13) 
            temp = "Cub"; 
        else if (age >= 14)
            temp = "Leade";
        return temp;
    }
(D) public String classification (int age) 
    {
        String temp; 
        if (age< 3) 
            temp = "Infant";
        else if (age< 7) 
            temp = "pee-wee"; 
        else if (age < 13) 
            temp = "Cub"; 
        else if (age > 14)
            temp = "Leade";
        return temp;
    }
(E) public String classification (int age) 
    {
        String temp; 
        if (age< 3) 
            temp = "Infant";
        if (age< 7) 
            temp = "pee-wee"; 
        if (age < 13) 
            temp = "Cub"; 
        if (age > 14)
            temp = "Leade";
        return temp;
    }
```

2. Consider the following methods: 

```java
public static void mystery ()
{
    int [] A;
    A = initialize ( ) ; 
    // returns a valid initialized array of integers 
    for (int k = 0; k < A.length/ 2; k++)
        swap (A[k], A [A.length - k- 1]);   
}

public static void swap (int x, int y) 
{
    int temp;
    temp = x;
    x = y;
    y = temp ;  
}
```

Which of the following best characterizes the effect of the for loop in the method mystery? 
(A) It sorts the elements of A
(B) It reverses the elements of A
(C) It reverses the order of the first half of A and leaves the second half unchanged. 
(D) It reverses the order of the second half of A and leaves the first half unchanged. 
(E) It leaves all of the elements of A in their original order. 

3. Consider the following code segment

```java
int[][] A = new int[4][3];
for(int j = 0; j < A[0].length; j++)
    for (int k=0;  k< A.length; k++)
        if (j == 0) 
            A[k][j] = 0; 
        else if (k % j== 0)
            A[k][j] =1; 
        else
            A[k][j] = 2;   
```

What are the contents of A after the code segment has t>een executed? 
(A) 0 0 0 0 
    1 1 1 1
    1 2 1 2
(B) 0 1 1 1 
    0 2 2 2
    0 1 2 1
(C) 0 0 0 
    1 1 2
    1 1 1
    1 1 2
(D) 0 1 1 
    0 2 1
    0 2 2
    0 2 1
(E) 0 1 1 
    0 1 2
    1 1 1
    0 1 2

4. Consider the following method:

```java
/** @param num an int value such that num >= 0
 */
public void mystery(int num)
{
    System.out.print (num % 100);
    if ((num / 1OO) != 0) 
    {
        mystery (num / 100 );
    }
    System.out.print(num % 10 );
}  
```
Which of the following is printed as a result of the call mystery (456789)?

(A) 456789
(B) 896745 
(C) 987654
(D) 456789896745 
(E) 896745456789 

5. Consider the following method:

```java
public static int mystery (int x, int y) 
{
    if (x > 0)
        return x; 
    else if (y > 0)
        return y; 
    else 
        return x / y;   
}
```

In accordance with good design and testing practices, which of the following is the best set of test cases (x f y) for the method mystery?

(A) (3, 4), (-3, 4), (-3, -4) 
(B) (3, 4), (-3,4), (-3, -4) > (-3, 0) 
(C) (3, 4),(-3, -4),(-3,-4), (-3, 0)
(D) (3, 4),  (3, -4), (-3, -4), (-3,4), (-3, 0) 
(E) (3, 4), (2, 5), (3, -4), (-3, 0), (4, 0), (0, 0)

