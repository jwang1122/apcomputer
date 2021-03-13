# SectionII 0-4 (AP Edition 6)

4. This question involves the implementation of a class SeatingChart. A seating chart object will represent a two-dimensional String array. The number of rows and columns for the array will be sent as parameters, as well as a one-dimensional arry of type Name. You may assume there will be enough rows and columns to accommodate all the entries from the array.

The declaration of the Name class is shown.
```java
public class Name {
	private String lastName; 
	private String firstName; 
	
	Name (String lName, String fName) {< implementation not shown>}
	public String getLastName(){return lastName; }
	public String getFirstName(){ return firstName; } 
}
```
A partial declaration of the Seatingchart class is shown below. 

```java
public class SeatingChart {
	private String[][] chart; 
	/** Constructs a SeatinqChart having r rows and c columns. All elements contained in the
	 *  names array should be placed randomly in the chart array using the format: lastName
	 *  first Name (e-g. Johlie, Angelina). Any locations not used in the chart should be  
	 *  initialized to the empty string. 
	 */
	SeatingChart (Name[] names, int rows, int cols) {
		/* to be implemented in part (a) */ 
	}
	
	/** Returns a string containing all elements of the chart array in row-major order.
	 * The method should return 
	 * a string containing all the elements in the chart array. The method 
	 * padWithSpaces should be called on each
	 * element of chart before it is added to the string to ensure each name will be 
	 * printed with the same
	 * length. Each row of the chart should be separated by a line break.    
	 */
	public String toString() {
		/* to be implemented in part (b)	*/ 
	}
	
	/** pads a string with spaces to ensure each string is exactly 35 characters long. */ 
	
	private String padWithSpaces (String s) {
		String str = s;
		for (int a = s.length(); a<35; a++ ) {
			str += " ";
		}
		return str; 
	}
}
```
The following table contains sample code and the expected results.

Statements and Expressions |Value Returned / Comment 
|---|---|
SeatingChart msJones = new SeatingChart(theNames, 4, 3);|| (no value returned) A two dimensional array is initialized with 4 rows and 3 columns. Every element in theNames is placed randomly in chart in the following format: lastname, firstname e.g., Washington, George. Empty string is placed in any unused locations.
System.out.println(msJones.toString);|Prints the names in chart in row-major order. See example below:

```
Miller, Minnie 			Fitzgerald,Fred 			Dade,Ali 
Indigo, Inde			Banner, BorisBoris 			Lane, Lois
Titon, Tim				Robilard,Robbie
Brne, Jane  
```
(a) Write the SeatingChart constructor.

**Class information for this question **

```java
public class Name 
	private String lastName; 
	private string firstName;

	Name (String lName, String fName) 
	public String getLastName(){ return lastName; } 
	public String getFirstName () {return firstName; } 

public class SeatingChart
	private String[][] chart;

	SeatingChart(Name[] names, int rows, int cols ])
	public String toString()
	private String padWithSpaces(String s) 
```

(b) Write the SeatingChart toString() method. 

