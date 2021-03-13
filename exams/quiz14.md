# AP COMPUTER quiz11
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 
But our goal is 5 minutes.

1. In Java, instance fields (also known as instance variables) and methods can be designated public or private. Which of the following best characterizes the designation that should be used? 

(A) Instance fields and methods should always be public. This makes it easier for client programs to access data fields and use the methods of the class. 

(B) Instance fields should be either public or private, depending on whether or not it is beneficial for client programs to access them directly. All methods should be public. A private method is useless because a client program can’t access it. 

(C) Keep all methods and instance fields private. This enforces encapsulation. 

(D) Instance fields should always be private so that clients can’t directly access them. Methods can be either public or private. 

(E) All instance fields should be public so client programs can access them, and all methods should be private. 

2. which of the following are signs of a well-designed program? 

```
I.  Clients know how data is stored in the class. 
II. Classes and methods can be tested independently
III. The implementation of a method can be changed without changing the programs that use the method. 

(A) I only 
(B) II only 
(C) II and III
(D) I and II  
(E) I, II, and III  
```

3. Consider the following classes: 

```java
public class Sample 
{
    public void writeMe(Object obj )
    {
        System.out.println("object"); 
    }
    public void writeMe(String s) 
    {
        System.out.println("string"); 
    }
}
```

What will be the result of executing the following? 

```java
Sample s = new Sample();
String tmp = new String("hi") ; 
s.writeMe(tmp) ;

(A) Compile-time error 
(B) "hi" 
(C) "object" 
(D) "string"
(E) Run-time error 
```

4. Consider the following class: 

```java
public class Sample 
{
    public void writeMe(Object obj )
    {
        System.out.println("object"); 
    }
    public void writeMe(String s) 
    {
        System.out.println("string"); 
    }
}

```
What will be the result of executing the following? 

```java
Sample s = new Sample();
Object tmp = new Object() ; 
s.writeMe(tmp) ;

(A) Compile-time error 
(B) "string" 
(C) "object" 
(D) "tmp"
(E) Run-time error 
```
5. Consider the following class: 

```java
public class Sample 
{
    public void writeMe(Object obj )
    {
        System.out.println("object"); 
    }
    public void writeMe(String s) 
    {
        System.out.println("string"); 
    }
}

```
What will be the result of executing the following? 

```java
Sample s = new Sample();
Object tmp = new String("hi") ; 
s.writeMe(tmp) ;

(A) Compile-time error 
(B) "hi" 
(C) "object" 
(D) "string"
(E) Run-time error 
```
