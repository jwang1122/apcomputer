1. Consider the following method

```java
/**precondition: set doesnot containany negative values 
 */
public int mystery (int [ ] set, int max) 
{
     int m = 0;
     int count =0;
     for (int n = 0; n < set.length && set[n]< max; n++)
     {
        if(set[n] >= m)
        {
            m = set[n] ;//StatementA 
        } 
        count++; //Statement B 
     }  
     return count; 
}
```

Assume that mystery is called and is executed without error. Which of the following are possible combinations of the number of the value of max, the number of times Statement A is executed, and the number of times Statement B is executed?

| | Value of max | Executions of Sttement A|Executions of Statement B|
|---|---|---|---|
I  |8|2|3
II |3|7|5
III|7|0|4

(A) I only 
(B) III only 
(C) I and II only 
(D) I and III only 
(E) I, II and III 

2. The following method is intended to return an array that inserts an integer m at index n, pushing the values of all indexes after n to the index one higher. For example, if the index arr is 
{4, 2, 1, 3}
and the command arr = insert (arr, 5, 2) is called, the method is intended to return 
{4, 2, 5, 1, 3}

```java
1.  public int [ ] insert (int [ ] arr, int m, int n) 
2.  {
3.      int [] temp = new int [arr.length+1 ]; 
4.      for (int k = 0; k < arr.length; k++) 
5.      {
6.          if (k < r)
7.          {
8.              temp [k] = arr [k];
9.          }
10.         else 
11.         {
12.             temp[k + l] = arr[k] ; 
13.         }
14.     }
15.     temp [m] = n; 
16.     return temp;
17. }
```

The method insert does not work as intended. Which of the following changes will cause it to work as intended?

(A) Change Line 6 to if (k > n) 
(B) Change Line 6 to if (k <= n)
(C) Change Line 12 to temp[k] = arr[k+1];
(D) Change Line 15 to temp[n] = m; 
(E) Change Line 16 to return arr; 

3. if X, Y, and Z are integer values, the boolean expression 
   (X > Y) && (Y > Z) 
   can be replaced by which of the following? 

(A) X > Z 
(B) (X < Y) || (Y < Z)
(C) (X <= Y) || (Y < Z) )
(D) !((X < Y) || (Y<Z ))
(E) !((X <= Y) || (Y<=Z ))

4. Consider these class declarations: 

```java
public class Person 
{
    ...
}
public class Teacher extends Person
{
    ...
} 
```
Which is a true statement? 
I.   Teacher inherits the constructors of Person. 
II.  Teacher can add new methods and private instance variables. 
III. Teacher can override existing private methods of Person. 

(A) I only 
(B) II only 
(C) III only 
(D) I and II only 
(E) II and III 

5. Which statement about abstract classes and interfaces is false?

(A) An interface cannot implement any methods, whereas an abstract class can.
(B) A class can implement many interfaces but can have only one superclass. 
(C) An unlimited number of unrelated classes can implement the same interface.
(D) It is not possible to construct either an abstract class object or an interface object.  
(E) All of the methods in both an abstract class and an interface are public. 