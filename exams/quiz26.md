1. How many classes can a given class extend? 

(A) None 
(B) 1
(C) 2
(D) As many as it needs
(E) 0

2. Consider the following class: 

```java
public classs Sample
{
    int var = 0;
    public static void writeMe (String string) 
    {
        system.out.println("string") ; 
    }
}
```
What is the result of executing the following? 

```java
Sample.writeMe("hello") ; 
```

(A) This is not a legal call because there is no instance variable. 
(B) "hello"
(C) "null"
(D) "string"
(E) Run-time error 

3. Consider the following class: 

```java
public class Sample 
{
    int static final var = 0;
}
```

What is the result of executing the following? 

```java
Systerm.out.println(Sample.var) ; 
```

(A) This is not a legal call because there is no instance variable. 
(B) -1 
(C) 0 
(D) The value is unknowable. 
(E) This is not a legal call because var is final. 

consider the following class: 

```java
public class Sample 
{
    String name;
    public sample(string in) 
    {
        name = in; 
    }

    public void writeMe(strings)
    {
        String val = null ;
        if (val.equals (s) )
        {
            System.out.println("me") ; 
        }else
        {
            System.out.println("you") ; 
        }
    } 
}
```

4. What will be the result of executing the following? 

```java
Sample s = new Sample ( ) ; 
String trap = new string ("hi"); 
s.writeMe(tmp) ;
```

(A) Compile-time error 
(B) Run-time error 
(C) "hi" 
(D) "string" 
(E) "Sample" 

5. What will be the result of executing the following? 

```java
Samples = new Sample ("sample"); 
String trap = new String ("hi"); 
s. writeMe(tmp) ; 
```

(A) "hi"
(B) Run-time error 
(C) "me"
(D) "sample"
(E) "you" 