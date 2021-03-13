# AP COMPUTER quiz11
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 
But our goal is 5 minutes.

Use the following incomplete class declarations to answer Questions 1 and 2.

```java
public class Number 
{
    private int value; 
    public Number(int someNum)
    {
        if(someNum>= 0)
            value = someNum; 
    } 
    public int changeVal (int newVal)
    {
        /* missine code */ 
    } 

    public int getValue () 
    {
        return value;
    }
}

public class NumChanger 
{
    public void change()
    {
        Number n1 = new Number(5) ;
        Number n2 = new Number(5) ;
        int sum1 - nl.getvalue () + n2.getvalue ();
        int oldn1Val= n1.changeValue (10 );
        n2=n1;
        int sum2 = nl.getvalue () + n2.getvalue ();
        System.out.print (sum1+ " " + sum2) ; 
    }
    //other methods not shown 
}
```
1. The change Vai method in Number should reassign value to be the value taken as the parameter and return the original value. Which of the following code segments should be used to replace / * missing code * / so that changeVal will work as intended? 

```java
(A) value = newVal;
    return value;
(B) value = newVal;
    return 5;
(C) int oldVal= value;
    value = newVal;
(D) int oldVal= value;
    value = newVal;
    return value;
(E) int oldVal= value;
    value = newVal;
    return oldVal;
```

2. What will be printed as a result of executing the change method? Assume changeVal in the Number class works as intended. \

```
(A) 5 5
(B) 5 10
(C) 10 5
(D) 10 10
(E) None of these

```

3. The following method is intended to output “Strings match.” if the two strings contain identical data and otherwise print “Strings do not match.” 

```java
public void match (String s, String t) 
{
    if( /* missing code */)
        System.out.println ("Strings match."); 
    else
        System.out.println("Strings do not match.")
}
```  
Which of the following statements could replace / * missing code */to allow the method to work as intended? 

```java
I.  s.compareTo(t) ==0
II. compareTo(s, t) ==0
III. s == t 

(A) I only
(B) III only
(C) I and III only
(D) II and III only
(E) I, II and III

```

4. A class called ComputerMouse has a static variable connector and a static method getConnector. Which of the following statements is true based on this information? 

(A) In order to invoke getConnector, a new ComputerMouse object does not need to be instantiated; getConnector must be called directly through the object class. 

(B) In order to invoke getConnector, a new ComputerMouse object must be instantiated and then getConnector must be called through that object. 

(C) Since connector is declared static, getConnector is shared among all objects in the program.  

(D) Since connector is declared static, ComputerMouse objects cannot be mutated during execution. 

(E) Since connector is declared static, all of the methods in*ComputerMouse must also be declared static. 

5. A development team is building an online bookstore that customers can use to order books. Information about inventory and customer orders is kept in a database. Code must be developed that will store and retrieve data frcmtkie database. The development team decides to put the database code in separate classes from the rest of the program. Which of the following would be an advantage of this plan? 

I. The database access code could be reused in other applications that also need to access the database. 
II. The database access code can be tested independently- It will be possible to test the database access code before the interface is developed. 
III. A team of programmers can be assigned to work just on the code that is used to access the database. The programmers can work independently from other programmers, such as those who develop the user interface. 

(A) I only 
(B) II only 
(C) III only
(D) I and II only 
(E) I, II, and III  