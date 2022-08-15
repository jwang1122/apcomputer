1. A bookstore wants to store information about the different types of books it sells. 

For each book, it wants to keep track of the title of the book, the author of the book, and whether the book is a work of fiction or nonfiction.

If the book is a work of fiction, then the bookstore wants to keep track of whether it is a romance novel, a mystery novel, or science fiction. 

If the book is a work of nonfiction, then the bookstore wants to keep track of whether it is a biography, a cookbook, or a self-help book. 

Which of the following is the best design? 

(A) Use one class, Book, which has three data fields: String title, String author, and int bookType. 
(B) Use four unrelated classes: Book, Title, Author, and BookType.
(C) Use a class Book which has two data fields: string title, string author, and a subclass: BookType. 
(D) Use a class Book which has two data fields: String title, String author, and six subclasses: RomanceNovel, Mystery, ScienceFiction, Biography, Cookbook, and SelfHelpBook.  
(E) Use a class Book which has two data fields: String title, String author, and two subclasses: FictionWork and NonFictionWork.The class FictionWork has three subclasses, RomanceNovel, Mystery, and ScienceFiction. The class NonFictionWork has three subclasses: Biography, Cookbook, and SelfHelpBook.

2. Consider the following code: 

```java
public int mystery (int x) 
{
    if(x==1 )
        return <missing value>; 
    else 
        return (2 * inystery(x- 1) ) + x; 
}
```
Which of the following can be used to replace cmissing value> so that mystery (4 ) returns 34?

(A) 0 
(B) 1 
(C) 2 
(D) 3 
(E) 4 

3. Consider the following code segment: 

```java
int[] X;
int[] Y;
int k; 
X = initializeX () ; // returns a valid // initialized int []
Y = initializeY () ; // returns a valid // initialized int []
for (k= 0; k < X.length && X[k]==Y[k];k++ )
{
    /* somecode */ 
}
```

Assuming that after X and Y are initialized, X. length == Y. length, which of the following must be true after executing this code segment? 

```java
(A) k < X.length 
(B) k < X.length && X[k]==Y[k] 
(C) k < X.length && X[k]!=Y[k] 
(D) k >= X.length || X[k]==Y[k] 
(E) k >= X.length || X[k]!=Y[k] 
```

4. Which of the following would not cause a run-time exception? 

(A) Dividing an integer by zero 
(B) Using an object that has been declared but not instantiated 
(C) Accessing an array element with an array index that is equal to the length of the array 
(D) Attempting to create a substring beginning at a negative index 
(E) attempting to call a method with the wrong number of arguments 

5. Assume that a and b are properly initialized variables of type Double.

Which of the following is an equivalent expression to; 

```java
a.doubleValue() != b.doubleValue()

(A) a != b
(B) a.notEquals(b)
(C) !(a.doubleValue().equals(b.doubleValue()))
(D) !(a.compareTo(b))
(E) a.compareTo(b) != 0  
```
