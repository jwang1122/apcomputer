1. Assume that a and b are boolean variables that have been initialized. Consider the following code segment. 

```java
a = a && b;
b = a || b;
```

Which of the following statements is always true? 
I. The final value of a is the same as the initial value of a. 
II. The final value of b is the same as the initial value of b. 
III. The final value of a is the same as the initial value of b. 

(A) I only 
(B) II only 
(C) III only 
(D) I and II only 
(E) II and III only 

2. Consider the following code segment. 

```java
int x; 
x = 53; 
if (x >10 ) 
{
    System.out.print("A"); 
}
if (x >30 ) 
{
    System.out.print("B"); 
}
else if (x >40 ) 
{
    System.out.print("C"); 
}
if (x >50 ) 
{
    System.out.print("D"); 
}
if (x >70 ) 
{
    System.out.print("E"); 
}

```

What is the output when the code is executed? 

(A) A
(B) D
(C) ABD 
(D) ABCD 
(E) ABCDE

3. Consider the following code segment: 

```java
int j; 
int k; 
for(j =-2; j <= 2; j = j + 2 )
{
    for (k = j; k < j+3; k++)
    {
        System.out.print(k + " ");
    }
}
```

What is the output when the code is executed? 

(A) -2 -1 0
(B) -2 -1 0 1 2
(C) 0 1 2 0 1 2 0 1 2
(D) -2 0 2
(E) -2 -1 0 0 1 2 2 3 4

4. Consider the following method. 

```java
public void mystery (int count, String s)
{
    if (count <= 0>)
    {
        return;
    } 
    if (count % 3 == 0 )
    {
        System.out.print(s + "--"   +s) ; 
    }
    else if (count % 3 == 1 )
    {
        System.out.print(s + "-"   +s) ; 
    }
    else
    {
        System.out.print(s);
    }
    mystery (count-1, s );
    
} 
```
What is outputted by the call mystery (5, "X") ?
(A) XX-XX--XXX-X 
(B) XX-XX-XX-XX 
(C) XXX--XX-X-XX-XXX 
(D) XX-XXX--XXX-XX 
(E) XXXXX

5. Consider the following output: 
 6 5 4 3 2 1
 5 4 3 2 1
 4 3 2 1
 3 2 1
 2 1
 1

 Which of the following code segments produces the above output when executed? 

```java
(A) for (int j = 6; j < 0; j--)
    {
        for (int k = j;k > 0; k--){
            System.out.print(k +"  ")
        } 
        System.out.println(" ");
    }
(B) for (int j = 6; j >= 0; j--)
    {
        for (int k = j;k >= 0; k--){
            System.out.print(k +"  ")
        } 
        System.out.println(" ");
    }
(C) for (int j = 0; j < 6; j++)
    {
        for (int k = 6-j;k > 0; k--){
            System.out.print(k +"  ")
        } 
        System.out.println(" ");
    }
(D) for (int j = 0; j < 6; j++)
    {
        for (int k = 7-j;k > 0; k--){
            System.out.print(k +"  ")
        } 
        System.out.println(" ");
    }
(E) for (int j = 0; j < 6; j++)
    {
        for (int k = 6- j;k >= 0; k--){
            System.out.print(k +"  ")
        } 
        System.out.println(" ");
    }
```
