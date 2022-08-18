A toy collector is creating an inventory of her marble collection. A marble set specifies the color and number of a particular group of marbles from her collection. The declaration of the MarbleSet class is shown below. 

```java
public class MarbleSet
{
    /** Constructs a new MarbleSet object */
    public MarbleSet (String color, int numMarbles) 
    {/* implementation not shown*/}  

    /** @return the color of the set of marbles 
    */
    public String getColor () 
    {/* implementationnot shown */}

    /** @return the number of marbles in the set 
    */
    public int getNumber () 
    { /* implementationnot shown*/ } 

    // There may be instance variables, constructors, and methods that are not shown. 
} 
```

The MarbleCollection class documents all sets of marbles in the collection. The declaration of the MarbleCollection classis shown below. 

```java
public class MarbleCollection 
{
    /**This is a list of all marble sets */ 
    private List<MarbleSet> sets;

    /** Constructs a new MarbleSet object */ 
    public MarbleCollection()
    {sets= new ArrayList<MarbleSet>();   }

    /** Adds theSet to the marble collection 
    * @param theSet the marble set to add to the marble collection 
    */
    public void addSet (MarbleSet theSet) 
    { sets.add(theSet); }

    /** return the total number of marbles 
    */
    public int getTotalMarbles () 
    { /* to be implemented in part (a)*/} 

    /** Removes all the marble sets from the marble collection that have the same color as 
    * narbleColor and returns the total number of marbles removed 
    * @param marbleColor the color of the marble sets to be removed 
    * @returnthe total number of marbles of marblecolor in the marble sets removed 
    */
    public int removeColor (String marbleCol) 
    {/* to be implemented in part (b)*/} 
}
```

(a) The getTotalMarbles method computes and returns the sum of the number of marbles. If there are no marble sets, the method returns 0. 

Complete method getTotalMarbles below 

```java
/** @return the sum of the number of marbles in all marble sets 
*/
public int getTotalMarbles ()
```

(b) The removeColor updates the marble collection by removing all the marble sets for which the color of the marbles matches the parameter marbleCol. The marble collection may contain zero or more marbles with the same color as the marbleCol. The method returns the number of marbles removed.

For example, after the execution of the following code segment 

```java
MarbleCollection m = new MarbleCollection () ; 
m.addSet(new MarbleSet ("red", 2)); 
m.addSet(new MarbleSet ("blue", 3)); 
m.addSet(new MarbleSet ("green", 3)); 
m.addSet(new MarbleSet ("blue", 4)); 
m.addSet(new MarbleSet ("red", 1)); 
```

the contents of the marble collection can be expressed with the following table. 

|         |         |          |         ||
|---      |---      |---       |---      |---|
| "red" 2 |"blue" 3 |"green" 3 |"blue" 4 |"red" 1 | 

The method call m. removecolor ("red") returns 3 because there were two red marble sets containing a total of 3 marbles. The new marble collection is shown below. 

|         |         |          |
|---      |---      |---       |
|"blue" 3 |"green" 3 |"blue" 4 | 

The method call m.removecolor("purple") returns 0 and makes no modifications to the marble collection. 

Complete the method removeColor below. 

```java
    /** Removes all the marble sets from the marble collection that have the same color as 
    marbleColor and returns the total number of marbles removed 
    * @param marbleColor the color of the marble sets to be removed 
    * @return the total number of marbles of marbleColor in the marble sets removed 
    */
    public int removeColor (String marbleColor) 
```