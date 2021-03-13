# AP Computer Sicence Section II

Time&#x2501;1 hour and 30 minutes 

Number of Questions&#x2501;4

percent of Total Grade&#x2501;50% 

Directions: SHOW ALL YOUR WORK. REMEMBER THAT PROGRAM SEGMENTS ARE TO BE WRITTEN IN JAVA™ 
## Table of Contents
- [AP Computer Sicence Section II](#ap-computer-sicence-section-ii)
	- [Table of Contents](#table-of-contents)
	- [FREE-RESPONSE QUESTIONS](#free-response-questions)
		- [Question 1](#question-1)
		- [Question 2](#question-2)
		- [Question 3](#question-3)
		- [Question 4](#question-4)

## FREE-RESPONSE QUESTIONS
### Question 1
1. This question involves the implementation of a simulation rolling two dice. A client program will specify the number of rolls of the sample size and the number of faces on each of the two dice. A method will return the percentage of times the roll results in a double. Double in this case means when two dice match or have the same value (not a data type). 

You will write two of the methods in this class. 

```java
public class DiceSimulation { 
	/** Sample size of simulation */ 
	private int numSampleSize; 

	/** Number of faces on the die */
	private int numFaces;

	/** Constructs a Dicesimulation where sampleSize is the number of rolls to be simulated and faces is the number of faces on the die (some die have many more or less than 6 faces)  
	*/
	public DiceSimulation(int numSamples, int faces) { 
		numSamp1eSize = numSamples; 
		numFaces= faces; 
	}

	/** Returns an integer from 1 to the number of faces to simulate a die roll */ 
	public int roll() { 
		/* implemented in part (a) */
	}

	/** simulates rolling two die with the number faces given, for the number of sample size rolls. Returns the percentage of matches that were rolled 
	as an integer (eg. 0-$0 would be 50) 
	*/
	public int runSimlation(){
		/* implemented in part(b)  */
	}
}
```
The following table contains sample code and the expected results. 

lents and Expressions | Value Returned / Comment
|---|---|
DiceSimulation sl = new  DiceSimulation ( 10, 6)  |(no value returned) A DiceSimulation dl is declared and instantiatd.
s1. runSimulation() |10 rolls are simulated, only the percentage of matches is displayed. See further explanation below.

```
The 10 rolls might look like this (nothing is printed at this time) 
Die1: 3		Die2: 6
Die1: 5		Die2: 6
Die1: 3		Die2: 2
```
<mark>Die1: 1		Die2: 1</mark>
```
Die1: 2		Die2: 5
```
<mark>Die1: 1		Die2: 1</mark>
```
Die1: 3		Die2: 2
Die1: 2		Die2: 6
```
<mark>Die1: 2		Die2: 2</mark>
```
Die1: 6		Die2: 5
The percentage of tow dice rolling 10 times with same face value is 30.
```
(a) Write the roll method to simulate the roll of one die. 
```java
Class information for this question 

public class Dicesimulation

private int numSample size; 
private int numFaces; 

public DiceSimulation(int numSamples,int faces) 
public int roll ()
public int runSimulation() 
```
**WRITE YOUR SOLUTION BELOW**

```java
/** Returnsan integer from 1 to number o£ faces to simulate s die roll */
public int roll ()  
```

(b) Write the runSimulation method. 

Class information for this question 

```java
public class DiceSimulation 
private int numSamplesize;
private int numFaces;  

public DiceSimulation (int numSamples, int faces) 
public int roll ()
public int runSimulation()
```
Hit: implement the DiceSimulation class, replace ... with your code.
```java
public class DiceSimulation {
	private int numSampleSize;
	private int numFaces;

	
	public DiceSimulation(int numSamples, int faces) {
		numSampleSize = numSamples;
		numFaces = faces;
	}

	public int roll() {
		...
	}
	
	public int runSimulation() {
        ...
	}


	public static void main(String[] args) {
        int sampleSize = 10;
        int numFaces = 6
		DiceSimulation test = new DiceSimulation(sampleSize, numFaces);
		int percentage = test.runSimulation();
		System.out.println("The percentage of tow dice rolling %d times with same face value is %d.",sampleSize, percentage);
	}

}

```

[Table of Contents](#table-of-contents)

### Question 2
2. This question involves the implementation of a calorie counter system that is represented by the CalorietCount class. A CalorieOunt object is created with 5 parameters:
* Daily Calories limit—the recommended number of calories per day
* paily Calories intake—the number of calories a person has eaten in a day 
* Grams of protein per day
* Grams of Carbohydrate per day 
* Grams of fat per day 

The CalorieCount class provides a constructor and the following methods: 
* addMeal—takes in calories, grams of protein, grams of carbs, and grams of fat from a meal and updates corresponding instance fields 
* getProteinPercentage—returns the percent of protein in a given day (4 * grams protein / daily calorie intake) 
* onTrack—returns true if the calorie intake does not exceed the daily calories limit, otherwise returns false 

The following table contains a sample code and the expected results. 

Statementsand Expressions |Value Returned (blank if no value) |Comment 
|---|---|---|
CalorieCount sunday= new CalorieCount(1500); | |Creates an instance with a 1500 calorie limit
sunday.addMeal(716,38,38,45) ||Adds 716 calories, 38 grams protein. 8 grams of carbs, 45 grams of fat to the appropriate in stance fields 
sunday.addMeal(230,16,8,16) ||Adds 230 calories, 16 grams protein. 8 grams of carbs, 16 grams of fat to the appropriate in stance fields
sunday.addMeal(568,38,50,24) ||Adds 568 calories, 38 grams protein. 50 grams of carbs, 24 grams of fat to the appropriate in stance fields
onTrack() |False |Returns true if calorie intake does not exceed calorie limit 
getProteinPercentage() |.24 | Multiplies grams of protein by 4 then divides by calorie intak 

---

[Table of Contents](#table-of-contents)

### Question 3
Write the entire CalorieCount class. Your implementation must meet all specifications and conform to all examples. 

3. This question involves the implementation of a Travel Planner system that is represented by the Travelplan and Tour classes. A client will create Tour objects that will represent tours or activities of interest. Each tour object is made up of an activity date, start time, end time, and name of the activity- The client will also create a Travelplan object comprised of a destination and an arraylist of Tours. You will write three methods of the TravelPlan class. 

A partial declaration of the Tour class is shown below. 
```java
public class Tour {
	private int actDate;// date is in mwddyyyy format 
	private int startTime; // times are represented in military format 
	private int endTime; // 1430 for 2:30 pm
	private String activity; 
	
	/** constructs a Tour 
	 * All instance fields are initialized 
	 */
	Tour (int actDate, int startTime, int endTime, String activity) 
	{
		// implementation not shown 
	}
	public int getActDate()	{ return actDate; } 
	public int getStartTime () { return startTime;} 
	public int getEndTime (){ return endTime; } 
	public String getActivity(){ return activity;} 
}
```
A partial declaration of the TravelPlan class is shown below. 
```java
import java.util.ArrayList;

public class TravelPlan {
	private String destination; 
	private ArrayList <Tour> plans; 
	
	/** Constructs a Tour 
	 * Instance fields : destination and plans are initialized 
	 */
	TravelPlan (String destination) 
	{
		/* to be implemented in part (a)	*/ 
	}
	/** Returns true if the timeframe in t overlaps with another Tour in plans;
	 * otherwise false
	 */
	public boolean checkForConflicts (Tour t) 
	{
		/* to be implemented in part(b) */ 
	}
	
	/** Must call checkForConflicts for full credit, if checkForConflicts returns false
	 * (the timeframe does not overlap), adds t to plans. Returns true if
	 * t was added, otherwise returns false 
	 */
	public boolean addTour(Tour t) 
	{
		/* to be implemented in part(c) */ 
	}
}
```
The following table contains sample code and the expected results. 

Statements and Expressions |Value Returned (blank if no value)|Comment 
|---|---|---|
TravelPlan p1 = new TravelPlan("Capetown"); ||Creates an instance with a destination | "CapeTown” and an empty arraylist of type Tour
Tours t1 = new Tours (12132020,800,1230,"Bungee jumping");||Create a Tour instance with date, start time, end time, and activity
Tours t2 = new Tours (12132020,900,1430,"Body surfing");||Create a Tour instance with date, start time, end time, and activity
p1.addTour(t1) |true|Checks for conflicts in plans, since there are none, adds the Tour object, returns true 
p1.addTour(t2) |false|Checks for conflicts in plans, since there is conflicts, returns true 
Tours t3 = new Tours(12132020,1400,1700,"Shark cage diving");||Create a Tour instance with date, start time, end time, and activity
p1.addTour(t3) |true|Checks for conflicts in plans, since there are none, adds the Tour object, returns true 
Tours t4 = new Tours (1222020,800,1700,"Deep sea fishing");||Create a Tour instance with date, start time, end time, and activity
p1.addTour(t4) |true|Checks for conflicts in plans, since there are none, adds the Tour object, returns true 


(a) Write the TravelPlan constructor. 

**Class information for this question**

```java
public class Tour 
private int act Date
private int startTime 
private int endTime 
private string activity 

Tour (int actDate,int startTime, int endTime, String activity)
public int getActDate() 
public int getStartTime()
public int getEndTime() 
public String getActivity() 

public class TravelPlan
private String destination;  
private Arrayliist<Tour> plans; 

public TravelPlan (String destination) 
public boolean checkForConflicts(Tour t) 
public boolean addTour(Tourt t) 
```

(b) Write the TravelPlan checkForConflicts method. 

(c) Write the TravelPlan addTour method.

[Table of Contents](#table-of-contents)

### Question 4
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

[Table of Contents](#table-of-contents)

---

<div>
<center><h2>STOP</h2></center> 

<center><h2>END OF EXAM</h2></center>
<hr> 
</div>