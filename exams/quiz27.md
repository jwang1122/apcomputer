1. An apartment rental company has asked you to write a program to store information about the apartments that it hes available for rent. For each apartment, they want to keep track of the following information: number of rooms, whether or not the apartment has a dishwasher, and whether or not pets are allowed. Which of the following is the best design? 
   
(A) Use four unrelated classes: Apartment, Rooms, Dishwasher, and Pets. 
(B) Use one class, Apartment, which has three subclasses: Room, pishwasher, and pet.
(C) Use one class, Apartment, which has three data fields: int rooms, boolean hasDishwasher, boolean allowsPets.
(D) Use three classes—pets, Rooms, and Dishwasher—each with a subclass Apartment. 
(E) Use four classes: Apartment, Pets, Dishwasher, and Rooms. The class Apartment contains instances of the other classes as attributes.  

2. Consider the following class declarations: 

```java
public class Vehicle
{
    private int maxPassengers;
    public vehicle ()
    {
        maxPassengers= 1; 
    }
    public Vehicle(int x) 
    {
        maxPassengers= x;
    }  
    public int maxPassengers( )
    {
        return maxPassengers 
    }
}
public class Motorcycle extends Vehicle 
{
    public Motorcycle( ) 
    {
        super(2); 
    }
}
```
Which of the following code segments will NOT cause a compilation error? 

```java
(A) Motorcycle m1 = new Motorcycle (3); 
(B) Vehicle vl = new Motorcycle ( 4 );
(C) Motorcycle m2 = new Vehicle ( ) ; 
(D) Vehicle v2 = new Motorcycle ( );
(E) Vehicle v3 = new Vehicle ( ) 
    int max = v3.maxPassengers;  
```

3. Consider the following method: 

```java
// precondition: x >= 0 
public int mystery (intx) 
{
    if (x == 0)
    {
        return 0 ; 
    }else{
        return ( (x % 10) + mystery (x / 10) ); 
    }
}
```

Which of the following is returned as a result of the call mystery(3543)? 
(A) 10 
(B) 15 
(C) 22 
(D) 180 
(E) Nothing is returned due to infinite recursion. 

4. Consider the following method:

```java
public int mystery (int x) 
{
    if (x == 1) {
        return 2;
    }
    else
    {
        return 2 *mystery(x - 1);
    }
}
```

What value is returned as a result of the call mystery (6) ? 

(A) 2 
(B) 12
(C) 32
(D) 64 
(E) 128 

5. Consider the following recursive method: 

```java
public static int mystery (int x) 
{
    if (x == 0)
    {
        return 0;
    } 
    else 
    {
        return (x + mystery(x / 2) + mystery(x / 4) ) ;
    }
}
```

What value is returned as a result of a call to mystery (10)?
(A) 10
(B) 12 
(C) 20 
(D) 22 
(E) 35 

