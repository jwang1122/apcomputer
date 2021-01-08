# AP Computer Sicence Section II

1. implement the DiceSimulation class, replace ... with your code.
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
