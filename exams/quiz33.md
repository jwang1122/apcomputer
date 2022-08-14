1. Which of the following arrays would be sorted the slowest using insertion sort? 

(A) [3 4 6 2 7 3 9 ] 
(B) [3 2 5 4 6 7 9 ] 
(C) [9 7 6 5 4 3 2 ] 
(D) [2 3 4 5 6 7 9 ] 
(E) [9 3 2 4 5 7 6 ] 

2. Consider si and s2 defined as follows. 

```java
String s1 = new String ("hello");
String s2 = new String ("hello");
```

Which of the following is/are correct ways to see if s1 and s2 hold identical strings? 

```java
I. if(s1 == s2)
/* si and s2 are identical */  

II. if (s1.equals(s2))
/* si and s2 are identical */  

III. if (s1.compareTo(s2) == 0) 
/* si and s2 are identical */  

```
(A) I only 
(B) II only 
(C) I and III only 
(D) II and III only 
(E) I, II and III 

3. Consider the following variable and method declarations: 

```java
String s;
String t; 
public void mystery (String a, String b) 
{
    a = a + b; 
    b = b + a; 
}
```

Assume that s has the value "Elizabeth" and t has the value "Andrew" and mystery (s, t) is called. What are the values of s and t after the call to mystery? 
(A) s=Elizabeth                 t=Andrew 
(B) s=ElizabethAndrew           t=AndrewElizabeth 
(C) s=ElizabethAndrew           t=AndrewElizabethAndrew 
(D) s=ElizabethAndrew           t=ElizabethElizabethAndrew 
(E) s=ElizabethAndrewElizabeth  t=AndrewElizabethAndrew 

4. Consider the following incomplete and incorrect class and interface declarations: 

```java
public class ComparableObject 
{
    public int compareTo (Object o) 
    {
        //method body not shown 
    }
    //other methods and variables not shown 
}
public class Point extends ComparableObject 
{
    private int x;
    private int y;
    public boolean compareTo (Point other) 
    {
        return (x == other.x && y == other.y);  
    } 
    //.. .constructorsand other methods 
    // not shown 
}
```

For which of the following reasons is the above class structure incorrect?

I. Objects may not access private data fields of other objects in the same class. 
II. The ComparableObject class requires that compareTo be passed as an Object rather than a point.
III. The ComparableObject class requires that compareTo return an int rather than a boolean.  

(A) I only 
(B) III only 
(C) I and III only 
(D) II and III only 
(E) None, the above class declarations are correct. 

5. Consider the following abstraction of a for loop where <1>, <2>, <3> and <4> represent legal code in the indicated locations:

```java
for (<1>; <2>; <3>)
{
    <4>
}
```

Which of the following while loops has the same functionality as the above for loop? 

```java
(A) <1>;
    while (<2>)
    {
        <3>;
        <4>
    }
(A) <1>;
    while (<2>)
    {
        <3>;
        <4>
    }
(B) <1>;
    while (<2>)
    {
        <4>
        <3>;
    }
(C) <1>;
    while (!<2>)
    {
        <3>;
        <4>
    }
(D) <1>;
    while (!<2>)
    {
        <4>
        <3>;
    }
(E) <1>;
    <3>;
    while (<2>)
    {
        <4>
        <3>;
    }
```