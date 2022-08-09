Here is a code example of how a binary search might look for array nums when searching for target, assuming nums is sorted: 

```java
int front= 0, back = nums.length - 1, middle = 0;
boolean isFound= false;
while ( (front <=back) && ( !isFound))
{
    middle = (front + back) / 2;
    if (nums[middle] < target) 
    {
        front = middle + 1; 
    }
    else if (nums [middle] >target) 
    {
        back = middle-1; 
    }
    else 
    {
        isFound= true; 
    }
}  
if (isFound) 
{
    System.out.println( "Found at "+ middle);
}
else 
{
    System.out.printin ("Target Not Found"); 
}
```
On the AP Exam, you will not be required to WRITE a search algorithm; however, you will be required to RECOGNIZE a search algorithm and trace it, which can be done the easy way if you understand the algorithm, or the hard way by actually tracing the code, step by step. Try to identify the key characteristics of each search, for example, the “sum divided by 2” line is a good indicator of a binary search. The for-each loop will span the entire array, which may indicate a sequential search. 

1. Which of the following statements is true, regarding search algorithms? 
(A) Searching for a Twix in a row of unsorted candy is most efficient using a sequential search. 
(B) Searching for a Twix in a row of unsorted candy is most efficient using a binary search. 
(C) Searching for a Twix in a row of sorted candy is most efficient using a sequential search.
(D) Searching for a Twix in a row of sorted candy is most efficient using a binary search. 
(E) None of these 

2. Assuming target is in array a, which of the following methods will correctly return the index of target in sorted array a?

```java
I. public int findTarget (int[] a, int target) 
    {
        for (int x = 0; x<a.length; x++)
            if (a[x] == target)
                return x;  
    }

II. public int findTarget (int[] a, int target) 
    {
        for (int x: a)
            if (a[x] == target)
                return x;  
        return -1;
    }

III. public int findTarget (int[] a, int target) 
    {
        int f= 0, h=a.length, g=0; 
        for (int i=0; i<h; i++)
        {
            g = (f+h)/2;
            if (a[g] < target)
                f = g+1;
            else if (a[g]>target)
                h = g-1;  
        }
        if(a[g] == target)
            return g;
        return -1;
    }
```

(A) I only
(B) II only
(C) I and II
(D) II and III only
(E) I, II, and III

3. Consider the following code segment: 

```java
int[][] num = new int [ 4 ] [ 4 ];
for (int i= 0; i < num.length; i++)
{
    for (int k = 0; k < num.length; k++ )
    {
        num[i] [k] = i * k; 
    }
} 
```

What are the contents of num after the code segment has executed? 

(A) 0 0 0 0 
    0 1 2 3 
    0 2 4 6
    O 3 6 9

(B) 0 1 2 3
    1 2 3 4
    2 3 4 5 
    3 4 5 6 
(C) 0 3 6 9 
    O 2 4 6
    0 1 2 3
    0 0 0 0
(D) 1 1 1 1
    2 2 2 2 
    3 3 3 3
    4 4 4 4
(E) 0 0 0 0
    1 2 3 4
    2 4 6 8
    3 6 9 12

4. Consider the following class:

```java
public class College extends School 
{
    // private data fields not shown 

    // the only constructor in this class 
    public College(String town, double tuition)
    {
        //code not shown         
    } 
    // other methods not shown 
}
```
In order to write Law Academy, a subclass of College, which of the following
constructors is valid?

```java
I. public LawAcademy (string twn, double tuit)
{
    super.College(twn, tuit) ; 
}

II. public LawAcademy (string twn, double tuit)
{
    super(twn, tuit) ; 
}

II. public LawAcademy (string twn, double tuit, String st)
{
    super(st, tuit) ; 
}

```

(A) II only
(B) I and II only
(C) I and III only
(D) II and III only
(E) I, II, and III

5. Consider a class Recliner that extends a Chair class. Assuming both classes each have a no-parameter constructor, which of the following statements is not valid?

(A) Object a = new Recliner();
(B) Recliner b = new Chair();  
(C) Chair c = new Chair(); 
(D) Chair d = new Recliner(); 
(E) All of the above choices are valid. 
