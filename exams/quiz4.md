# AP COMPUTER quiz4
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---

1. Consider the following code:

    ```java
        int j = 0;
        String s = "map";
        while (j < s.length()) {
            int k = s.length();
            while (k > j) {
                System.out.println(s.substring(j, k));
                k--;
            }
            j++;
        }
    ```
    ```
    (A) map
        ma
        m
        ap
        a
    (B) map
        ma
        m
        ap
        a
        p
    (C) map
        ap
        p
        ap
        p
        p
    (D) m
        ma
        map
        a
        ap
        p
    (E) p
        ap
        p
        map
        ma
        m
    ```
2. A factorial is shown by an exclamation point(!) following a number. The factorial of 5 or 5! is calculated by (5)(4)(3)(2)(1)=120.

    Assuming n is an integer greater than 1. Choose the method that will return n!

    ```java
    I. 	public static int f(int n) {
            int factorial = 1;
            for (int i = n; i > 0; i--) {
                factorial *= n;
            }
            return factorial;
        }

    II.	public static int f(int n) {
            int factorial = 1;
            int j = 1;
            while (j <= n) {
                factorial *= j;
                j++;
            }
            return factorial;
        }

    III.public static int f(int n) {
            if (n == 1)
                return n;
            return n * f(n - 1);
        }
    ```
    ```
    (A) I only
    (B) II only
    (C) II only
    (D) II and III only
    (E) I, II and III
    ```
3. Given the following code excerpt for the Tile Class:

    ```java
    public class Tile {
        private int styleNumber;
        private String color;
        private double width;
        private double height;
        private String material;
        private double price;
        
        Tile(int style, String col){
            styleNumber = style;
            color = col;
        }
        
        Tile(int style, String col, double w, double h, String mat, double price){
            styleNumber = style;
            color = col;
            width = w;
            height = h;
            material = mat;
            price =price;
        }
        
        Tile(int style, String col, String mat, double price){
            styleNumber = style;
            color = col;
            material = mat;
            price =price;		
        }
        
        public void chgMaterial(String mat) {
            String material = mat;
        }
        
        public String toString() {
            return (styleNumber + " " + color + " " + width + " " + height + " " + material + " " + price);
        }
    }
    ```
    What is the output after the following client code is executed?

    ```java
        Tile t1 = new Tile(785, "grey", "ceramic", 6.95);
        t1.chgMaterial("marble");
        System.out.println(t1.toString());
    ```
    ```
    (A) Tile@5ccd43c2
    (B) 785 grey 0.0 0.0 marble 0.0
    (C) 785 grey 0.0 0.0 ceramic 0.0
    (D) 785 grey 0.0 0.0 ceramic 6.95
    (E) 785 grey 0.0 0.0 marble 6.95
    ```
4. What is the output after the followingclient code is executed?

    ```java
        Tile t2 = new Tile(101, "blue");
        System.out.print(t2);
    ```
    ```
    (A) Tile@5ccd43c2
    (B) 101 blue 0.0 0.0 null 0.0
    (C) Type mismatch error
    (D) NullPointerException
    (E) There will be no output; the program will not compile
    ```
5. The Tile Class is going to be used for an application built for a small independent tile store. The owner wants the programmer to add a field for the number of unopened boxes of tile he has for each style of tile he has in stock and a method to change the value. What would be the proper declaration for this field?

    ```java
    (A) public static int inventory;
    (B) private static double inventory;
    (C) final int inventory;
    (D) private int inventory;
    (E) private int [] inventory;
    ```
