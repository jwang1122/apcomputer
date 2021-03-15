# Quiz 17

1. The boolean expression a[i] == max || !(max != a[i]) can be simplified to 

```
(A) a[i] == max 
(B) a[i]!=max 
(C) a[i]< max || a[i] > max
(D) true
(E) false 
```

2. Consider a ciown class that has a default constructor. Suppose a list Arraylist<Clown> list is initialized. Which of the following will **not** cause an IndexOutOfBoundsException to be thrown? 

```java
(A) for (int i = 0; i <= list.size(); i++)
        list.set(i, new Clown());
(B) list.add(list.size() , new Clown()); 
(C) Clown c = list.get (list.size());
(D) Clown c = list.remove(list.size());
(E) list.add(-1, new Clown());   
```

Questions 3-5 refer to the Point, Quadrilateral, and Rectangle classes below: 

```java
public class Point 
{
    private int xCoord; 
    private int yCoord; 

    //constructor 
    public Point (intx, int y)
    {
        ...
    }

    //accessors
    public int get_x() 
    {
        ...
    }

    public int get_y()
    {
        ...
    } 

    //other methods not shown ...
}

public abstract class Quadrilateral 
{
    private String myLabels; //e.g.> "ABCD" 

    // constructor
    public Quadrilateral (String labels) 
    { myLabels = labels; } 

    public String getLabels () 
    { return myLabels; }

    public abstract int perimeter () 
    public abstract int area()
}

public class Rectangle extends Quadrilateral 
{
    private Point myTopLeft; //coords of top left corner 
    private Point myBotRight; //coords of bottom right corner 

    // constructor
    public Rectangle (String labels, Point topLeft, Point botRight) 
    { /* implementation code */  }

    public int perimeter() 
    { /* implementation not shown */ } 

    public int area() 
    { /* implementation not shown */ } 

    //other methods not shown ...
}
```

3. Which statement about the Quadrilateral class is false?

```
(A) The perimeter and area methods are abstract because there’s no suitable default code for them. 
(B) The getLabels method is not abstract because any subclasses of Quadrilateral will have the same code for this method. 
(C) If the Quadrilateral class is used in a program, it must be used as a superclass for at least one other class. 
(D) No instances of a Quadrilateral object can be created in a program. 
(E) Any subclasses of the Quadrilateral class must provide implementation code for the perimeter and area methods. 
```

4. Which represents correct /* implementation code */ for the Rectangle constructors?

```
I super (labels); 
II super (labels, topLeft, botRight); 
III super (labels); 
    myTopLeft= topLeft; 
    wyBotRight= botRight; 

(A) I only 
(B) II only
(C) III only
(D) I and II only 
(E) II and III only
```

5. Refer to the Parallelogram and Square classes below. 

```java
public class parallelogram extends Quadrilateral 
{
    //private instance variables and constructor not shown 
    ...

    public int perimeter() 
    { /* implementation not shown*/ }

    public int area() 
    { /* implementation not shown */ } 
}

public class Square extends Rectangle 
{
    //private instance variables and constructor not show
    ...

    public int perimeter() 
    { /* implementation not shown*/ }

    public int area() 
    { /* implementation not shown */ } 
}
```

Consider an ArrayList<Quadrilateral> quadList whose elements are of types Rectangle, Parallelogram, or Square. 

Refer to the following method, writ eAreas: 

```java
/* precondition: quadList contains Rectangle, Parallelogram, or
 *Square objects in an unspecified order. 
 */
public static void writeAreas(List<Quadrilateral> quadList)  
{
    for (Quadrilateral quad : quadList) 
        Astern, out. print In ("Area of " + quad.getLabels() + " is "+ quad.area()); 
}
```

What is the effect of executing this method? 

```
(A) The area of each Quadrilateral in quadList will be printed. 
(B) A compile-time error will occur, stating that there is no area method in abstract class Quadrilateral. 
(C) A compile-time error will occur, stating that there is no getLabels method in classesRectangle,Parallelogram,or Square. 
(D) A NullPointerException will be thrown. 
(E) A ClassCastException will be thrown.
```