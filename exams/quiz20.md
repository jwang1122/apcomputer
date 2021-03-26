Questions 1 and 2 refer to the search method in the Searcher class below. 

```java
public class Searcher 
{
    private int [] arr; 

    //Constructor. Initializes arr with integers. 
    public Searcher () 
    { /* implementation not shown*/ } 

    /* precondition: arr[first].. .arr[last] sorted in ascending order. 
     * postcondition: Returns index of key in arr. If key not in arr, 
     * returns -1 */ 
     public int search(int first, int last, int key) 
     {
         int mid; 
         while (first <= last)
         {
             mid = (first + last) / 2;
             if (arr[mid] == key)  //found keY’ exit search 
                return mid; 
            else if (arr[mid] < key)  //key to right of arr[mid] 
                first = mid + 1;
            else                    //key to left of an [mid]
                last = mid - 1;
         } 
         return -1;   //key not in list 
     }
}
```

1. Which assertion is true just before each execution of the while loop? 

(A) arr[first] < key < arr[last]

(B) arr[first] $\leq$ key $\leq$ arr[last]

(C) arr[first] < key < arr[last] or key is not in arr

(D) arr[first] $\leq$ key $\leq$ arr[last] or key is not in arr

(E) key $\leq$ arr[first] or key $\geq$ arr[last] or key is not in arr

2. Consider the array a with values as shown: 

    4, 7, 19, 25, 36, 37, 50, 100, 101, 205, 220, 271, 306, 321 

where 4 is a[0] and 321 is a[13]. Suppose that the search method is called with first = 0 and last = 13 to locate the key 205.  How many iterations of the while loop must be made in order to locate it?

```
(A) 3
(B) 4
(C) 5
(D) 10
(E) 13
```

3. Consider the following RandomList class. 

```java
public class RandomList 
{
    private int[] myList;

    //constructor 
    public RandomList () 
    { myList= getList() ; }

    /* Read random Integers from 0 to 100 inclusive into array list. */ 
    public int[] getList() 
    {
        System.out.println ("How many integers?") ;
        int listLength = IO.readInt();  //read user input 
        int [] list = int [listLength]; 
        for (int i=0; i<listLength; i++)
        {
            /* code to add integer to list */ 
        }
        return list; 
    }

    /* Print all elements of this list.*/ 
    public void printList()
    {
        ...
    }
}
```

Which represents correct /* code to add integer to list */? 

(A) list[i] = (int) (Math.random() * 101); 

(B) list.add((int) (Math.random() * 101));

(C) list[i] = (int) (Math.random() * 100); 

(D) list.add((int) (Math.random() * 100));

(E) list[i] = (int) (Math.random() * 100) + 1; 

4. Refer to method insert described here. The insert method has two string parameters and one integer parameter. The method returns the string obtained by inserting the second string into the first starting at the position indicated by the integer parameter pos. For example, if str1 contains xy and str2 contains cat, then  

```java
insert (str1,str2, 0) returns catxy 
insert (str1,str2, 1) returns xcaty 
insert (str1,str2, 2) returns xycat 
```

Method insert follows:

//Precondition: 0 <= pos <= str1.length().
//postcondition: If strl = $a_0 a_1 \cdot\cdot\cdot a_{n-1}$ and str2 = $b_0 b_1 \cdot\cdot\cdot b_{n-1}$ returns $a_0 a_1 \cdot\cdot\cdot a_{pos-1}b_0 b_1 \cdot\cdot\cdot b_{m-1}a_pos a_{pos+1} \cdot\cdot\cdot a_{n-1}$

```java
public static String insert (String str 1, String str2, int pos) 
{
    String first, last; 
    /* more code */
    return first + str2 + last;  
}
```

Which of the following is a correct replacement for /* more code */?

```java
(A) first = str1.substring(0, pos) ; 
    last = str1.substring(pos);
(B) first = str1.substring (0, pos - 1);  
    last = str1.substring(pos);
(C) first = str1.substring (0, pos + 1);  
    last = str1.substring(pos+1);
(D) first = str1.substring (0, pos);  
    last = str1.substring(pos+1, str1.length());
(E) first = str1.substring (0, pos);  
    last = str1.substring(pos, str1.length() + 1);
```

5. A matrix (two-dimensional array) is declared as 

```java
int[][]  mat = new int[2][3]; 
```

Consider the following method: 

```java
public static void changeMatrix(int[][]  mat )
{
    for (int r = 0; r< mat.length; r++)
        for (int c = 0; c< mat[r].length; c++)
            if (r == c) 
                mat[r][c] = Math.abs(mat[r][c]);
}
```

If mat is initialized to be 

```
-1 -2 -6
-2 -4 5  
```

which matrix will be the result of a call to changeMatrix(mat)? 

```
(A) 1 -2 -6 
    -2 4 5 
(B) 1 -2 -6 
    2 -4 5 
(C) -1 -2 -6 
    -2 -4 -5 
(D) 1 2 -6 
    2 4 5 
(E) 1 2 6 
    2 4 5 
```