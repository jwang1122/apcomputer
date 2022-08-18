Questions 1-2 refer to the following incomplete class declaration for a new data type called a Quack. 

```java
public class Quack
{
    ArrayList<Object> myData; 

    // Constructor initializes myData
    public Quack() 
    {/* implementation not shown */} 

    // Quack. 
    public void enquack(Object x)
    {/* implementation not shown */  }  

    // if front is true, returns the object at the front end of the Quack; 
    // otherwise returns the object at the back end of the 
    // Quack. Assumes the Quack is not empty
    public Object dequack (boolean front) 
    {/*implementation not shown*/ }

    // Returns true if the Quack has no objects; otherwise returns false. 
    public boolean isEmpty () 
    {/* implementation not shown */ }

     <designation> ArrayList myData;

     //... other methods and data not shown  
} 
```

1. Which of the following is the best choice for <designation> and the best reason for that choice? 

(A) <designation> should be private so that programs using a Quack will not be able to modify inybata by using methods enquack and dequack, thereby preserving the principle of data stability.
(B) <designation> should be private so that programs using a Quack can modify myData only by using methods such as enquack and dequack, thereby preserving the principle of information hiding. 
(C) <designation> should be private as an indication to programs using a Quack that myData can be modified directly but that it is better to modify myData only by using methods such as enquack and de quack, thereby , preserving the principle of maximum information dissemination. 
(D) <designation> should be public because programs using a Quack need to know how the Quack class has been mplemented in order to use it. 
(E) <designation> should be public. Otherwise, only objects constructed from derived subclasses of a Quack will be able to modify the contents of a Quack. 

2. Which of the following is an effective return statement for isEmpty as described in the incomplete declaration above? 

```java
(A) return (myData.length ==0)
(B) return (size() == 0) 
(C) return (myData.size() == 0) ;
(D) return (mybata.length() ==0 )
(E) return(myData.size == 0) 
```

3. Consider the following method definition. 

```java
public static int mystery (int n) 
{
    if (n <= 1)
        return 2;
    else
        return. 1 + mystery (n - 3) ; 
}
```

Which of the following lines of code can replace the line in mystery containing the recursive call so that the functionality of mystery does not change? 

```java
(A) return 1+ ((n + 2) / 3); 
(B) return 1+ ((n + 3) / 2); 
(C) return 2+ ((n + 1) / 3); 
(D) return 2+ ((n + 2) / 3); 
(E) return 3+ ((n + 1) / 2); 
```

Questjons 4-5 refer to the following incomplete class declaration. 

```java
public class DistanceTracker 
{
    private int kilometers; 
    private int meters; 
    /* Constructs a DistanceTracker object 
     * @param k the number of kilometers 
     * precondition: k >= 0 
     * @param m the number of meters
     * precondition: 0 <=m < 1000
     */
     public DistanceTracker (int k, int m)
     {
        kilometer = k ;
        meters = m; 
     }  
    /* @return the number of kilometers 
     */
    public int getkiiometers() 
    { /* implementation not shown*/} 

    /* @returnthe number of meters 
     */
    public int getMeters() 
    { /* implementation not shown*/} 

    /* Adds k kilometers and m meters 
     * @param k the number of kilometers 
     * precondition: k >= 0
     * paparam m the number of meters
     * precondition: m >= 0 
     */
    public void addDistance (int k, int m) 
    {
        kilometers += k;
        meters += m;
        /*rest of method not shown */  
    }
    //Rest of class not shown 
}
```

4. Which of the following code segments can be used to replace /* rest of method not shown*/ so addDistance will correctly increase the distance? 

```java
(A) kilometers += meters / 1000
    meters = meters / 1000 
(B) kilometers += meters % 1000
    meters = meters / 1000 
(C) kilometers += meters % 1000
(D) kilometers += meters % 1000
(E) meters = meters % 1000 
```

5. Consider the following incomplete class declaration. 

```java
public class DistanceTrackerSet
{
    Distance Tracker[] set; 
    /*Declaration method not shown*/ 

    public DistanceTracker total ()
    {
        DistanceTracker temp = new DistanceTracker (0, O ) ; 
        for (int k =0; k< set.length; k++) 
        {
            /* missing code */
        }
        return temp; 
    } 
    /*Other methods not shown*/ 
} 
```

Assuming set is properly initialized with DistanceTracker objects and all needed classes are properly imported, whidx of the following can be used to replace / * missing code * / so that the method returns a DistanceTracker object with the total of all distances stored in set? 

```java
(A) temp.addDistance(temp[k].kilometers, temp[k].meters); 
(B) set[k].addDistance(temp[k].getKilometers(), temp[k].getMeters()) ; 
(C) set[k].addDistance();
(D) temp += temp.addDistance() ; 
(E) temp.addDistance(temp[k].getKilometers(), temp[k].getMeters());
```