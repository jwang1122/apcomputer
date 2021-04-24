5. This question involves the implementation of a simulation rolling two dice. A client program will specify the number of rolls of the sample size and the number of faces on each of the two dice. A method will return the percentage of times the roll results in a double. Double in this case means when two dice match or have the same value (not a data type). 

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

