1. Consider the following precondition, postcondition, and signature for the getDigit method. 

```java
// precondition: n >= 0 whichDigit >= 0 
// postcondition: Returns the digit of n in the whichDigit position 
// when the digits of n are numbered from right to left starting with zero. 
// Returns O if whichDigit number of digits of n. 

int getDigit (int n, int whichDigit) 
```

Consider also the following three possible implementations of the getDigit method. 

```java
I.  if (whichDigit== 0) 
        return n %10;
    else 
        return getDigit (n / 10, whichDigit - 1) ; 

II. return (n / (int) Math.pow(10, whichDigit) ) % 10; 

III. for (int k = 0; k < whichDigit; k++)
        n /= 10; 
    return n %10;
```

Which implementation(s) would satisfy the postcondition of the getDigit method? 

(A) I and II only 
(B) I and III only 
(C) II and III only 
(D) I, II and III 
(E) None of the above 

2. Consider an array of integers. 
        4 10 1 2 6 7 3 5 
   
   Assume that SelectionSort is used to order the array from smallest to largest values. >
Which of the following represents the state of the array immediately after the first iteration of the outer for loop in the SelectionSortprocess? 

(A) 1 4 10 2 3 6 7 5
(B) 1 2 4 6 10 7 3 5
(C) 1 10 4 2 6 7 3 5
(D) 4 3 1 5 6 7 10 2
(E) 5 3 7 6 2 1 10 4

3. Assume that a program declares and initializes v as follows. 

```java
String[] v;
v = initialize(); // Returns an array of length 10 containing ten valid strings   
```

Which of the following code segments correctly traverses the array backwards and prints out the elements (one per line)? 

```java
I.  for (int k = 9; k >= 0; k--)
        System.out.println(v[k]) ;
II. int k = 0;
    while (k < 10 ) 
    {
        System.out.println(v[9-k]) ;
        k++;
    }

III. int k = 10;
    while (k >= 0 ) 
    {
        System.out.println(v[k]) ;
        k--;
    }   
```

(A) I only 
(B) II only 
(C) I and II only 
(D) II and III only 
(E) I, II and III 

4. Consider the following method. 

```java
/**precondition: @param set an ArrayList that contains distinct integers 
 * @param n an int value
 */
public int mystery (List<Integer> set, int n)
{
    for (int k = 0; k< set.length() ; k++)
    {
        if (set.get (k) > n) 
        {
            return (set.remove (k) + mystery(set, n)); 
        }

    }
    return 0;
}  
```

What is returned by the method call mystery(set, n) ?

(A) 0
(B) The number of elements of set that are greater than n
(C) The sum of the elements of set that are greater than n 
(D) The sum of the elements of set that are less than n 
(E) The sum of the elements of set that are less than or equal to n 

5. Consider the following two-dimensional array

[[0, 0, 0, 0 ] 
[0, 1, 0, 0 ] 
[0, 1, 2, 0 ] 
[0, 1, 2, 3 ]]

Which of the following methods returns this two-dimensional array? 

```java
(A) public int[][] nums()
    {
        int [][] temp = new int[4][4];
        for (int j =0; j < 4; j++)
        {
            for (int k = 0; k < 4; k++)
            {
                temp[j][k] = j; 
            }
        }
        return temp;
    }
(B) public int[][] nums()
    {
        int [][] temp = new int[4][4];
        for (int j =0; j < 4; j++)
        {
            for (int k = 0; k < 4; k++)
            {
                temp[j][k] = k; 
            }
        }
        return temp;
    }
(C) public int[][] nums()
    {
        int [][] temp = new int[4][4];
        for (int j =0; j < 4; j++)
        {
            for (int k = j; k < 4; k++)
            {
                temp[j][k] = k; 
            }
        }
        return temp;
    }
(D) public int[][] nums()
    {
        int [][] temp = new int[4][4];
        for (int j =0; j < 4; j++)
        {
            for (int k = 0; k <= j; k++)
            {
                temp[j][k] = j; 
            }
        }
        return temp;
    }
(E) public int[][] nums()
    {
        int [][] temp = new int[4][4];
        for (int j =0; j < 4; j++)
        {
            for (int k = 0; k <=j; k++)
            {
                temp[j][k] = k; 
            }
        }
        return temp;
    }
```