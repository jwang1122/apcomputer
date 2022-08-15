1. Which of the following would be the LEAST effective way of ensuring reliability in a program?

(A) Encapsulating functionality in a class by declaring all data fields to be public 
(B) Defining and following preconditions and postconditions for every method 
(C) Including assertions at key places in the code 
(D) Using descriptive variable names 
(E) Indenting code in a consistent and logical manner 

2. Consider a dictionary that has 1,024 pages with 50 words on each page. 

In order to look up a given target word, a student is considering using one of the following three methods: 
__**Method 1**__
Use a binary search technique to find the correct page (comparing the target word with the first word on a given page). When the correct page is found, use a sequential search technique to find the target word on the page. 
__**Method 2**__
Use a sequential search technique to find the correct page (comparing the target word with the first word on a given page). When the correct page is found, use another sequential search technique to find the target word on the page.
__**Method 3**__ 
Use a sequential search technique on all of the words in the dictionary to find the target word.  Which of the following best characterizes the greatest number of words that will be examined using each method?


|   |Method 1 | Method 2 |Method 3|
|---|---|---|---|
(A) | 10 | 50    | 1,024
(B) | 55 | 512   | 2,560
(C) | 55 | 537   | 25,600
(D) | 60 | 1,074 | 1,074
(E) | 60 | 1,074 | 51,200

3. Consider the following recursive method. 

```java
public static int mystery(int m)
{
    if(m==0)
    {
        return 0;
    }
    else
    {
        return 4 + mystery (m -2) ; 
    }
} 
```

Assuming that j is a positive integer and that m = 2j, what value is returned as a result of the call mystery (j)? 

(A) 0
(B) m
(C) 2m
(D) j
(E) 2j

4. Consider the following method. 

```java
public static int mystery (int a, int b) 
{
    if(a<=0)
        return b;
    else
        return mystery (a - 2, b); 
}
```

What value is returned by the call mystery (12, 5)2 
(A) 5
(B) 6
(C) 12
(D) 60
(E) 1565

5. Consider the following instance variable and method. 

```java
private int[] numList;
//Precondition: numList contains a list of int values in no particular order 
public int mystery(int n) 
{
    for (int k = 0; k <= numList.length - 1; k++)
    {
        if (n <= numList[k])
            return k;
    }
    return numList.length; 
} 
```

Which of the following statements is most accurate about numList following the execution of the following statement? 

```java
int j = mystery (number); 
```

(A) The greatest value in numList is at index j.
(B) The greatest value in numList that is less than number is at index j.
(C) All values in numList from index 0 to j-1 are greater than or equal to number. 
(D) All values in numList from index 0 to j-l are less than number. 
(E) All values in numList from index j to numList.length-1 are greater than number. 