1. Consider the following method. 

```java
public void mystery(int n) 
{
    int k; 
    for (k =0; k<n; k++)
    {
        mystery (k) ;
        System.out.print(k) ; 
    } 
}
```

What is printed by the call mystery (3) ?

(A) 0123 
(B) 00123 
(C) 0010012
(D) 00100123 
(E) 001001200100123  

2. Consider an array of integers. 
    4 10 1 2 6 7 3 5   
If selection sort is used to order the array from smallest to largest values, which of the following represents a possible state of the array at some point during the selection sort process? 

(A) 1 4 10  2  3 6  7 5
(B) 1 2  4  6 10 7  3 5
(C) 1 2  3 10  6 7  4 5
(D) 4 3  1  2  6 7 10 5
(E) 5 3  7  6  2 1 10 4

3. Consider the following code segment: 

```java
int k; 
int a [ ] ;
a = new int[7];
for (k = 0; k < a.length; k++) 
{
    a [ k] = a.length - k; 
} 
for (k =0; k < a.length- 1; k++) 
{
    a [k+1] = a[k] ; 
}
```

What values will A contain after the code segment is executed? 
(A) 1 1 2 3 4 5 6
(B) 1 2 3 4 5 6 7
(C) 6 6 5 4 3 2 1
(D) 7 7 6 5 4 3 2
(E) 7 7 7 7 7 7 7

4-5 refer to the following two classes. 

```java
public class PostOffice
{
    // constructor initializes boxe 
    // to length 1OO 
    public PostOffice()
    {
        /* implementationnot shown */ 
    }
    // returns the P.O. Box based on the given P.O. Box number 
    // 0 <= theBox < getNumBoxes () 
    public Box getBox (int theBox) 
    {* implementation not shown*/} 

    // returns the number of p.o. boxes 
    public int getNumBoxes () 
    {/* implementationnot shown*/} 

    // private data members and 
    // other methods not shown 
} 

public class Box
{
    // constructor 
    public Box() 
    {/* implementation not shown */ }

    // returns the number of this box  
    public int getBoxNumber ( ) 
    {/* implementation not shown */}

    // returns the number of pieces 
    //of mail in this box 
    public int getMailcount () 
    {/* implementation not shown */ } 

    // returns the given piece of mail 
    //0 <= thePiece < getMailCount ( )
    public Mail getMail (int thePiece) 
    {/* implementation not shown */ }  
    // true if the box has been assigned 
    // to a customer 
    public boolean isAssigned () 
    {/*implementation not shown */}
    // true if the box contains mail 
    public boolean hasMail ( ) 
    {/* implementation not shown */ } 
    // private data members and 
    // other methods not shown 
} 

public class Mail
{
    // private members, constructors, and 
    // other methods not shown 
} 
```

4. Consider the following code segment: 

```java
PostOffice p[];
p = new PostOffice[10] ;  
```

Assuming that the box has been assigned and that it has at least four pieces of mail waiting in it, what is the correct way of getting the fourth piece of mail from the 57th box of the 10th post office of p?

```java
(A) Mail m = p[10].getBox(57).getmail(4);
(B) Mail m = p[9].getBox(56).getmail(3);
(C) Mail m = p.getMail(57).getmail(4)[10];
(D) Mail m = getmail(getBox(p[9],560,3);
(E) Mail m = new Mail(10,57,4);
```

5. Consider the incomplete function printEmptyBoxes given below. printEmptyBoxes should print the box numbers of all of the boxes that have been assigned to a customer but do not contain mail. 

```java
public void printEmptyBoxes(Postoffice[] p)
{
    for (intk = 0; k< p. length- 1 ; k++) 
    {
        for (int x = 0; x < p [k].getNumBoxes () - 1 ;x++)   
        {
            /* missing code*/
        }
    }
} 
```
Which of the following could be used to replace /* missing code*/ sq that printEmptyBoxes works as intended? 

```java
(A) if (p[k].getBox(x).isAssigned() && !p[k].getBox(x)..hasMail())
{
    System.out.println(p[k].getBox(x).getBoxNumber());
}
(B) if (p[x].getBox(k).isAssigned() && !p[x].getBox(k)..hasMail())
{
    System.out.println(p[x].getBox(k).getBoxNumber());
}
(C) if (p[k].getBox(x).isAssigned() && !p[k].getBox(x)..hasMail())
{
    System.out.println(p[k].getBoxNumber(x));
}
(D) if (p[x].getBox(k).isAssigned() && !p[x].getBox(k)..hasMail())
{
    System.out.println(p[x].getBoxNumber(k));
}
(E) if (p[x].getBox(k).isAssigned() && !p[x].getBox(k)..hasMail())
{
    System.out.println(k);
}
```