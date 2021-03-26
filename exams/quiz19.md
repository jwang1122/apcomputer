1. Refer to the definitions of ClassOne and ClassTwo below. 

```java
public class ClassOne 
{
    public void methodOne()
    {
        ...
    }
    
    //other methods not shown 
}

public class ClassTwo extends ClassOne 
{
    public void methodTwo()
    {
        ...
    }
    //other methods not shown 
}
```

Consider the following declarations in a client class. You may assume that ClassOne and classTwo have default constructors. 

```java
ClassOne c1 = new ClassOne();
ClassOne c2 = new ClassTwo ();  
```

Which o£ the following method calls will cause an error? 

```
I c1.methodTwo() ;
II c2.methodTwo();  
III c2.methodOne();

(A) None
(B) I only 
(C) II only
(D) III only 
(E) I and II only

```

2. Consider the code segment 

```java
if (n == 1)
    k++;
else if (n == 4)
    k += 4;
```

Suppose that the given segment is rewritten in the form 

```java
if (/* condition */)
    /* assignment statement */;
```

Given that n and k are integers and that the rewritten code performs the same task as the original code, which of the following could be used as 

(1) /* condition */ and     (2)   /* assignment statement */

```java
(A) (1) n == 1 && n == 4    (2) k += n 
(B) (1) n == 1 && n == 4   (2) k += 4 
(C) (1) n == 1 || n == 4   (2) k += 4 
(C) (1) n == 1 || n == 4   (2) k += n 
(E) (1) n == 1 || n == 4   (2) k = n - k 
```

3. Which of the following will execute without throwing an exception? 

```java
I   String s = null;
    String t = "";
    if (s.equals(t) ) 
        System.out.println ("empty strings? ");

II  String s = "holy";  
    String t = "moly";  
    if (s.equals(t) ) 
        System.out.println ("holy moly!");

III  String s = "holy";  
    String t = s.substring(4);  
    if (s.equals(t) ) 
        System.out.println (s + t);


(A) I only 
(B) II only
(C) III only 
(D) I and II only
(E) II and III only
```

4. Three numbers a, b, and c are said to be a Pythagorean Triple if and only if the sum of the squares of two of the numbers equals the square of the third. A programmer writes a method isPythTriple to test if its three parameters form a Pythagorean Triple: 

```java
//Returns true if a * a + b * b == c * c; otherwise returns false. 
public static boolean isPythTriple (double a, double b, double c) 
{
    double d = a * a + b* b; 
    return d == c; 
}
```

When the method was tested with known Pythagorean Triples, isPythTriple sometimes erroneously returned false. What was the most likely cause of the error? 

```
(A) Round-off error was caused by calculations with floating-point numbers. 
(B) Type boolean was not recognized by an obsolete version of Java. 
(C) An overflow error was caused by entering numbers that were too large. 
(D) c and d should have been cast to integers before testing for equality.
(E) Bad test data were selected. 
```

5. Refer to the following class, containing the mystery method.

```java
public class SomeClass 
{
    private int [] arr; 

    //Constructor. Initializes arr to contain nonnegative 
    // integers k such that 0 <= k <= 9.
    public SomeClass()
    { /* implementation not shown */ } 

    public int mystery() 
    {
        int value = arr[0];
        for (int i = 1; i< arr.length; i++)
            value = value * 10 + arr [i] ; 
        return value; 
    }
}
```

Which best describes what the mystery method does? 

```
(A) It sums the elements of arr. 
(B) It sums the products 10*arr[0] + 10*arr [1]+...+ 10*arr[arr.length-1].
```

(C) It builds an integer of the form $d_1 d_2 d_3 \cdot\cdot\cdot d_n$, where $d_1=arr[0], d_2=arr[1], \cdot\cdot\cdot, d_n=arr[arr.length-1]$,

(D) It builds an integer of the form $d_1 d_2 d_3 \cdot\cdot\cdot d_n$, where $d_1=arr[arr.length-1], d_2=arr[arr.length-2], \cdot\cdot\cdot, d_n=arr[0]$

(E) It converts the elements of arr to base-10.