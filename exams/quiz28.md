1. Consider the following nonrecursive method: 

```java
//precondition: x >= 0 
public static int mystery(int x) 
{
    int sum = 0;
    while (x>= 0 )
    {
        sum += x;
        x--; 
    } 
    return sum;
}
```

Which of the following recursive methods are equivalent to the method above? 

```java
I. public static int mystery2(int x)
{
    if(x== 0)
    {
        return 0;
    } 
    return (x + mystery2 (x - 1) ); 
} 

II. public static int mystery3(int x)
{
    if(x== 0)
        return 0;
    else
        return mystery3 (x - 1); 
} 

III. public static int mystery4(int x)
{
    if(x== 1)
    {
        return 1;
    } 
    return (x + mystery4 (x - 1) ); 
} 
```

(A) I only 
(B) II only 
(C) III only
(D) I and II 
(E) II and III 

2. Consider the following method: 

```java
public int mystery (int x, int y) 
{
    if (x >=100 || y <= o)
    {
        return 1; 
    }
    else
    {
        return mystery (x + 10,y - 3);
    }
}
```

What value is returned by the call mystery (30, 18)? 
(A) 0
(B) 1
(C) 6
(D) 7 
(E) Nothing will be returned due to infinite recursion. 

3. Consider the following incomplete method: 

```java
public int mystery (int x) 
{
    if (x <= 1)
    {
        return 1; 
    }
    else
    {
        return (/* missing code*/);
    }
}
```
Which of the following could be used to replace / * missing code * / so that the value of mystery(10) is 32 ?

(A) mystery(x- 1) + mystery(x-2) 
(B) 2 * mystery (x - 2) 
(C) 2 * mystery (x - 1 )
(D) 4* mystery(x - 4)
(E) 4 + mystery(x - 1)

4. Consider the following methods. 

```java
public void trial () 
{
    int a = 10;
    int b = 5 ; 
    doubleValues(a, b);
    System.out.print (b);
    System.out.print (a);    
}

public void doubleValues (int c, int d)
{
    c = c * 2; 
    d = d * 2;
    System.out.print (c);
    System.out.print(d);
} 
```
What is printed as the result of the call trial () ?

(A) 2010
(B) 2010105 
(C) 2010510
(D) 20102010 
(E) 20101020  

5. Consider the following method. 

```java
/**
 * precondition: a > b > 0
 */
public static int mystery (int a, int b) 
{
    int d = 0; 
    for (int c = a; c > b; c--)
    {
        d = d + c;
    } 
    return d;
} 
```

What is returned by the call mystery (x, y) ?
(A) The sum of all integers greater than y but less than or equal to x 
(B) The sum of all integers greater than or equal to Y but less than or equal to x 
(C) The sum of all integers greater than Y but less than x 
(D) The sum of all integers greater than or equal to y but less than x 
(E) The sum of all integers less than Y but greater than or equal to x 