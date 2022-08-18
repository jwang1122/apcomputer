Questions 1—2 refer to the method getGap with line numbers added for reference. Method getGap is intended to find the maximum difference between the indexes of any two occurrences of num in the array arr. The method getGap does network intended. 

For example, if the array arr contains [8, 7, 5, 5, 4, 3, 2,7,1, 2, 7], the call getGap (arr, 7) should return 9, the difference between the indexes of the first and last occurrence of 7.

```java
/**precondition: arr contains at least two occurrences of num */ 

1:  public int getGap (int [] arr, int num) 
2:  {
3:      int index1 = -1;
4:      int index2 = -1;
5:      for (int k = 0; k< arr.length; k++) 
6:      {
7:            if (arr[k] == num )
8:            {
9:                if(index1 == -1)
10:                {
11:                   index1= k;
12:                   index2 = k;  
13:                }
14:                else 
15:                {
16:                    index1 = index2; 
17:                    index2 =  k;
18:                }
19:            }
20:     }      
21:     return (index2- indexl);
22: }
```

1. The method getGap does not work as intended. Which of the following best describes the return of the method getGap ? 

(A) The difference between the indexes of the last two occurrences of num in arr 
(B) The minimum difference between the indexes of any two occurrences of num in arr 
(C) The difference between the first two occurrences of num in arr 
(D) The length of the array arr 
(E) The number of occurrences of num in arr 

2. Which of the following changes should be made to getGap so that the method will work as intended? 

(A) Delete the statement at line 4. 
(B) Delete the statement at line 11.
(C) Delete the statement at line 12. 
(D) Delete the statement at line 16.
(E) Delete the statement at line 17.

Questions 3-5 refer to the following incomplete class declaration used to represent calendar dates. 

```java
public class Date 
{
    private int month; // represents month 0-11 
    private int day; // represents day of the month 0-31 
    private int Year; // represents the year 

    // constructor sets the private data  
    public Date (int m, int d, int y)
    { /* implementation not shown*/ } 

    // postconditions: returns the month 
    public int getMonth( ) 
    { /* implementationnot shown */ }

    // postcondition: return the day 
    public int getDay()
    { /* implementation not shown */ } 

    // postcondition: returns the year 
    public int getYear() 
    {/*implementation not shown*/ }

    // postcondition: returns the number of days which, when added to this Date, gives newDate 
    public int daysUntil (Date newDate) 
    {/*implementation not shown */ }    

    // postcondition: returns true if the month, day» and Vear of this Date are 
    // are equal to those of other; otherwise returns false 
    public boolean equals (Date other) 
    { /* implementation not shown*/ }

    // ... other methods not shown 
}
```

3. Consider the method equals of the Object class.

Which of the following method signatures is appropriate for the equals method? 

```java
(A) public boolean equals (object other) 
(B) public int equals (Object other) 
(C) public boolean equals (Date other) 
(D) public int equals (Date other) 
(E) public boolean equals (Date dl, Date d2) 
```

4. Which of the following code segments could be used to implement the equals method of the Date class so that the* equals method works as intended? 

```java
I. if (month == other.month)
        if (day== other.day) 
            if (year==other.year) 
                return true;
    return false;
    
II. if (month == other.month &&
        day== other.day && 
            year==other.year) 
                return true;
    else
        return false;
III. return !((getMonth() != other.getMonth()) ||
        (getDay() != other.getDay() ) ||
        (getYear() != other.getYear() )); 
```

(A) I only 
(B) II only 
(C) I and II only 
(D) II and III only 
(E) I, II and III 

5. During the testing of the Date class, it is determined that the class does not correctly handle leap years—although it handles non-Ieap Years correctly.

In which method of the Date class is the problem most likely to be found? 

(A) The Date constructor 
(B) The getMonth method 
(C) The getDay method 
(D) The daysUntil method 
(E) The equals method 
