1. . Consider the following expression: 

a / b + c - d % e * f 

Which of the expressions given below is equivalent to the one given above? 

(A) ((a / b) + (c - d) ) % (e*f)
(B) (((a / b) + c) - d) % e) * f
(C) ((a / b) + c) - (d % (e * f)
(D) (a / ((b + c) - d) % e) * f
(E) ((a / b) + c) - ((d % e) * f)

2. Assume that a program declares and initializes x as follows: 

```java
String[] x ; 
x = new String [ 10 ] ; 
initialize (x) ; // Fills the array x with 
// valid strings each of 
// length 5 
```

Which of the following code segments correctly traverses the array and prints out the first character of all ten strings followed by the second character of all ten strings, and so on? 

```java
I.  int i; 
    int j;
    for (i = 0 ; i <10 ; i++) 
        for (j=0 ; j < 5 ; j++) 
            system.out,print(x[i].substring(j, j + )); 

II. int i; 
    int j;
    for (i = 0 ; i<5 ; i++) 
        for (j=0 ; j <10 ; j++) 
            system.out,print(x[j].substring(i, i + )); 

I.  int i; 
    int j;
    for (i = 0 ; i<5 ; i++) 
        for (j=0 ; j < 10 ; j++) 
            system.out,print(x[i].substring(j, j + )); 
```

(A) I only 
(B) II only 
(C) I and II only 
(D) II and III only 
(E) I, II and III 

3. Consider the following declaration and assignment statements: 

```java
int a = 7; 
int b = 4; 
double c; 
c = a / b; 
```

After the assignment statement is executed, what’s the value of c? 

(A) 1.0 
(B) 1.75 
(C) 2.0 
(D) An error occurs because c was not initialized.  
(E) An error occurs because a and b are integers and c is a double. 

4. Consider the following code segment: 

```java
int x; 
x = /* initialized to an integer*/ 
if (x % 2== 0 && x / 3 == 1) 
    System.out.print("Yes") ; 
```

For what values of x will the wor^Yes” be printed when the code segment is executed? 
(A) 0 
(B) 4 
(C) Whenever x is even and x is not divisible by 3 
(D) Whenever x is odd and x is divisible by 3 
(E) Whenever x is even and x is divisible by 3 

5. Consider the following incomplete class definition: 

```java
public class SomeClass 
{
    private String myName;
    // postcondition: returns rnyName 
    public String getName( )
    { /* implementation not shown*/ } 

    // postcondition: myName == name
    public void setName(Stringname )
    {/*implementation not shown*/ }   
    // constructors, other methods 
    // and private data not show/n 
}
```
Now consider the method swap, not part of the SomeClass class. 

```java
// precondition: x and y are correctly 
// constructed 
// postcondition: the names of objects 
// x and y are swapped 
public void swap (Someciass x, SomeClass y)
{
    /*missing code */
} 
```
Which of the following code segments can replace /* missing code */ so that the method swap works as intended?

```java
I.  SomeClass temp; 
    temp = x; 
    x = y;
    y = temp;  

II. String temp; 
    temp = x.myName; 
    x.myName = y.myName;
    y.myName = temp; 

III.  String temp; 
    temp = x.getName(); 
    x.setName(y.getName());
    y.setName(temp);  
```
(A) I only 
(B) III only 
(C) I and III only 
(D) II and III only 
(E) I, II and III 
