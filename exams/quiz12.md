# AP COMPUTER quiz11
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---
1. A math teacher is writing a program that will correctly calculate the area of acircle. Recall that the area of a circle is pi times the radius squared ($\pi r^2$). Assuming Math-PI returnsan accurate decimal approximation of pi, which of the following statements **WILL NOT** calculate an accurate area of a circle with radius 22 ? 

    ```java
    (A) r*r*Math.PI; //r is the int 22 
    (B) r*r*Math.PI; // r is the double 22.0 
    (C) (double) r*r*Math.PI; //r is the int 22 
    (D) (double) (r*r) *Math.PI; // r is the int 22 
    (E) All of the above choices will calculate an accurate area. 
    ```
2. Consider the following code segment: 
   
   ```java
   String s = "This is the beginning";
   String t = s.substring(5);
   int n = t.indexOf ("the");  
   ```
   Which of the following will be the value of n ? 
   ```
    (A) -1 
    (B) 3 
    (C) 7
    (D) 9 
    (E) 8
   ```

Use class Chair and method sitOnChair to answer Questions 3 and 4.

```java
    public class Chair 
    {
        private int numberOfLegs = 4;
        private boolean padded; 

        public Chair (boolean soft) 
        {
            if (soft) padded = true; 
            else padded = false; 
        }
    }

    public void  sitOnChair( ) 
    {
        /* program statements */ 
    }

```

3. method sitOnChair belongs to another class and is supposed to allow the user to “sit” on a Chair if the chair is padded. Which of the following code segments could be used to replace <program statements> so that sitOnChair will work as intended?

```java
I.  Chair c =new Chair (true);
    c.sit(); 
II. Chair c = new Chair(true); 
III.Chair c = new Chair(true); 
    if (c.padded) System.out.print ("You are sitting."); 

(A) I only
(B) II only
(C) III only
(D) I, II and III
(E) None
```

4. Which of the following modifications, if any, would help to make the Chair class MOST useful to the sitOnChair method, based on the task attempted in Question 3? 

```
(A) Adding an accessor method that returns the value of numberOfLegs 
(B) Adding an accessor method that returns the value of padded 
(C) Adding a mutator method that changes the value of numberOfLegs
(D) Adding a mutator method that changes the value of padded 
(E) Adding an accessor method that returns the values of both numberOfLegs and padded 
```

5. Consider the following method: 
```java
public int halfRoot(int n)
{
    return Math.sqrt(n) /2; 
} 
```
Which of the following method calls would cause a run-time error? 
```
(A) halfRoot(-2)
(B) halfRoot (3) 
(C) halfRoot ( (int) 2.0)
(D) halfRoot (3.0) 
(E) None will cause a run-time error. 
```