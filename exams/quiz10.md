# AP COMPUTER quiz10
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---

1. Choose the best solution to complete the missing code such that the code will implement a binary search to find the variable number in arr.

    ```java
        int number = /*some number in arr*/;
        System.out.println (search (arr, 0, arr.length-1, number)) ;

        public int search(int [] a,int first, int last, int sought){
            int mid = (first +  last)/2 ;
            if (/*missing code*/) {
                last = mid - 1;
                return search(a, first,last, sought) ;
            }
            else if(/*missingcode*/){
                first = mid + 1;
                return search (a, first, last, sought); 
            }
            return mid;
        }
    ```
    ```
    (A) a[mid] > sought  		a[mid] < sought
    (B) a[mid] + 1 > sought  	a[mid] < sought 
    (C) a[mid] > sought			a[mid] -1 < sought
    (D) a[mid] + 1 > sought 	a[mid] -1 < sought
    (E) a[mid] = sought  		a[mid] = sought
    ```  
2. A method is to be written to search an array for a value that is larger than a given item and return its index. The problem specification does not indicate what should be returned if there are several such values in the array. Which of the following actions would be best?

    (A) The method shold be written on the assumption that there is only one value in the array that is larger than the given item.

    (B) The method should be written so as to return the index of every occurrence of a larger value.

    (C) The specification should be modified to indicate what should be done if there is more than one index of larger value.

    (D) The method should be written to output a message if more than one larger value is found.

    (E) The method should be written to delete all subsequent larger items after a suitable index is returned.

3. When will method whatIsIt cause a stack overflow(i.e., cause computer memory to be exhausted)?

    ```java
    public static int whatIsIt(int x, int y){
        if(x>y)
            return x* y;
        else
            return whatIsIt(x-1, y);
    }
    ```

    ```
    (A) Only when x < y
    (B) Only when x ≤ y
    (C) Only when x > y
    (D) For all values of x and y
    (E) The method will never cause a stack overflow.
    ```

4. The boolean expression a[i] == max || !(max != a[i]) can be simplified to

    ```
    (A) a[i] == max
    (B) a[i] != max
    (C) a[i] < max || a[i] > max
    (D) true
    (E) false
    ```

5. Suppose the charqacters 0,1,...,8,9,A,B,C,D,E,F are used to represent a hexadecimal (base-16) number. Here A=10, B=11, ..., F=15. What is the largest base-10 integer that can be represened with a two-digit hexadecimal number,such as 14 or 3A?

    ```
    (A) 32
    (B) 225
    (C) 255
    (D) 256
    (E) 272
    ```
