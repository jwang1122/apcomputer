# AP Computer Sicence Section II

Time&#x2501;1 hour and 30 minutes 

Number of Questions&#x2501;4

percent of Total Grade&#x2501;50% 

Directions: SHOW ALL YOUR WORK. REMEMBER THAT PROGRAM SEGMENTS ARE TO BE WRITTEN IN JAVA™ 

## FREE-RESPONSE QUESTIONS
1. This question involves the implementation of a simulation rolling two dice. A client program will specify the number of rolls of the sample size and the number of faces on each of the two dice. A method will return the percentage of times the roll results in a double. Double in this case means when two dice match or have the same value (not a data type). 

You will write two of the methods in this class. 
```java
publicclass DiceSimulation { 
	/** Sample size of simulation */ 
	private int numSampleSize; 

	/** Number of faces on the die */
	private int numFaces;

	/** Constructs a Dicesimulation where sampleSize is the number of rolls to be simulated and faces is the number of faces on the die (some die have many more or less than 6 faces)  
	*/
	public Dicesimulation(int numSamples, int faces) { 
		numSamp1eSize = numSamples; 
		numFaces= faces; 
	}

	/** Returns an integer from 1 to the number of faces to simulate a die roll */ 
	public int roll() { 
		implemented in part (a)
	}

	/** simulates rolling two die with the number faces given, for the number of sample size rolls. Returns the percentage of matches that were rolled 
	as an integer (eg. 0-$0 would be 50) 
	*/
	public int runSimlation(){
		implemented in part(b) 
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
```java
Class information for this question 

public class Dicesimulation 
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

Statementsand Expressions |Value Returned |Comment 
|---|---|---|
CalorieCount sunday= new CalorieCount(1500); | |Creates an instance with a 1500 calorie limit
sunday.addMeal(716,38,38,45) ||Adds 716 calories, 38 grams protein. 8 grams of carbs, 45 grams of fat to the appropriate in stance fields 
sunday.addMeal(230,16,8,16) ||Adds 230 calories, 16 grams protein. 8 grams of carbs, 16 grams of fat to the appropriate in stance fields
sunday.addMeal(568,38,50,24) ||Adds 568 calories, 38 grams protein. 50 grams of carbs, 24 grams of fat to the appropriate in stance fields
onTrack() |False |Returns true if calorie intake does not exceed calorie limit 
getProteinPercentage() |.24 | Multiplies grams of protein by 4 then divides by calorie intak 

Write the entire CalorieCount class. Your implementation must meet all specifications and conform to all examples. 