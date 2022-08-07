Questions 1-5 refer to the following Date class declaration: 

```java
public class Date
{
private int myDay;
private int myMonth;
private int myYear;  

public Date() //default constructor 
{

}

public Date(int mo, int day,int yr) //constructor 
{

}

public int month() //returns month of Date 
{

}

public int day() //returns day of Date 
{

}

public int year() //returns year of Date 
{

}

//Returns String representation of Date as "m/d/y" , e.g. 4/18/1985
public String toString()
{

}


} 

```

1. Which of the following correctly constructs a Date object? 

```java
(A) Date d = new (2, 13, 1947);
(B) Date d = new Date(2,13, 1947); 
(C) Date d;
    d = new (2, 13, 1947); 
(D) Date d;
    d = Date (2, 13, 1947); 
(E) Date d = Date(2, 13, 1947); 
```

2. Which of the following will cause an error message? 
```java
I . Date d1 = new Date (8, 2, 1947);
    Date d2 = d1
II. Date dl =null 
    Date d2 = d1
III. Date d = null; 
    int x = d.year();
```
(A) I only 
(B) II only
(C) III only
(D) II and III only
(E) I, II, and III 

3. A client program creates a Date object as follows: 

```java
Date d = new Date(1, 13,2002);
```

Which of the following subsequent code segments will cause an error?

```java
(A) String s = d.toString();
(B) int x = d.day();
(C) Date e = d; 
(D) Date e = new Date(1, 13, 2002);
(E) int y = d.myYear;   
```

4. Consider the implementation of a write() method that is added to the Date class: 

```java
//Write the date in the formm/d/y, for example 2/17/1948, 
public void write () 
{
    /* implementation code */ 
}
```
Which of the following could be used as /* implementation code */? 

```java
I.  System.out .println(myMonth + "/" + myDay + "/"+ myYear); 
II. System.out.println (month () + "/"  + day()+ "/" + year()); 
III.  System.out.println(this); 
```
```
(A) I only 
(B) II only
(C) III only
(D) II and III only
(E) I, II, and III 
```
5. A method in a client program for the Date class has this declaration: 
   
```java
Date d1 = new Date (month, day, year); 
```
where month, day, and year are previously defined integer variables. The same method now creates a second Date object d2 that is an exact copy of the object d1 refers to. Which of the following code segments will not do this correctly? 

```java
I.  Date d2 = d1;
II. Date d2 = new Date (month, day , year);
III. Date d2 = new Date(d1.month() , d1.day(), d1.year());   
```
```
(A) I only 
(B) II only
(C) III only
(D) II and III only
(E) I, II, and III 
```
