# Quiz 16

1. Refer to the following class for Question 1 a and 2.

```java
public class Tester 
{
    private int[] testArray = {3, 4, 5};

    // Add 1 to n. 
    public void increment (int x) 
    { n++; }

    public void firstTestMethod()
    {
        for (int i=0;i < testArray.length; i++)
        {
            increment (testArray [i] ) ; 
            System.out.print (testArray [i] + " " );
        }
    }

    public void secondTestMethod()
    {
        for (int element: testArray) 
        {
            increment (element); 
            System.out.print(element + " " );
        }
    } 
}
```
1. What output will be produced by invoking firstTestMethod for a Tester object? 

```
(A) 3 4 5 
(B) 4 5 6 
(C) 5 6 7 
(D) 0 0 0
(E) No output will be produced. An ArraylndexOutOfBoundsException will be thrown.
```

2. What output will be produced by invoking secondTestMethod for a Tester object, assuming that testArray contains 3,4,5? 

```
(A) 3 4 5 
(B) 4 5 6 
(C) 5 6 7 
(D) 0 0 0
(E) No output will be produced. An ArrayIndexOutOfBoundsException will be thrown. 
```

3. Consider the following loop, where n is some positive integer. 

```java
for (int i = 0; i < n; i += 2)
{
    if (/*test */)
        /* perform some action */ 
}
```

In terms of n, which Java expression represents the maximum number of times that /* perform some action */ could be executed? 

```
(A) n / 2
(B) (n + 1)/ 2 
(C) n 
(D) n - 1
(E) (n - 1) / 2  
```

4. A method is to be written to search an array for a value that is larger than a given item and return its index. The problem specification does not indicate what should be returned if there are several such values in the array. Which of the following actions would be best? 

(A) The method should be written on the assumption that there is only one value in the array that is larger than the given item. 

(B) The method should be written so as to return the index of ever/ occurrence of a larger value. 

(C) The specification should be modified to indicate what should be done if there is more than one index of larger values.

(D) The method should be written to output a message if more than one value is found. 

(E) The method should be written to delete all subsequent larger items afetr a suitable index is returned. 

5. When will method whatlslt cause a stack overflow (i.e., cause computer memory to be exhausted)? 

```java
public static int whatlslt(int x, int y)
{
    if (x > y) 
        return x * y ;
    else 
        return whatlslt(x- 1, y);  
}
```

```
(A) Only when x < y
(B) Only when x <= y
(C) Only when x > y 
(D) For all values of x and y 
(E) The method will never cause a stack overflow.  
```
