A monochrome (black-and-white) screen is a rectangular grid of pixels that can be either white or black. A pixel is a location on the screen represented by its row number and column number. 

Consider the following proposal for modeling a screen and its pixels. 

A black pixel on the screen is modeled by an object of type Pixel. The Pixel class includes the following private data and methods: 

* row — this int holds the row number of this pixel 
* col — this int holds the column number of this pixel 
* Pixel constructor — this constructor creates a Pixel based on the given row and column 
* getRow — this method returns the row number of this pixel 
* getCol — this method returns the column number of this pixel 

```java
public class Pixel
{
    private int row; 
    private int col;
    public Pixel (int r, int c)
    {row = r; col=c; } 
    public int getRow( )
    {return row; }
    public int getCol() 
    { return col; }   
} 
```
A screen is modeled by an object of type Screen. Internally, the screen is represented by an array of linked lists of pixels.The index into the array represents the given row on the screen; the linked list at that element represents the black pixels at the various columns in order from smallest to largest column. White pixels are not stored in the linked list, A pixel not in the list is assumed to be white. 

The Screen class includes the following private data and methods: 

* data — The array of linked lists 
* pixelAt - This method returns the pixel at the given location if it exists (i.e., is black) in this Screen. Otherwise, this method returns null. 
* pixelon—This method creates and stores a black Pixel at the appropriate place in the array of linked lists based on the given row and column number. 

```java
public class Screen
{
    private ArrayList<Pixel>[] data;
    private int numCols;

    // postcondition: data is created with height elements;  
    // numColsis set to width 
    public Screen (int width, int height) 
    {/* to be implemented in part (a)*/ }

    // precondition: 0 <= row <= data.length-1; 
    // 0<= col c= numCols-1
    // postcondition: returns the pixel at the given row and col 
    // if it exists (black) or null if the pixel doesn’t exist (white) 
    public Pixel pixelAt (int row, int col) 
    { /* to be implemented in part (b) */} 

    // precondition: 0 <= row<= data, length-1; 0 <= col numCols-1; 
    // the pixel at row,col does not exist in this Screen 
    // postcondition: adds the pixel at the given row and col so that pixels in a 
    // given row of data are in increasing column order 
    public void pixelOn (int row, int col)
    {/*to be implemented in part (c) */}  

    // ... constructors, other methods, 
    // and other private data not shown 
} 

```

(a) Write the constructor for the Screen class. The constructor should initialize the private data of the Screen class as appropriate.

Complete the constructor for the Screen class below. 

```java
// postcondition: data is created with height elements ;numCols is set to width 
public Screen (int width, int height)
```

(b) Write the Screen method pixelAt. Method pixelAt that should return the pixel at the given row and column of the screen if that pixel exists (i.e., is black). Otherwise pixelAt should return null. 

Complete method pixelAt below. 

```java
// precondition: 0 <= row <=data.iength- 1; 0 c<= col <= numCols-1
// postcondition: returns the pixel at the given row and col 
// if it exists (black)  or null if the pixel doesn’t exist (white) 

public Pixel pixelAt (int row, int col) 
```

(c) Write the Screen method pixelOn. Method pixelOn should modify this Screen so that a pixel is stored at the given row and column. 

Complete method pixelon below. 

```java
    // precondition: 0 <= row<= data.length-1; 0 <= col numCols-1; 
    // the pixel at row,col does not exist in this Screen 
    // postcondition: adds the pixel at the given row and col so that pixels in a 
    // given row of data are in increasing column order 
    public void pixelOn (int row, int col)

```