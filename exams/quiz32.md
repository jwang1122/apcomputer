Questions 1-2 refer to the following incomplete method. 

The following insertsort method sorts the values in an integer array, sort, in ascending order. 

```java
1 public static void insertSort(int [] sort)
2 {
3    for(int index = 1; index< sort.length; index++) 
4    {
5        int temp= sort[index];
6        while (index > 0 && sort [index - 1] > temp)  
7        {
8            /* missing code */ 
9        }
10       sort[index]= temp; 
11    }
12 }
```

1. Which of the following can be used to replace / * missing code * / so that the insertsort method will execute properly? 

```java
(A) sort[index] = sort[index- 1] ;
    index++;  
(B) sort[index-1] = sort[index] ;
    index--;  
(C) sort[index] = sort[index + 1] ;
    index++;  
(D) sort[index] = sort[index- 1] ;
    index--;  
(E) sort[index] = sort[index + 1] ;
    index--;  
```

2. Assuming that the / * missing code * / is implemented properly, what change can be made to the code in order for the array to be sorted in descending order?

```java
(A) Replace Line 6 with: while (index < 0 && sort[index - 1] > temp)
(B) Replace Line 6 with: while (index < 0 && sort[index - 1] < temp)
(C) Replace Line 6 with: while (index > 0 && sort[index - 1] <> temp)
(D) Replace Line 6 with: for (int index = sort.length-1; index> 0; index--)
(E) Replace Line 6 with: for (int index = 1; index> 0; index--)
```

Questions 3-5 refer to the following incomplete class declaration used to represent fractions with integer numerators and denominators. 

```java
public class Fraction{
    private int numerator; 
    private int denominator; 
    public Fraction()
    {
        numerator = 0 ;
        denominator = 1; 
    }

    public fraction (int n, int d) 
    {
        numerator = n;
        denominator = d;  
    }

    // postcondition: returns the 
    // numerator 
    Public int getNumerater () 
    {/*implementationnot shown */}

    // postcondition: returns the greatest 
    // common divisor of x and y
    public int gcd(intx, int y )
    {
        /* implementation not shown*/ 
    } 

    // postcondition: returns the Fraction 
    // that is the result of multiplying 
    // this Fraction and f 
    public Fraction multiply (fraction f) 
    {/* implementation not shown*/ } 

    //... other methods not shown 
}

```

3. Consider the method multiply of the Fraction class. 

```java
//postcondition:returns the Fraction 
//that is the result of multiplying 
//  Fraction and f 
public Fraction multiply(Ftaction f)
{/*missing code */} 
```

Which of the following statements can be used to replace /* missing code */ so that the multiply method is correctly implemented? 

```java
I. return Fraction ( 
    numerator * f.getNumerator(),
    denominator* f.getDenominator() 
)
II. return new Fraction ( 
    numerator * f.numerator,
    denominator* f.getDenominator() 
)
III. return new Fraction ( 
    numerator * f.getNumerator(),
    denominator* f.getDenominator() 
)
```

(A) I only 
(B) II only 
(C) III only 
(D) I and III only 
(E) II and III only 

4. Consider the use of the Fraction class to multiply the fractions $\frac 3 4$ and 7/19. Consider the following code: 

```java
Fraction fractionOne; 
Fraction fractionTwo;
Fraction answer;  
fractionOne = new Fraction (3, 4);
fractionTwo = new Fraction (7, 19);
/* missing code */
```

Which of the following could be used to replace /* missing code */ so that the answer contains the result of multiplying fractionOne by fractionTwo? 

```java
(A) answer = fractionOne * fractionTwo;
(B) answer = multiply (fractionOne, fractionTwo); 
(C) answer = fractionOne.multiply(fractionTwo); 
(D) answer = new Fraction (fractionOne, fractionTwo);
(E) answer = (fractionOne. getNumerator () * fractionTwo.get JMumerator() ) /(fractionOne.getDenominator() * fractionTwo.getDenominator());
```

4. The following incomplete class declaration is intended to extend the Fraction class so that fractions can be manipulated in reduced form (lowest terms). 

Note that a fraction can be reduced to lowest terms by dividing both the numerator and denominator by the greatest common divisor (gcd) of the numerator and denominator. 

```java
public class ReducedFraction extends Fraction 
{
    private int reducedNumerator; 
    private int reducedDenominator;
    //... constructors and other methods not shown  
}
```

Consider the following proposed constructors for the ReducedFraction class: 

```java
I. public ReducedFraction( ) 
{
    reducedNumerator=0;
    reducedDenominator= 1;
}

II. public ReducedFraction(int n, int d) 
{
    numerator = n;
    denominator = d; 
    reducedNumerator = n / gcd(n, d) ;
    reducedDenominator = d / gcd(n, d)   
}

III. public ReducedFraction (int n, int d) 
{
    super(n,d);
    reducedNumerator = n /gcd(n< d);
    reducedDenominator = d / gcd(n, d);
}
```

Which of these constructor(s) would be legal for the ReducedFraction class? 

(A) I only 
(B) II only 
(C) III only 
(D) I and III only 
(E) II and III only 
