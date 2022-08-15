A binary, or base two, integer is a number consisting of digits that are either 0 or 1. Digits in a binary integer are numbered from right to left starting with 0. 

The decimal value of the binary integer is the sum of each digit multiplied by 2d where d is the number of the digit. 

For example, the decimal value of the binary integer 1011O1O is 

$$ (0 \cdot 2^0) + (1 \cdot 2^1) + (0 \cdot 2^2) + (1 \cdot 2^3) + (1 \cdot 2^4) + (0 \cdot 2^5) + (1 + 2^6) $$
$$=0 + 2 + 0 + 8+16 + 0 + 64$$
$$=90$$

A decimal integer can be converted into its corresponding binary integer according to the following algorithm: 
* Calculate the remainder when the decimal integer is divided by 2. This is the rightmost digit of the corresponding binary integer. 
* Divide the decimal integer by 2 using integer division. If the result is 0, stop. Otherwise, repeat the algorithm using the new value of the decimal integer. 

The digits produced will be in right-to-left order in the binary integer. 

instance, the decimal integer 90 can be converted into its corresponding binary integer as follows: 

```java
90 % 2 = 0   (the rightmost digit) 
90 / 2=45 45 % 2 = 1 (the second digit from the right) 
45/2=22 22 % 2 = 0  (the third digit from the right) 
22/2=11 11%2 = 1 (the fourth digit from the right) 
11 / 2 = 5   5 % 2 = 1 (the fifth digit from the right) 
5/2=2 2%2 = 0(the sixth digit from the right) 
2/2=1 1% 2 = 1 (the leftmost digit)
1/2=0  

```

Consider the design of a class that represents an arbitrary length non-negative binary integer. 
The operations on this class include 

* constructing an empty binary integer with value zero 
* constructing a binary integer from an arbitrary non-negative decimal integer 
* returning a binary integer that represents the result of adding another binary integer to this binary integer 
* returning the result of converting this binary integer to a String 
* returning a positive integer if this binary integer is less than another binary integer, zero if it is equal, and a negative integer if it is less

In addition, the binary integer class should fully implement the Comparable interface. 
(a) Write the definition of a binary integer class called Binarylnt, showing the appropriate data definitions, constructors, and method signatures. You should not write the implementations of the constructor or any of the methods you define for the Binarylnt class

(b) Using the signature you wrote in part (a), write the implementation for the operation that constructs a Binarylnt from an arbitrary decimal integer. In writing this method, you may call any of the methods in the Binarylnt class (as you defined it in part (a)). Assume that these methods work as specified. 

(c) Using the Binary Int class (as you defined it in part (a)), complete the following method, Test, that adds the following pairs of decimal integers in binary and outputs the larger of the two binary sums. Test is not a method of the binary integer class.  

Pair 1: 2,314,279,623 and 3,236,550,123. Pair 2: 3,412,579,010 and 2,128,250,735. 

In writing this method, you may call any of the methods Binarylnt (as you defined it in part (a)). Assume that these methods work as specified. 

Complete method Test below. 
```java
public static void Test () 
```