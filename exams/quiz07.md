# AP COMPUTER quiz7
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---

1. Choose the missing code below that will accurately find the average of the values in the sales array.

    ```java
        double avg = 0;
        int i = 0;
        int sum = 0;
        for (int element: sales) 
        // Missing code
    ```

    ```java
    (A) {
            sum += element;
        }
        avg = (double) sum / sales.length;
    (B) {
            sum += sales[i];
        }
        avg = (double) sum / sales.length
    (C) {
            sum += sales;
        }
        avg = (double) sum / sales.length
    (D) {
            sum += sales[element];
        }
        avg = (double) sum / sales.length
    (E) {
            sum += element[sales];
        }
        avg = (double) sum / sales.length
    ```
2. A programmer has written two different methods for a client program to swap the elements of one array with those of another array.

    ```java
        public static void swap1(int[] a1, int[] a2) {
            for (int i=0; i< a1.length; i++) {
                int arrhold = a1[i];
                a1[i] = a2[i];
                a2[i] = arrhold;
            }
        }
        
        public static void swap2(int[] a1, int[] a2) {
            int[] arrhold = a1;
            a1 = a2;
            a2 = arrhold;
        }
    ```
    Which of the following statements best reflects the outcome of the two methods?

    (A) Both methods will swap the contents of the two arrays correctly in all cases.

    (B) swap1 will swap the contens of the two arrays correctly only if both arrays have the same munber of elements whereas swap2 will work correctly for all cases.

    (C) swap1 will only swap the contents of the two arrays correctly if both arrays have the same number of elements, whereas swap2 will never work correctly.

    (D) swap1 will only swap the contents of the two arrays correctly if both arrays have the same number of elements or a2 has more elements, whereas swap2 will work correctly for all cases.
    
    (E) Neither method will swap the contents of the two arrays correctly under any condition.

3. Which code has declared and properly populated the given ArrayList?

    ```java
    I. 	ArrayList<String> alist1 = new ArrayList<String>();
        alist1.add("4.5");
    II. ArrayList<Integer> alist2 = new ArrayList<Integer>();
        alist2.add((int)4.5); 
    III.ArrayList<Double> alist3;
        alist3 = new ArrayList<Double>();
        alist3.add(4.5); 
    ```
    ```
    (A) I only
    (B) I and II
    (C) I and III
    (D) II and III
    (E) I, II and III
    ```
4. Given the following code excerpt:

    ```java
        ArrayList<Integer> alist1 = new ArrayList<Integer>();
        int[] a1 = { 2, 4, 6, 7, 8, 10, 11 };
        for (int a : a1) {
            alist1.add(a);
        }
        for (int i = 0; i < alist1.size(); i++) {
            if (alist1.get(i) % 2 == 0) {
                alist1.remove(i); // dangerous
            }
        }
        System.out.println(alist1);
    ```
    ```java
    (A) [4, 7, 10, 11]
    (B) [2, 4, 7, 10, 11]
    (C) [2, 7, 10, 11]
    (D) [7, 11]
    (E) An IndenxOutOfBoundsException will occur
    ```
5. Given nums—a rectanglular, but not necessarily square, two-dimensional array of integers, choose the code to correctly print the array:

    ```java
        int[][] arr2d = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        String s = "";
        for (int a = 0; a < arr2d[0].length; a++) {
            for (int b = 0; b < arr2d.length; b++) {
                s += arr2d[b][a] + " ";
            }
            s += "\n";
        }
        System.out.print(s);
    ```
    Determine the resulting output. 
    ```
    (A) 1 2 3 4 
        5 6 7 8  
    (B) 1 5 2 6
        3 7 4 8
    (C) 1 2
        3 4
        5 6
        7 8
    (D) 1 5
        2 6
        3 7
        4 8
    (E) 1
        2
        3
        4
        5
        6
        7
        8
    ```
