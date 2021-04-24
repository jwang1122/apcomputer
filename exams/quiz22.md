Questions 1-3 refer to the Time class declared below: 

```java
public class Time 
{
    private int myHrs; 
    private int myMins; 
    private int mySecs;

    public Time() 
    {/* implementation not shown*/ }

    public Time(int h, int m, int s) 
    { /* implementation not shown */ }  

    //Resets time to myHrs = h, myMins = m, mySecs=s. 
    public void resetTime(int h, int m, int s) 
    { /* implementation not shown*/ } 

    //Advances time by one second. 
    public void increment ()
    { /* implementation not shown*/ } 

    //Returns true if this time equals t, false otherwise. 
    public boolean equals (Time t) 
    { /* implementation not shown */ } 

    //Returns true if this time is earlier than t, false otherwise.
    public boolean lessThan (Time t)
    { /* implementation not shown*/ }

    //Returns time as a String in the form hrs:mins:secs. 
    public String toString()
    { /* implementation not shown */ }

}
```
1. Which of the following is a false statement about the methods? 

(A) equals, lessThan, and toString are all accessor methods. 
(B) increment is a mutator method. 
(C) Time() is the default constructor.
(D) The Time class has three constructors. 
(E) There are no static methods in this class. 

2. Which of the following represents correct implementation code for the constructor with parameters? 

```java
(A) myHrs= 0; 
    myMins= 0; 
    mysecs = 0;

(B) myHrs= h; 
    myMins= m;
    my Secs = s; 

(C) resetTime(myHrs, myMins, ciySecs); 
(D) h = myHrs;
    m = myMins; 
    s = mySecs; 
(E) Time = new Time(h, m, s)
```

3. A client class has a display method that writes the time represented by its parameter: 

```java
//Outputs time t in the form hrs:mins:secs. 
public void display (Time t) 
{
    /* method body */ 
}
```

Which of the following are correct replacements for /* method body */?

```java
I   Time T = new Time (h,m, s) ; 
    System.out.println (T);
II  System.out.println(t .myHrs + ":" + t.myMins+ " : " + t.mySecs);  
III System, out .printin(t); 
```
(A) I only
(B) II only
(C) III only
(D) II and III only
(E) I, II, III

4. Which statement about parameters is false? 

(A) The scope of parameters is the method in which they are defined. 
(B ) Static methods have no implicit parameter this. 
(C) Two overloaded methods in the same class must have parameters with different names.
(D) All parameters in Java are passed by value. 
(E) Two different constructors in a given class can have the same number of parameters. 

5. Here are the private instance variables for a Frog object: 

```java
public class Frog 
{
    private String mySpecies; 
    private int myAge; 
    private double myWeight; 
    private Position myPosition; //position(x,y) in pond
    private boolean amAlive; 
}
```
Which of the following methods in the Frog class is the best candidate for being a static method? 

```java
(A) swim //frog swims to new position in pond 
(B) getPondTemperature //returns temperature of pond 
(C) eat //frog eats and gains weight
(D) getWeight //returns weight of frog
(E) die //frog dies with some probability based 
        // on frog’s age and pond temperature 