1. Consider the following method. 

```java
/** precondition: numListis not empty 
 */

private int mystery (int [ ] numList)
{
    int n = numList [numList.length-1];
    for (int k : numList) 
    {
        if (n > k) 
        {
            n = k; 
        }
    } 
    return n;
}
```

Which of the following best describes the return of mystery? 

(A) The largest value in the array numList 
(B) The least value in the array numList 
(C) The index of the largest value in the array numList 
(D) The index of the least value in the array numList 
(E) The number of indexes whose values are less than numList [n] 

2. Consider the following method. 

```java
public int [ J editArray (int [ ] arr, int oldNum, int newNum) 
{
    /* missing code*/ 
    return arr;
}
```

The method above is intended to replace any instance of oldNum in arr with any instances of newNum. Which of the following can be used to replace /* missing code */ to replace any values of old in the array with values of newNum? 

```java
(A) for (int k = 0; k < arr.length; k++) 
    {
        if (arr[k] = oldNum)
        {
            arr [k] == newNum; 
        } 
    }
(B) for (int k = 0; k < arr.length; k++) 
    {
        if (arr[k] == oldNum)
        {
            arr [k] = newNum; 
        } 
    }

(C) while (arr[k] == oldbJum) 
    {
        arr [k]= newNum;
    }
(D) for (int k = 0; k < arr.length; k++) 
    {
        arr [k]= newNum;
    }
(E) while (int k = 0; k < arr.length; k++) 
    {
        if (arr[k] = oldNum)
        {
            arr [k] == newNum; 
        } 
    }
```

3. Consider the following two classes. 

```java
public class SalesPerson 
{
    public void sale() 
    {
        System.out.print("greet") ; 
        pitch () ;
    }

    public void pitch () 
    {
        System.out.print("pitch");
    }
}

public class CommissionedSalesPerson extends Salesperson 
{
    public void sale () 
    {
        super.sale() ; 
        System.out.print("record ") ; 
    }
    public void pitch () 
    {
        super.pitch ( );
        system.out.print("close") ; 
    }
}
```

The following code segment is found in a class other than salesperson. 

```java
Salesperson vincent = new CommissionedSalesPerson () ; 
vincent.sale();
```

Which of the following is the best description of the functionality of this code segment? 
(A) greet pitch 
(B) greet pitch close 
(C) greet pitch record 
(D) greet pitch record close 
(E) greet pitch close record

4. Consider the following declaration of a class that will be used to represent dimensions of rectangular crates. 

```java
public class Crate 
{
    private int length; 
    private int width; 
    private int height; 

    public Crate (int x, int y, int z) 
    {
        length = x;
        width = y;
        height = z;   
    }

    //other methods not shown 
}
```

The following incomplete class declaration is intended to extend the Crate class so that the color of the crate can be specified. 

```java
public class ColoredCrate extends Crate 
{
    private String color;
    //Constructorsnot shown 
    //Other methodsnot shown  
}
```

Which of the following possible constructors for ColoredCrate would be considered legal? 

```java
I. public ColoredCrate (int a, int b, int c. String crateColor) 
{
    length = a; 
    width = b; 
    height = c; 
    color = crateColor; 
}
II. public ColoredCrate (int a, int b, int c. String crateColor) 
{
    super(a,b,c)
    color = crateColor; 
}

III. public Coloredcrate () 
{
    color = "";
}
```

(A) I only 
(B) III only 
(C) I and II only 
(D) I and III only 
(E) II and III only

5. Consider the following three proposed implementations of method reverse, intended to return an ArrayList of the objects in reversed order: 

```java
I.  public static ArrayList<Object> reverse (ArrayUst<Object> q) 
    {
        Arraylist<Object> s = new ArrayList<Object> () ;
        while (q.size() != 0)
            s.add(0, q.remove (0)) ; 
        return s;
    }
II.  public static ArrayList<Object> reverse (ArrayUst<Object> q) 
    {
        Arraylist<Object> s = new ArrayList<Object> () ;
        for (int k=0; k<q.size(); k++)
            s.add(0, q.remove (0)) ; 
        return s;
    }
III.  public static ArrayList<Object> reverse (ArrayUst<Object> q) 
    {
        Object obj;
        if(q.size() !=0)
        {
            obj = q.remove(0);
            q = reverse(q);
            q.add(obj);
        }
        return q;
    }
```

Which of the above implementations of method reverse work as intended? 
(A) I only 
(B) III only 
(C) I and II only 
(D) I and III only 
(E) I, II and III 