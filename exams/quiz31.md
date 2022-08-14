Questions 1-2 refer to the following classes and method descriptions. 

Class Table has a method, getPrice, which takes no parameters and returns the price of the table. 
Class Chair also has a method, getPrice, which takes no parameters and returns the price of the chair. 
Class DiningRoomSet has a constructor which is passed a Table object and an ArrayList of Chair objects. It stores these parameters in its private data fields myTable and myChairs.
Class piningRoomSet has a method, getPrice, which takes no parameters and returns the price of the dining room set. 
The price of a dining room set is calculated as the sum of the price of its table and all of its chairs. 

1. What is the correct way to define the signature of the constructor for the DiningRoomSet class? 

```java
(A) public void DiningRoomSet (Table t, Arraylist,chairs) 
(B) public DiningRoomSet (Table t, ArrayList<Chair>chairs) 
(C) public void DiningRoomSet(Tablet, Arraylist Chair chairs) 
(D) public DiningRoomSet(Table t, Arraylist Chair Chairs) 
(E) public DiningRoomSet (Table t, chair chairs) 
```

2. What is the correct way to implement the getPrice method of the DiningRoomSet class? 

```java
(A) public double getPrice (Table t, Arraylist chairs) 
{
    return t.getPrice () + chairs.getPrice () ;
}
(B) public double getPrice (Table t, Arraylist chairs) 
{
    return myTable.getPrice () + myChairs.getPrice () ;
}
(C) public double getPrice () 
{
    return myTable.getPrice () + myChairs.getPrice () ;
}
(D) public double getPrice () 
{
    double result = myTable. getPrice () 
    for (int k = 0; k < myChairs.size () - 1; k++) // should not myChairs.size()-1
    {
        result += ((Chair)myChairs.get(k) ) .getPrice() ;
    }
    return result; 
}
(E) public double getPrice (Table t, Arraylist chairs) 
{
    double result = myTable. getPrice () 
    for (int k = 0; k < myChairs.size () - 1; k++) 
    {
        result += ((Chair)myChairs[k] ) .getPrice() ;
    }
    return result; 
}
```

3. Consider the following code segment. 

```java
List<Integer> list = new Array^ist<Integer> () ; 
list.add(new Integer(7)) 
list.add(new Integer(6)) 
list.add(1,new Integer(5)) 
list.add(1,new Integer(4)) 
list.add(new Integer(3)) 
list.add(2,new Integer(2)) 
list.add(1,new Integer(1)) 
```

What is printed as a result of executing this code segment? 
(A) [1, 4, 2, 7, 6, 3] 
(B) [7, 1, 4, 2, 6, 3] 
(C) [7, 2, 5, 4, 3, 1] 
(D) [7, 6, 2, 4, 3, 1] 
(E) [7, 1, 2] 

4. . Consider the following declarations. 

```java
public class Animal 
{
    String makeSound()
    {
        // Implementation not shown 
    } 
    String animalType() 
    {
        // Implementation not shown 
    }

}

public static class Dog extends Animal 
{
    public String makeSound(Animal a)
    {
        // Implementation not shown 
    } 
}
```

Which of the following methods must be included in the declaration of the Dog class in order for the class to successfully compile? 

```java
I. public string makeSound() 
II. public String animalType() 
III. publicstring animalType (Animal b) 
```
(A) I only 
(B) II only 
(C) I and II only 
(D) II and III only 
(E) None 

5. Consider the following two classes. 

```java
public class Fish
{
    public String endoskeleton = "bone"; 
    public void action ( ) 
    {
        System.out.println ("splash splash") ; 
    }

} 

public class shark extends Fish 
{
    public void action() 
    {
        System.out.println("chomp chomp") ; 
    }
    public String endoskeleton = "cartilage"; 
}
```

Which of the following is the correct output after the following code segment is executed? 

```java
Fish Bob = new shark () ;
System.out.println(Bob.endoskeleton);  
Bob.action() ; 
```

(A) bone 
    chomp chomp 
(B) bone 
    splash splash
(C) cartilage 
    splash splash 
(D) cartilage 
    chomp chomp 
(E) cartilage 
    splash splash
    chomp chomp 
