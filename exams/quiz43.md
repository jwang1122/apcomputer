1. Consider the following code segment. 

```java
List<Integer> values = newArrayList<Integer>();
values.add(5);  
values.add(3);  
values.add(2);  
values.add(2);  
values.add(6);  
values.add(3);  
values.add(9);  
values.add(2);  
values.add(1);  
for (int j = 0; j < values.size () ; j++) 
{
    if (values.get (j).intvalue() == 2) 
    {
        values.remove(j) ; 
    }
}

```

What will values contain as a result of executing this code segment? 

(A) [5, 3, 2, 2, 6, 3z 9, 2, 1] 
(B) [5,3, 2, 6, 3, 9, 1] 
(C) [5, 3, 6, 3, 9, 1] 
(D) [2, 2, 2, 5, 3, 6, 3, 9, 1] 
(E) The code throws an ArraylndexOutOfBoundsException. 

2. Consider the class Data partially defined below. The completed maxlD method returns the maximum value of b, a onedimensional array of integers. The completed max2D method is intended to return the maximum value c, a two dimensional array of integers. 

```java
public class Data 
{
    /** Returns the maximum value of one-dimensional array b */
    public int maxlD(int[] b)
    {/* implementation not shown */ } 

    /** Returns the maximum value of two-dimensional arraY c */ 
    publicint max2D(int[] c)
    {
        int max; 
        /* missing code*/
        returns max; 
    } 
    /* other methods of pata class, not shown*/ 
}
```

Assume that max ip works as intended. Which of the following can replace/* missing code / so that max 2D works as intended? 

```java
I. for (int[] row: c )
    {
        max = maxlD(row); 
    }

II. max = maxlD(c[0]);
    for (int k=1; k<=c.length ; k++) 
    {
        max = maxID(c[k]); 
    }

III. max = maxlD(c[0]);
    for (int[] row: c )
    {
        if(max <> maxlD(row))
        {
            max = maxlD(row);
        } 
    }

```
(A) I only 
(B) III only 
(C) I and II only 
(D) II and III only 
(E) I, II and III 

3. Consider the following instance variable,numList, and incomplete method, countZeros. The method is intended to return an integer array count such that for all k, count[k] is equal to the number of elements equal to 0 from numList [0] through numList[k]. For example, if numList contains the values {1,4, 0, 5, 0, 0}, the array countZeros contains the values {0,0,1,1,2,3}.

```java
public int[] countZeros(int [ ] numList)
{
    int [] count = new int [numList.length]; 
    for (int k : count) 
    {
        count [k]= 0 ;
    }
    /* missing code */ 
    return count; 
}
```

The following two versions of / * missing code * / are suggested to make the method work as intended. 

```java
Version 1
for (int k = 0; k <= numList.length; k++)
{
    for (int j = 0; j <=k; j ++)
    {
        if(numList[j] ==0)
        {
            count [k] = count[k] + 1; 
        } 
    } 
} 

Version 2
for (int k = 0; k <= numList.length; k++)
{
    if(numList[k] ==0)
    {
        count [k] = count[k-1] + 1; 
    } 
    else
    {
        count [k] = count [k - 1]; 
    }
} 

```

Which of the following statements is true? 

(A) Both Version 1 and Version 2 will work as intended, but Version 1 is faster than Version 2. 
(B) Both Version 1 and Version 2 will work as intended, but Version 2 is faster than Version 1. 
(C) Version 1 will work as intended, but Version 2 causes an ArraylndexOutOfBoundsException. 
(D) Version 2 will work as intended, but Version 1 causes an ArraylndexOutOf BoundsException. 
(E) Version 1 and Version 2 each cause an ArraylndexOutOfBoundsException. 

4. A real estate agent wants to develop a program to record information about apartments for rent. For each apartment, she intends to record the number of bedrooms, number of bathrooms, whether pets are allowed, and the monthly rent charged.  Which of the following object-oriented program designs would be preferred? 

(A) Use a class Apartment with four subclasses: Bedrooms, Bathrooms, petsAllowed, and Rent. 
(B) Use four classes: Bedrooms, Bathrooms, PetsAllowed, and Rent, each with subclass Apartment. 
(C) Use a class Apartment with four instance variables int bedrooms, int bathrooms, boolean petsAllowed,and double rent.
(D) Use five unrelated classes: Apartment, Bedrooms, Bathrooms, Pet sAl lowed, and Rent. 
(E) Use a class Apartment, with a subclass Bedrooms, with a subclass Bathrooms, with a subclass PetsAllowed, with a subclass Rent. 

5. Consider the following declarations: 

```java
public class Book 
{
    boolean hasMorePagesThan (Book b) ;
    //other methods not shown 
}

public class Dictionary extends Book 
{
    //other methods not shown 
}
```

Of the following method headings of hasMorePagesThan, which can be added to Dictionary so that it will satisfy the pook superclass? 

```java
I.      int hasMorePagesThan(Book b) 
II.     boolean hasMorePagesThan (Book b) 
III.    boolean hasMorePagesThan (Dictionary d) 
```

(A) I only 
(B) I and II only 
(C) II only 
(D) II and III only 
(E) I, II and III 
