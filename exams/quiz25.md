1. Consider the following two classes:

```java
public class A 
{
    public int method1 (int x) 
    {
        return 2; 
    }
}

public class B extends A 
{/*code not shown*/ }
```

Which of the following could be the signature of a method in class B that correctly overloads method1 in class A?

```java
(A) public int method1 (Atring x) 
(B) public int method1 (int Y) 
(C) private int method1 (int x) 
(D) public int method2 (String x) 
(E) public int method2 (int y) 
```

2. Consider the following two classes: 

```java
public class parent 
{
    public void writeMe (String s) 
    {
        System.out.println ("Object"); 
    }
}
public class child extends Parent 
{
    public void writeMe( String s)
    {
        System.out.println ("Object"); 
    } 

}
```

Which of the following best describes the writeMe method of the Child class? 
(A) An inherited method 
(B) An overridden method 
(C) An overloaded method 
(D) An interface method 
(E) An abstract method 

Consider the following declaration for a'class that will be used to represent a rectangle:

```java
public class Rectangle 
{
    private double width;
    private double height; 
    public Rectangle() 
    {
        width = 0;
        height= 0; 
    }
    public Rectangle (double w, double h) 
    {
        width = w; 
        height= h; 
    }

    // postcondition: returns the height 
    public double getHeight()
    {
        return height; 
    } 

    //postcondition:returns the width 
    public double getWidth() 
    {
        return width; 
    }
}
```

The following incomplete class declaration is intended to extend the above class so the rectangles can be filled with a color when displayed: 

```java
public class FilledRectangle extends Rectangle 
{
    private String color; 
    // constructors go here 

    public String getcolor () 
    {
        return color; 
    }
}
```

Consider the following proposed constructors for this class: 

```java
I. public FilledRectangle ()
    {
        color = "red";         
    } 

II. public pilledRectangle (double w, double h, String c )
    {
        super(w, h) ;
        color = c; 
    }

III. public FilledRectangle (double w, double h, String c)
    {
        width = w; 
        height = h; 
        color = c;
    } 
```

3. Which of these constructors would be legal for the FilledRectangle class? 

(A) I only 
(B) II only 
(C) III only 
(D) I and II
(E) I and III 

4. Based on the class declarations for Rectangle and FilledRectangle given above, which of the following code segments would be legal in a client class? Assume that the constructor that takes no arguments has been implemented for FilledRectangle. 

```java
I. FilledRectangle r1 = new Rectangle ();
    double height= r1.get.Height() ;

II. Rectangle r2 = new FilledRectangle();
    double height = r2.getHeight(); 

III. Rectangle r3 = new FilledRectangle();
    r3.getColor(); 
```

Which of the code segments above are legal? 
(A) None
(B) II only 
(C) III only
(D) I and II 
(E) II and III 

5. Consider the following class: 

```java
public class Cat
{
    private String name ;
    private int age;

    public cat (string name, int age){ 
        this.name = name; 
        this.age = age;
    }
    public String tostring ( ) 
    {
        return (name + ": "+ age);
    }  
} 
```

Suppose another class were to include the following code segment: 

```java
Cat c = new Cat ("Billi", 5);
System.out.println(c); 
```

Which of the following will be the output of the code segment*? 
(A) c
(B) 5  
(C) Billi 
(D) Billi: 5 
(E) here wouId be no output. 