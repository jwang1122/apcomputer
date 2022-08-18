1. Consider the following method. 

```java
public List<Integer> nums ( ){
    List<lnteger> values = new ArrayList<Integer> ();
    for (int i = 0; i < 50; i = i + 5) 
    {
        if (i % 4 == 1 )
            values.add(i);
    }
    return value;  
} 
```
What will return of nums () contain? 
(A) [5, 45]
(B) [5, 25, 45] 
(C) [0, 20, 40]
(D) [5 , 9, 13, 17 , 21, 25, 29, 33, 37, 41, 45] 
(E) [0, 5, 10, 15, 20, 25, 30, 35, 40, 45] 

2. Consider the following incomplete method mystery

```java
public static boolean mystery (boolean a, boolean b, boolean c) 
{
    return <expression>; 
}
```

What should <expression> be replaced with so that mystery returns true when exactly two of its three parameters are true; otherwise mystery returns faLse? 

```java
(A) (a && b && !c ) ||
    (a && !b && c ) ||
    (!a && b && c )
(B) (a && b && !c ) &&
    (a && !b && c ) &&
    (!a && b && c )
(C) (a || b || !c ) &&
    (a || !b || c ) &&
    (!a && b && c )
(D) (a && b) ||
    (a && c ) ||
    (b && c )
(E) (a || b) &&
    (a || b) &&
    (b || c )
```

3. Consider the following code segment. 

```java
int x; 
x = 5- 4+ 9 * 12/3-10; 
```
What is the value of x after the code segment is executed? 

(A) 13 
(B) 27 
(C) 30 
(D) -57 
(E) -10

4. \Vhat is the best way to declare a variable myStrings that will store 50 String values if each String will be no longer than 25 characters? 

```java
(A) Arraylist<String> myStrings [String[50]]; 
(B) Arraylist<String> myStrings = new String[50]; 
(C) Arraylist<String> myStrings = new String[25]; 
(D) String[] myStrings = new String[50, 25]; 
(E) String[] myStrings = new String[50]; 
```

5. Consider the following code segment. 

```java
List <Integer> scores = new ArrayList<Integer> ();
scores.add( 93); 
scores.add( 97); 
scores.add( 84); 
scores.add( 91); 
scores.remove(2); 
scores.add(1, 83); 
scores.add(3, 99); 
System.out.println(scores); 
```

What is the output of the code segment? 
(A) [83, 93, 99, 91] 
(B) [93, 83, 91, 99] 
(C) [83, 94, 91, 99] 
(D) [93, 83, 97, 99] 
(E) The code throws an ArraylndexOutof BoundsException. 
